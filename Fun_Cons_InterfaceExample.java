package Shinde;

import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Person{
	String name;
	int age;
	public Person(int age) {
		super();
		this.age = age;
	}
}

public class Fun_Cons_InterfaceExample {
	static void printName(String name) {
		System.out.println("HELLO "+name);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Check Driving eligibility of Person");
		
		Function<Person, String>f1=p ->{
			String result=null;
			if (p.age>=18 && p.age<=70) 
				result="You are eligible to drive vehicle";
				else 
					result="You age is not eligible to drive";
				
				return result;
			
		};
		Consumer<String>c1=Fun_Cons_InterfaceExample::printName;
		System.out.println("Enter the Name");
		String name=sc.next();
		c1.accept(name);
		System.out.println("Enter age");
		int age=sc.nextInt();
		Person p1=new Person(age);
		String result=f1.apply(p1);
		System.out.println("Result is -->"+result);
		sc.close();
		
		
	}

}
