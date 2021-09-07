//--------------- Generic Class 1 == by Object-------------
package generic;
class Data{
	private Object o;

	Data(Object o)
	{
		this.o=o;
	}
	
	public Object getO() {
		return o;
	}


	@Override
	public String toString() {
		return "Object = " + o ;
	}
  

}
public class Generic_test {

	public static void main(String[] args) {
		
		Object d = new Data("Sachin");
		Object d1 = new Data(new Exception());
		Object d2 = new Data(10);
		Object d3 = new Data(new Data('A'));
		System.out.println(d);
	
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);


	}

}
/*OUTPUT
 * Object = Sachin
Object = java.lang.Exception
Object = 10
Object = Object = A
*/
