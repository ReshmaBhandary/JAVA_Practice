package mcq.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestInterview {
	static String str="";

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			// list.add("C");
		}

		Map<String, String> map = new HashMap<>();
		map.put(new String("a"), "Audi");
		map.put(new String("a"), "Ferari");

		System.out.println(map);
		System.out.println("***************************hash code return 1********************************");

		hashCodeReturn1();

		System.out.println("***************************equals return true*******************************");

		equalsReturntrue();

		System.out.println("***************************hash code return hashcode********************************");

		hashcodeReturnHashcode();

		System.out.println(
				"***************************hash code return 1 with equals return true********************************");

		hashCodeReturn1withEqualsTrue();
		System.out.println("*******************************************************");
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		// m1(list1);
		exception();

	}

	private static void exception() {
try {
	str +="a";
	throw new Exception();
	
}catch(Exception ex) {
	str +="b";
}finally {
	str +="c";
	//method();
	str +="d";
	
}
System.out.println(str);
	}

	private static void method() {
		throw new NullPointerException();
	}

	static void m1(List<? super Double> list1) {
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));

	}

	private static void hashCodeReturn1withEqualsTrue() {
		Map<Employee2, String> mp3 = new HashMap<>();
		mp3.put(new Employee2("a"), "emp1");
		mp3.put(new Employee2("b"), "emp2");
		mp3.put(new Employee2("a"), "emp1 override");
		System.out.println(mp3.size());
		System.out.println(mp3.get(new Employee2("a")));
	}

	private static void hashcodeReturnHashcode() {
		Map<Employee1, String> mp1 = new HashMap<>();
		mp1.put(new Employee1("a"), "emp1");
		mp1.put(new Employee1("b"), "emp2");
		mp1.put(new Employee1("a"), "emp1 override");
		System.out.println(mp1.size());
		System.out.println(mp1.get(new Employee1("a")));
	}

	private static void equalsReturntrue() {
		Map<Employee0, String> mp0 = new HashMap<>();
		mp0.put(new Employee0("a"), "emp1");
		mp0.put(new Employee0("b"), "emp2");
		mp0.put(new Employee0("a"), "emp1 override");
		System.out.println(mp0.size());
		System.out.println(mp0.get(new Employee0("a")));
	}

	private static void hashCodeReturn1() {
		Map<Employee, String> mp = new HashMap<>();
		mp.put(new Employee("a"), "emp1");
		mp.put(new Employee("b"), "emp2");
		mp.put(new Employee("a"), "emp1 override");
		System.out.println(mp.size());
		System.out.println(mp.get(new Employee("a")));
	}

}

class Employee0 {
	private String name;

	public Employee0(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

}

class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 1;
	}
}

class Employee1 {
	private String name;

	public Employee1(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return (this.name == null ? 0 : this.name.hashCode());

	}
}

class Employee2 {
	private String name;

	public Employee2(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

}
