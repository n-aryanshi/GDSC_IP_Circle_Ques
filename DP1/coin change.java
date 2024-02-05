class Duoo{
    int currSum;
    int level;
    Duoo(int currSum , int level){
        this.currSum =currSum;
        this.level=level;
    }

}
class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0)return 0;
        int [] dist = new int[10001];
        Arrays.fill(dist , Integer.MAX_VALUE);

        Queue<Duoo> queue= new LinkedList<>();
        queue.add(new Duoo(0 , 0));

        while(!queue.isEmpty()){
            Duoo duo = queue.poll();
            int currSum=duo.currSum;
            int level=duo.level;

            for(int ele : coins){
                int temp = ele+currSum;
                if(temp>amount) continue;
                if(temp==amount) return level+1;
                if(level+1 < dist[temp]) {
                    dist[temp]=level+1;
                    queue.add(new Duoo(temp , level+1));
                }
            }
        }

        return -1;
    }
}
