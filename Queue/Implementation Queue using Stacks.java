class MyQueue {

    Stack<Integer> s1= new Stack<>();
    Stack<Integer> s2= new Stack<>();

    public MyQueue() {

       

        s1 = new Stack<>();
        s2 = new Stack<>();
        
    }
    
    public void push(int x) {

        while(!s1.empty()){
            s2.push(s1.pop());
            }  
        s1.push(x);

        while(!s2.empty()){
            s1.push(s2.pop());
            }       
    }
    
    public int pop() {
      if(empty()){
        return -1;
      } 

      return s1.pop(); 
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.empty();
        
    }
}
