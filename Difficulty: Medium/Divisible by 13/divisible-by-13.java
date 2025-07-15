class Solution {
    public boolean divby13(String s) {
        // code here
        int mod = 0;
        
        for(int i=0; i<s.length(); i++){
            int num = s.charAt(i) - '0';
            
            mod = (mod * 10 + num ) % 13;
        }
        
        return mod == 0;
    }
}