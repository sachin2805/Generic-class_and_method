package generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Student<T>{
	private T o;

	Student (T o)
	{
		this.o=o;
	}
	
	public T getO() {
		return o;
	}


	@Override
	public String toString() {
		return "" + o ;
	}


}
public class Generic_Test3 {

	public static void main(String[] args) {
	
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(new Student<>(10));
		al.add(new Student<>("Sachin"));
		al.add(new Student<>('A'));
		al.add(new Student<>("BE"));
		
		for(Student s: al)
			System.out.println(s);
		
		System.out.println("-------------------------------");
		LinkedList<Student> ll=new LinkedList<Student>();
		
		ll.add(new Student<String>("Sachin")); //Strict Defined  
		ll.add(new Student(102));
		ll.add(1,new Student('S')); // pass with index
		
		for(Student s: ll)
			System.out.println(s);
		
		ll.remove(new Student('S'));

		System.out.println("\nAfter Removing :");
		for(Student s: ll)
			System.out.println(s);
		
		System.out.println("-------------------------------");
		List<Student> l=new ArrayList<Student>();
		
		l.add(new Student<String>("List"));
		l.add(new Student<Integer>(100)); //Specify the data type
		l.add(0, new Student<>("Collection"));
		
		for(Student s: l)
			System.out.println(s);
		System.out.println("-------------------------------");
		
	}

}
/*OUTPUT
10
Sachin
A
BE
-------------------------------
Sachin
S
102

After Removing :
Sachin
S
102
-------------------------------
Collection
List
100
-------------------------------
*/
