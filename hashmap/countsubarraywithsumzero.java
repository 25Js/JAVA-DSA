package hashmap;
import java.util.*;
public class countsubarraywithsumzero {
    public static void main(String[] args) {
        int a[]={1,4,5,9,3,3,2};
        HashMap<Integer,Integer> h= new HashMap<>();
        h.put(0,1);
        int c=0;
        int k=5;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(h.containsKey(sum-k)){
                c+=h.get(sum-k);
            }
            h.put(sum, h.getOrDefault(sum,0)+1);

        }
        System.out.println(c);
    }
}
