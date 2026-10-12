class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,Integer> chara = new HashMap<>();
        HashMap<String,Integer> word = new HashMap<>();
        String [] arr = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String sa = arr[i];
            chara.putIfAbsent(c,i);
            word.putIfAbsent(sa,i);
            if(!chara.get(c).equals(word.get(sa))) return false;

        }
        return true;

        
    }
}