class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int num:map.keySet()){
            if(n/3<map.get(num)){
                ans.add(num);
            }
        }
        return ans;
    }
}