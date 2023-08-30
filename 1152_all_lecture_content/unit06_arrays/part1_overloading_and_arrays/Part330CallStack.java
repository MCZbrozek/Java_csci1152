/*
When a method is called, a STACK FRAME is
PUSHED on the CALL STACK.
A stack frame usually stores:
	- Local variables
	- Arguments passed into the method
	- Information about the caller's stack frame
	- The return address—what the program should do after the function returns (i.e.: where it should "return to"). This is usually somewhere in the middle of the caller's code.
https://www.interviewcake.com/concept/java/call-stack

The call stack grows from bottom to top, but 
exceptions propagate from top to bottom:
https://www.decodejava.com/exception-propagation-in-java.htm

The following program was inspired by this site:
https://www.tutorialkart.com/java/java-call-stack/
*/
public class Part330CallStack
{

	public static void main(String[] args) {
		int b=0;
		Part330CallStack demo = new Part330CallStack();
		demo.method1(b);
		System.out.println("End of main");
	}
  
	public void method1(int b){
		System.out.println("In method1. Value recieved : "+b);

		//Uncommenting the following line triggers
		//the exception EVEN earlier. Note how the
		//exception differs.
		//int a = 7/b;

		method2(b);
	}
  
	public void method2(int b){
		System.out.println("In method2. Value recieved : "+b);

		//Uncommenting the following line triggers
		//the exception earlier. Note how the
		//exception differs.
		//int a = 7/b;

		method3();
	}
  
	public void method3(){
		System.out.println("In method3");
		//This divide by zero triggers an exception
		int a = 7/0;
	}
}
