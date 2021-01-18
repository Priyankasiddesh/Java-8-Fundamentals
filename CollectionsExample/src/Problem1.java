import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner s=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
        }
        int q=s.nextInt();
        for(int j=0;j<q;j++){
             String s1 = s.next();
            if(s1.equals("Insert"))
            {
                int pos = s.nextInt();
                int val = s.nextInt();
                list.add(pos,val);
            }
            else
            {
                int pos = s.nextInt();
                list.remove(pos);
            }
        }
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}