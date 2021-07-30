class Solution {
    public String minWindow(String s, String t) {
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


 // while(j<i){
                    //     char temp = s.charAt(j);
                    //     j++;
                    //     System.out.println(temp);
                    //     if(map.containsKey(temp)){
                    //         int d = map.get(temp);
                    //         if(d<0){
                    //             d++;
                    //             map.put(temp, d);
                    //         }
                    //         else{
                    //             count++;
                    //             d++;
                    //             map.put(temp, d);
                    //         }
                    //         if(count == 0){
                    //             if(res == ""){
                    //                 res = s.substring(j,i+1);
                    //             }
                    //             else{
                    //                 if(i-j+1 < res.length()){
                    //                     res = s.substring(j,i+1);
                    //                 }
                    //             }
                    //         }
                    //         if(count > 0){
                    //             // j++;
                    //             break;
                    //         }
                    //     }
                    //     else if(!map.containsKey(temp)){
                    //         // j++;
                    //         continue;
                    //     }
                    // }