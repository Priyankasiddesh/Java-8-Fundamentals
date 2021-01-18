import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class DequeHashSetProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            
            if(deque.size()==m+1)
            {
                
                int q=(int)deque.remove();
                if(!deque.contains(q))
                set.remove(q);
            }
            max = Math.max(set.size(), max);
           
        }
        System.out.println(max);
    }
}
