import java.util.*;

import com.arrays.Employee;

public class AmbigutyTest {
	 String args[] = { "1", "2" };

	public static void main(String[] args) {
		
		
		
		boolean a=false;
		if(a=true)
			System.out.println("true");
		else
			System.out.println(false);
		char c='A';
		char c1='A';
		System.out.println(c==c1);
		String name="reshma";
		String aa1=name.substring(0, 0);
		System.out.println(aa1);
		int[] arg= {1,2,3,4,5};
		System.out.println(arg[1] + arg[2] + arg[3]);
		
		System.out.println(1 + 2+"reshma"+2+3);
		
		 if (args.length > 0)
	            System.out.println(args.length);
		Employee emp=new Employee("res", 123);
		System.out.println(emp);
		changes(emp);
		
		System.out.println(emp);
		
		
		
		
		
		
		 for (int index = 0; index<10; index++) {
	            System.out.println("Welcome");
	            break;
	        }
		
		AmbigutyTest aa=new AmbigutyTest();
		Object o = null;
		aa.add(o);
	}
	
	private static void changes(Employee emp) {
		emp.setEmpInt(1111);
		emp=null;
		
	}

	public void add(Object a) {
		System.out.println("Object add");
		return ;
		
	}
	public void add(String a) {
		System.out.println("String add");
		return ;
		
	}
	public void add(Integer a) {
		System.out.println("Integer add");
		return ;
		
	}
	/* public void add(List<Double> a) {
		System.out.println("List<Double> add");
		return ;
		
	}
*/
}
