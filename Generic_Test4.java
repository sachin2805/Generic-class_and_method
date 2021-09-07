package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Student5<T>{
	private T o;

	Student5 (T o)
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
   void printArrayList()
   {
	   System.out.println("");
   }

}
public class Generic_Test4 {
	public static void main(String[] args) {
		
		List<Student5> l=new ArrayList<Student5>();
		
		l.add(new Student5<String>("List")); // Strict Defined
		l.add(new Student5<Integer>(100)); //Specify the data type
		l.add(0, new Student5<>("Collection"));
		l.add(new Student5<>("Using Iterator"));
		
	
		//l.remove(index)---> For remove from list OR l.remove("List") -------> Used for remove
		Iterator<Student5> iterator = l.iterator();
		
		while (iterator.hasNext()) {
	System.out.println("Name: " + iterator.next().getO());
	}
	
/*		
		//---------USING ListItorator----------------
	ListIterator<Student5> iterator = l.listIterator();
	
	while (iterator.hasNext()) {
		System.out.println("NAME : " + iterator.next().getO());
	}
*/
	
	

}
}

/*OUTPUT
 * Name: Collection
Name: List
Name: 100
Name: Using Iterator
*/
