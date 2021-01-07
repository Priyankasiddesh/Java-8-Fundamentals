import java.util.*;
class Student1 implements Comparable<Student1>{
	int rollno;
	String name;
	int age;
	public Student1(int rollno,String name,int age) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student1 st) {
		if(age==st.age){
			return 0;
		}
		else if(age>st.age) {
			return 1;
			
		}
		else return -1;
	}
}
public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<Student1> al=new ArrayList<Student1>();
		al.add(new Student1(101,"amit",27));
		al.add(new Student1(102,"amar",23));
		al.add(new Student1(106,"sourav",21));
		Collections.sort(al);
		for(Student1 s:al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}

	}

}
