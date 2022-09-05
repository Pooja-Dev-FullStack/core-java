package com.spec.oopsjava_Encapsulation;

public class CheckInsideSamePkgMain {

	public static void main(String[] args) {
		ConceptOfGetterSetter obj = new ConceptOfGetterSetter(4, 4.5, "Rai",5, "Pooja", 5.5);
		
		System.out.println("This is public data member "+ obj.pub_number);
		System.out.println("This is public data member "+ obj.pub_name);
		System.out.println("This is public data member "+ obj.pub_balance);

        //System.out.print("This is public data member"+ obj.pvt_name);
		//Here, pvt_name is a private data member of class ConceptOfGetterSetter. Since, we are using OOPS concept of Data Hiding
		//I marked some members as private so it cannot be used by other classes as well even though being in same package.
		
		// To access the private data members we have 2 options:-
		// 1. to change the scope of data member/variable from private to any other access modifier - public, default, protected.
	          //[changing visibility of "pub_number" to package] - Editor suggestion
		// 2. to create getter and setter for private variable
		
		System.out.println("This is private data member "+ obj.getPvt_number());
		System.out.println("This is private data member "+ obj.getPvt_name());
		System.out.println("This is private data member "+ obj.getPvt_balance());

	}
}
