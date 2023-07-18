class Solution {
    public int longestPalindrome(String s) {
     int [] charcount=new int[256];
     int res=0;
     for (int i=0;i<s.length();i++){
         charcount[s.charAt(i)]++;
 } 
     int oddcharcount=0;
     for(int j=0;j<256;j++){
         if(charcount[j]%2!=0){
             oddcharcount++;
         }
     }  
     return oddcharcount == 0? s.length():s.length()-oddcharcount+1;
    }
}