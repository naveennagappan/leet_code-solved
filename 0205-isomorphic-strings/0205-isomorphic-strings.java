class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char orginal = s.charAt(i);
            char replace = t.charAt(i);
            if(!map.containsKey(orginal)){
                if(!map.containsValue(replace)){
                    map.put(orginal,replace);
                }else{
                    return false;
                }  
            }
            else{
                    if(map.get(orginal)!=replace){
                        return false;
                    }
                }
        }
        return true;
        
    }
}