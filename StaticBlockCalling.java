package Basics;

public class StaticBlockCalling {

	static {
		System.out.println("This is static block");
		
		{
			System.out.println("This is Instance block inside Static block");
		}
	}
	
	
//	----------------------------------------------------------------------------------
	{
		System.out.println("This is Instance block");
		
		{
			System.out.println("This is Instance block inside instance block");
		}
		
		{
			System.out.println("This is Instance block inside instance block");
		}
		
//		we can't create Static block inside instance block
//		static{
//			System.out.println("This is Static block inside instance block");
//		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockCalling obj = new StaticBlockCalling();
		
	}

}
