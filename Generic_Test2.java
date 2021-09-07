//--------------- Generic Class 2 == by Generic Type-------------
package generic;
class Data1<T>{
	private T o;

	Data1(T o)
	{
		this.o=o;
	}
	
	public T getO() {
		return o;
	}


	@Override
	public String toString() {
		return "Object = " + o ;
	}
	 void show()
	   {
		   System.out.println("---------> "+o);
	   }

}

/*
 -----For passing Two (Generic)different Argument---------
 class Student5<K,V>
{
	private K k;
	private V v;
	
	Student5(K k, V v)
	{
		this.k=k;
		this.v=v;
	}

	public K getK() {
		return k;
	}

	public V getV() {
		return v;
	}
	@Override
	public String toString() {
		return "Key :" + k + " Value : "+v;
	}
	
	
}
*/

public class Generic_Test2 {

	public static void main(String[] args) {
		
		Data1 d = new Data1("Sachin");
		
		Data1 d1 = new Data1(new Data1("It is Generic class"));  //U can pass any type of object
		
		Data1 d2 = new Data1(102);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		
		d.show();
		d1.show();
	}

}

/*OUTPUT
Object = Sachin
Object = Object = It is Generic class
Object = 102
---------> Sachin
---------> Object = It is Generic class

*/