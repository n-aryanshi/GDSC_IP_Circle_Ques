class DataStream {

    Queue<Integer> q;
    int value,k;

    public DataStream(int value, int k) {
        q=new LinkedList<>();
        this.value=value;
        this.k=k;  
    }
    
    public boolean consec(int num) {
        return check(num);   
    }
     boolean check(int num)
    {
        if(num==value)
            q.add(num);
        else
            q=new LinkedList<>(); 
             
        return q.size()>=k;
        
    }
}
