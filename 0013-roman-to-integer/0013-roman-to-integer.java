class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int current=map.get(s.charAt(i));
            //current vanthu chinnatha irukanum previous vo da na subtract pannaum
            if(current<prev){
                sum=sum-current;
            }
            else{
                sum=sum+current;
            }
            prev=current;
        }
     return sum;
    }
}