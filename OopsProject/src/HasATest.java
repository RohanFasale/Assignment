
public class HasATest {

	public static void main(String[] args) {
		Human theHuman = new Human();
		theHuman.breathing();
		theHuman.thinking();
		theHuman.drinkLemonJuice();
		theHuman.doPranayama();
	}

}

class Heart
{
	void pumping() {
		System.out.println("Heart is Pumping...");
	}
}

class Brain
{
	void analyzing() {
		System.out.println("Brain is Analysing...");
	}
}

class Kidney
{
	void filterBlood() {
		System.out.println("The blood is filtering..");
	}
}
class Lung
{
	void oxigenateBlood() {
		System.out.println("The blood is oxigenating");
	}
}

class Human
{
	private Heart myHeart = new Heart();
	private Brain brain = new Brain();
	private Kidney rightKidney = new Kidney();
	private Kidney leftKidney = new Kidney();
	private Lung rightLung = new Lung();
	private Lung leftLung = new Lung();
	
	void breathing() {
		System.out.println("Human is Breathing...");
		myHeart.pumping();
	}
	
	void thinking() {
		System.out.println("Human is Thinking...");
	}
	
	void drinkLemonJuice() {
		System.out.println("Drinking lemon juice...");
		rightKidney.filterBlood();
		leftKidney.filterBlood();
	}
	
	void doPranayama() {
		System.out.println("Doing Pranayama...");
		rightLung.oxigenateBlood();
		leftLung.oxigenateBlood();
	}
}