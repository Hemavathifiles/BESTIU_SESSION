package org.tns.capgemini.c2tc.oops;
class Human
{
	 int age;
	 String name;
}
public class BeforeEncapsulation {

	public static void main(String[] args) {
		Human obj= new Human();
		obj.age=22;
		obj.name="Navin";
		System.out.println(obj.age);
		System.out.println(obj.name);

	}

}
