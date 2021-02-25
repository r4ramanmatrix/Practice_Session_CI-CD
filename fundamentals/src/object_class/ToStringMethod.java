package object_class;

import java.util.ArrayList;

public class ToStringMethod {

	String name;
	int age;

	public ToStringMethod(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override

	public String toString() {
		return name + " " + age;

	}

	public static void main(String[] args) {
		ToStringMethod obj1 = new ToStringMethod("Raman", 30);
		ToStringMethod obj2 = new ToStringMethod("Raman2", 31);
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);

		String s = new String("ABc");
		System.out.println(s);

		Integer i = new Integer(100);
		System.out.println(i);

		ArrayList al = new ArrayList<>();
		al.add(20);
		al.add('a');
		System.out.println(al);
		ToStringMethod obj3 = new ToStringMethod("a", 10);
		System.out.println(obj3);
	}

}
