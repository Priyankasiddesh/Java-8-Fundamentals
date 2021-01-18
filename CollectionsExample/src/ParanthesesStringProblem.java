import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class ParanthesesStringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(isBalancedString(input,map)?"true":"false");
		}
        sc.close();
    }
		public static boolean isBalancedString(String s,HashMap<Character,Character> map){
            if(s.length()%2!=0){
                return false;
            }
           ArrayDeque<Character> ad=new ArrayDeque<Character>();
           for(int i=0;i<s.length();i++){
               Character c=s.charAt(i);
               if(map.containsKey(c)){
                   ad.push(c);
               }
               else if(ad.isEmpty()||c!=map.get(ad.pop())){
                   return false;
               }
           }
           return true;
        }
	
}