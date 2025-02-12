package Basics;

public class MethodsCallingItself {

//	public int addition(int a2, int b2) {

//		int c = a2 + b2;
//		
//		return addition(a2, b2);
//	}
//	
//	public static void main(String[] args) {
//		// TODpublic int addition() {
//		MethodsCalling obj1 = new MethodsCalling();
//		
//		int a = 2;
//		int b = 3;
//		
//		obj1.addition(a, b);
		
	

	    // Recursive function to add two numbers
	    public int addition(int a, int b) {
	        // Base condition: When b is 0, return a
	        if (b == 0) {
	            return a;
	        }
	        // Recursive call: Increase a and decrease b
	        return addition(a + 1, b - 1);
	    }

	    public static void main(String[] args) {
	        MethodsCallingItself obj = new MethodsCallingItself();

	        int a = 2;
	        int b = 3;

	        int result = obj.addition(a, b);
	        System.out.println("Addition result: " + result);  // Output: 5
	    }
	
}


