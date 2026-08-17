class Solution {
    public boolean isPalindrome(int x) {
        int lastdigit;
        int rev=0;
        int temp=x;
        if(0>x){
            return false;
        }
        while(x>0){
            lastdigit=x%10;
            rev=(rev*10)+lastdigit;
            x=x/10;
        }
        return (temp==rev);
        
    }
}