class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        
        for(int i=0 ;i<n-2 ;i++){
            for(int j=i+1 ;j<n-1; j++){
                for(int k =j+1 ; k<n ;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = Arrays.asList(nums[i] , nums[j] , nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> list : set){
            res.add(list);
        }
        return res;

       
    }
}
