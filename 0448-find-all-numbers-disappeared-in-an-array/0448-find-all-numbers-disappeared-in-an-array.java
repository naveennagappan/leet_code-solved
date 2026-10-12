class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet <Integer> n  = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            n.add(nums[i]);
        }
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!n.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}