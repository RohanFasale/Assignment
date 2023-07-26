
public class CustomExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
			myCar.carServicing();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		}
		catch(LicenseLostException ex2) {
			System.out.println("License lost : "+ex2);
		}
		catch(CheckBreakException ex3) {
			System.out.println("Check break : "+ex3);
		}
		
		System.out.println("\nMAIN finished...\n");
		
		
	}
}

class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}
class LicenseLostException extends Exception
{
	LicenseLostException(String msg) {
		super(msg);
	}
}

class CheckBreakException extends Exception
{
	CheckBreakException(String msg) {
		super(msg);
	}
}

class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}

class TireBurstException extends RuntimeException
{
	TireBurstException(String msg) {
		super(msg);
	}
}

class BadWeatherException extends RuntimeException
{
	BadWeatherException(String msg){
		super(msg);
	}
}

class Car
{
	boolean keyFound=false;
	boolean licenseLost=false;
	
	Car() throws CarKeyNotFoundException
	{
		double value = Math.random()%10;
		
		if(value>=0.80) {
			keyFound=true;
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
	}
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			if(value>0.95) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			if(value>0.90) {
				TireBurstException ex2 = new TireBurstException("The tire has burst...");
				throw ex2;
			}
			if(value>0.92) {
				BadWeatherException ex3 = new BadWeatherException("The weather got worst...");
				throw ex3;
			}
		}
	}
	
	 public void carServicing() throws LicenseLostException,CheckBreakException {
		 for(int i=0;i<=20;i++) {
			 System.out.println("car is servicing from "+i+" minutes");
		 }
		 double value2 = Math.random()%10;
		 if(value2>0.75) {
			 LicenseLostException e = new LicenseLostException("License is lost");
			 throw e;
		 }
		 if(value2>0.80) {
			 CheckBreakException e2 = new CheckBreakException("Check Break");
			 throw e2;
		 }
	 }
	 
}