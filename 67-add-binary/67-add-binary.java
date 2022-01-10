class Solution {
    public String addBinary(String a, String b) {
        // int al = a.length();
        // int bl = b.length();
        // StringBuilder sb = new StringBuilder();
        // int c = 0;
        // int i=  al-1;
        // int j = bl-1;
        // while(i>=0 && j>=0){
        //     char ac = a.charAt(i);
        //     char bc = b.charAt(j);
        //     i--;
        //     j--;
        //     if(ac == '0' && bc == '0'){
        //         if(c==0){
        //             sb.append("0");
        //         }
        //         else{
        //             sb.append("1");
        //             c=0;
        //         }
        //     }
        //     else if((ac == '0' && bc == '1') || (ac == '1' && bc == '0')){
        //         if(c==0){
        //             sb.append("1");
        //         }
        //         else{
        //             sb.append("0");
        //             c=1;
        //         }
        //     }
        //     else if(ac == '1' && bc == '1'){
        //         if(c==0){
        //             sb.append("0");
        //             c = 1;
        //         }
        //         else{
        //             sb.append("1");
        //             c = 1;
        //         }
        //     }
        // }
        // while(i>=0){
        //     char ac = a.charAt(i);
        //     i--;
        //     if(ac=='1'){
        //         if(c==0){
        //             sb.append("1");
        //         }
        //         else{
        //             sb.append("0");
        //             c=1;
        //         }
        //     }
        //     else if(ac == '0'){
        //         if(c==0){
        //             sb.append("0");
        //         }
        //         else{
        //             sb.append("1");
        //             c=0;
        //         }
        //     }
        // }while(j>=0){
        //     char ac = b.charAt(j);
        //     j--;
        //     if(ac=='1'){
        //         if(c==0){
        //             sb.append("1");
        //         }
        //         else{
        //             sb.append("0");
        //             c=1;
        //         }
        //     }
        //     else if(ac == '0'){
        //         if(c==0){
        //             sb.append("0");
        //         }
        //         else{
        //             sb.append("1");
        //             c=0;
        //         }
        //     }
        // }
        // if(c==1){
        //     sb.append("1");
        // }
        // return sb.reverse().toString();
        
        
        
         int lena = a.length();
        int lenb = b.length();
        
        if (lena < lenb) {
            return addBinary(b, a);
        }
        
        int i = lena - 1;
        int j = lenb - 1;
        StringBuilder sb = new StringBuilder();

        char carry = '0';
        while (i >= 0 && j >= 0) {
            char A = a.charAt(i);
            i -= 1;
            
            char B = b.charAt(j);
            j -= 1;

            if (A == '1' && B == '1') {
                sb.append(carry == '1' ? '1' : '0');
                carry = '1';
            } else if (A == '1' || B == '1') {
                sb.append(carry == '1' ? '0' : '1');                
            } else if (carry == '1'){
                sb.append('1');
                carry = '0';
            }
            else {
                sb.append('0');
            }
        }
        
        while (i >= 0) {
            char A = a.charAt(i);
            i -= 1;

            if (A == '1') {
                sb.append(carry == '1' ? '0' : '1');
            } else if (carry == '1') {
                sb.append('1');
                carry = '0';
            } else {
                sb.append('0');
            }
        }
        if (carry == '1') {

            sb.append('1');
        }
        
        return sb.reverse().toString();
        
    }
}