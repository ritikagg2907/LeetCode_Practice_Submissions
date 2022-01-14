class Solution {
    public String minWindow(String s, String t) {
        
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(char c : t.toCharArray()){
        //     map.put(c, map.getOrDefault(c,0)+1);
        // }
        // int var = map.size();
        // int i = 0;
        // int j = 0;
        // String res = "";
        // while(j<s.length()){
        //     char c = s.charAt(j);
        //     j++;
        //     if(map.containsKey(c)){
        //         int f = map.get(c);
        //         if(f==1){
        //             var--; 
        //         }
        //         f--;
        //         map.put(c,f);
        //         while(var == 0 && i < j){
        //             if(res == ""){
        //                 res = s.substring(i,j);
        //             }
        //             else{
        //                 String str = s.substring(i,j);
        //                 if(str.length() < res.length()){
        //                     res = str;
        //                 }
        //             }
        //             char cc = s.charAt(i);
        //             i++;
        //             if(map.containsKey(cc)){
        //                 int ff = map.get(cc);
        //                 if(ff < 0){
        //                     ff++;
        //                     map.put(cc, ff);
        //                 }
        //                 else{
        //                     ff++;
        //                     map.put(cc, ff);
        //                     var++;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return res;
        
        
        
        
        
        String res = "";
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0;int j=0;
        
        for(int k=0; k<t.length(); k++){
            char c = t.charAt(k);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        int count = map.size();
        
        while(i<s.length()){
            char c = s.charAt(i);
            i++;
            if(map.containsKey(c)){
                int a = map.get(c);
                if(a==1){
                    count--;
                }
                a--;
                map.put(c,a);
                
                if(count > 0){
                    continue;
                }
                
                while(count == 0 && j<i){
                    if(res == ""){
                        res = s.substring(j,i);
                    }
                    else{
                        if(i-j < res.length()){
                            res = s.substring(j,i);
                        }
                    }
                    char temp = s.charAt(j);
                    
                    if(map.containsKey(temp)){
                        int d = map.get(temp);
                        if(d<0){
                            d++;
                            map.put(temp, d);
                        }
                        else{
                            count++;             
                            d++;
                            map.put(temp, d);
                        }
                    }
                    
                    j++;
                }
                
            }
        }
        return res;
    }
}