class Solution {
    public String largestOddNumber(String num) {
      //starting point
      int start=0;
      while(start<num.length()&&num.charAt(start)=='0'){
        start++;
      }
      int end=-1;
      for(int i=num.length()-1;i>=0;i--){
        int ld=num.charAt(i)-'0';
        if(ld%2==1){
            end=i;
            break;
        }
      }
      if (end == -1) {
      return "";
      }
      return num.substring(start,end+1);
    }
}