class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0 ;i< nums1.length ;i++){
            map.put(nums1[i] , i);
        }
        int[]result = new int[nums1.length];
        Arrays.fill(result ,-1);

        int[] nextG =nextGreater(nums2);
        for(int i=0 ;i<nextG.length ;i++){
            int ele = nums2[i];
            int nextGreater = nextG[i];
            
            if(map.containsKey(ele)) {
                int index = map.get(ele);
                result[index] = nextGreater;
            }
        }

        return result;
    }
    public int[] nextGreater(int []nums){
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=nums.length-1 ;i>=0 ;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i] ) stack.pop();

            if(stack.isEmpty()) res[i]=-1;
            else res[i] =stack.peek();

            stack.push(nums[i]);
        }
        return res;
    }
}
