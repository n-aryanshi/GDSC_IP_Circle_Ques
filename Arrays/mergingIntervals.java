class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            List<List<Integer>> ans=new ArrayList<>();
            int n = intervals.length;
            for(int i=0; i<n ; i++){            
                if((ans.size()==0) || intervals[i][0]>ans.get(ans.size()-1).get(1) ){
                    int start = intervals[i][0];
                    int end = intervals[i][1];

                    //creating list of (start,end)
                    List<Integer> temp= new ArrayList<>();
                    temp.add(start);
                    temp.add(end);

                    ans.add(temp);
                }
                else{
                        ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
                    }
                }
                int[][] resultArray = new int[ans.size()][2];
      
                for (int i = 0; i < ans.size(); i++) {
                    resultArray[i][0] = ans.get(i).get(0);
                    resultArray[i][1] = ans.get(i).get(1);
                }
                         return resultArray;        
    }
}
