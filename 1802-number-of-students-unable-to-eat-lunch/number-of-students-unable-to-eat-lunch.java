class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count=0;
        Queue<Integer>que=new LinkedList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=sandwiches.length-1;i>=0;i--){
             st.push(sandwiches[i]);
        }
         for(int i=0;i<students.length;i++){
            que.add(students[i]);
         }
         while(!que.isEmpty())
         {
         if(que.peek()==st.peek())
         {
            st.pop();
            que.poll();
            count=0;
         }
         else{
            que.add(que.poll());
            count++;
            if(count==que.size()){
                return count;
            }
         }
         }
         return que.size();
    }
}