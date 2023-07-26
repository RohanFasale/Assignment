
public class DivisionTest 
{
	public static void main(String[] args) {
		try {
			Calculator.divide(100, 6);
		} catch (Exception e1) {
			System.out.println("Exception : "+e1);	
		}
		
		finally {
			System.out.println("finally executed");
		}
	
	
		try {
			Calculator.divide(40, 5);
		} catch (Exception e2) {
			System.out.println("Exception : "+e2);	

		}
		
		finally {
			System.out.println("finally executed");
		}
	
		try {
			Calculator.divide(60, 5);
		} catch (Exception e3) {
			System.out.println("Exception : "+e3);	

		}	
		
		finally {
			System.out.println("finally executed");
		}
	}
}

class Calculator
{
	static void divide(int num,int deno) throws Exception{
		System.out.println("Dividing...");
		System.out.println("Numerator : "+num);
		System.out.println("Denominator : "+deno);
		System.out.println("Trying to divide : "+num + " by "+ deno);
		int division = num / deno;
		System.out.println("Division : " + division);
		if(10>50) {
			throw new Exception("some problem....");
		}
		System.out.println("End of division");
	}
}
