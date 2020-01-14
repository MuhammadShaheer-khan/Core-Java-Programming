/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		/* Variables (/*) ignore multi lines
		how to declare Variables
		syntex <datatype> <variable> = <input>; */
		int a = 12;
		System.out.println(a);
		
		// use doubble "" in java string 
		String name = "SHAHeeRKhan";
		System.out.println(name);
		
		// float datatpye require f in the end of variable
		float b = 12.30f;
		System.out.println(b);
		
		/*
		Rules for constructing name of Variables:
		1. Variable name can contains digits,underscore,dollar sign,latters
		2. Shaheer and shaheer are different Variables
		3. should not contains witespace
		4. you can't use reserved keywords in java
		*/
		/*
		Two types of java datatpye:
		1.primitive(defined datatype)  = byte(1 byte) ,short(2 byte) ,int(4 byte) ,long(8 bytes) , float(4 bytes),
		doubble(8 bytes) ,boolean(1 bit) ,char(2 byte)
		2.Non primitive OR reference data types (Non defined datatype)
		*/
		// range of byte  -128 to 127
		byte z = 56;
		double d = 46.741258d;
		char grade = 'A';
		System.out.println(grade);
		
		/* Operators in java
		    
		   syntex = operand , Operator , operand = result
		            10           +          5    =   15
		   
		   Types of operators:
		   
		   1. Arithmetic operators      (+, -, *, /, %)
		   2. Assignment operators      (=)
		   3. Logical operators         (&& - both conditions are true, || - any one cond is true, !)
		   4. Comperision operators     (==, !=, <, >, <=, >=)
		*/
		   
		   int num1 = 45, num2 = 40;
		   // System.out.print is show output in one line
		   // println add new line
		   System.out.print("The value of num1 opr num2 is ");
		   System.out.println(num1 + num2);
		   System.out.println(num1 / num2);
		   System.out.println(num1 - num2);
		   
		   
		   System.out.print("Arthmetic operators advance code :");
		   // print 45 and than add 1
		   System.out.println(num1++);
		   // add 1 than print its value
		   System.out.println(++num1);
		   // subtract 1 than print its value 
		   System.out.println(--num1);
		   System.out.println(num1--);
		   System.out.println(num1);
		   System.out.println(num1+10);
		   
		   
		   // Taking user input in java
		   // system.in takes input by keyboard
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter Input: ");
		   // here if i code only next() than program stop after first witespace of input
		   String input = scan.nextLine();
		   System.out.println(input);
		   
		
		
	}
}


