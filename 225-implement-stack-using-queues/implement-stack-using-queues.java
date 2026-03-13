class MyStack {
    private Queue<Integer>que1;
    private Queue<Integer>que2;
    public MyStack() {
        que1=new LinkedList<>();
        que2=new LinkedList<>();
    }
    public void push(int x) {
        que1.offer(x);
        while(!que2.isEmpty()){
        que1.offer(que2.poll());
        }
        Queue<Integer>temp=que1;
        temp = que2;
        que2 = que1;
        que1 = temp;
    }
    public int pop() {
        if(que2.isEmpty()){
            return -1;
        }
        return que2.poll();
    }
    public int top() {
        if(que2.isEmpty()){
            return -1;
        }
        return que2.peek();
    }
    public boolean empty() {
        return que2.isEmpty();
    }
}