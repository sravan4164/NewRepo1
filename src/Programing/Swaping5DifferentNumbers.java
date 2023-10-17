package Programing;

public class Swaping5DifferentNumbers {
 public static void main(String[] args) {
	int a=10, b=20;
	 System.out.println("Before Swaping the vale of a is "+a+"  b is :"+b);
	 
	 System.out.println();
	 
	 // Logic-1 using third Variable
	
	 /* int t=a;
	 a=b;
	 b=t;
	 System.out.println("Afetr Swaping the vale of a is "+a+"  b is :"+b);
	 */
	 
	 
	/* System.out.println();
	 
	 //Logic -2 Using Addition and Subtraction with out USing Third variable
	 a=a+b; // 10+20=30
	 b=a-b; //30-20=10
	 a=a-b;	//30-10=20
	 System.out.println("Afetr Swaping the vale of a is "+a+"  b is :"+b);
	 */
	 
	 
	 /* Logic-3 Using * and / Without using third avriable
	 a=a*b; //10*20=200 
	 b=a/b;	//200/20=10
	 a=a/b;	//200/10=20
	 System.out.println("Afetr Swaping the vale of a is "+a+"  b is :"+b);
	 */
	 
	 /*logic-4 Using Xor(^)
	 a=a^b;
	 b=a^b;
	 a=a^b;
	 System.out.println("Afetr Swaping the vale of a is :"+a+"  b is :"+b);
	 */
	 
	 //Logic-5 using single statment
	 b=a+b-(a=b);
	 System.out.println("Afetr Swaping the vale of a is :"+a+"  b is :"+b);
	 
	 
	 
	 
	 
}
}
