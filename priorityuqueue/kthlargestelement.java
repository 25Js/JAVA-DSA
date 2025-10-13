package priorityuqueue;

import java.util.PriorityQueue;

public class kthlargestelement {
    public static void main(String[] args) {
       int a[]={1,4,6,3,7};
       int k=4;
      PriorityQueue<Integer> p= new PriorityQueue<>();
      for(int i=0;i<a.length;i++){
        p.add(a[i]);
        if(p.size()>k){
            p.poll();
        }
      }
      System.out.println(p.peek());
    }
}
