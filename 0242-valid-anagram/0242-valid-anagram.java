class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()==0 && t.length()==0)
        return true;
        if(s.length()!=t.length())
            return false;
        int s1[]=new int[27];
        for(char c:s.toCharArray()){
            s1[c-'a']++;
        }
        for(char c:t.toCharArray()){
            s1[c-'a']--;
        }
        for(int i=0;i<27;i++){
            if(s1[i]!=0){
                return false;
            }
        }
            return true;
        }
        }
   