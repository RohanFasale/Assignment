
public class FlightTest {
	public static void main(String[] args) {
		CommercialFlight cf=new CommercialFlight();
		cf.fly();
		cf.land();
		cf.checkTicket();
		
		System.out.println("-----------");
		
		FighterFlight fightFlight = new FighterFlight();
		fightFlight.armMissiles();
		fightFlight.fly();
		fightFlight.fireMissile();
		fightFlight.land();
		
		System.out.println("-----------");
		
		CargoFlight cargoFlight = new CargoFlight();
		cargoFlight.checkTheCapacity();
		cargoFlight.carryGoods();
		cargoFlight.fly();
		cargoFlight.land();
	}
}

interface Flying {
	void fly();
}
interface Landing{
	void land();
}
abstract class Flight implements Flying,Landing{
	
}

interface Ticketing{
	void checkTicket();
}
interface Fighting {
	void fireMissile();
}
interface Carrying {
	void carryGoods();
}

class CommercialFlight extends Flight implements Ticketing{
	public void fly() {
		System.out.println("Commercial flight is flying...");
	}
	public void land() {
		System.out.println("Commercial flight is landing...");
	}
	
	public void checkTicket() {
		System.out.println("Commercial flight checking tickets...");
	}
	
	void checkIdentityOfCPassengers() {
		System.out.println("Commercial Flight is checking identities of passengers...");
	}
}

class FighterFlight extends Flight implements Fighting{
	public void fly() {
		System.out.println("Fighter flight is flying...");
	}
	public void land() {
		System.out.println("Fighter flight is landing...");
	}
	
	public void fireMissile() {
		System.out.println("Fighter flight is Firing Missile...");
	}
	public void armMissiles() {
		System.out.println("Fighter Flight is arming the missiles...");
	}
}

class CargoFlight extends Flight implements Carrying{
	public void fly() {
		System.out.println("Cargo flight is flying...");
	}
	public void land() {
		System.out.println("Cargo flight is landing...");
	}
	
	public void carryGoods() {
		System.out.println("Cargo Flight carrying goods...");
	}
	void checkTheCapacity() {
		System.out.println("CargoFlight is checking the carriage capacity ");
	}
}

