
public class KiteTest {

	public static void main(String[] args) {
		Kite.showKiteCount();
		
		Kite kite1 = new Kite("Rohan","Red",100,true);
		kite1.showKite();
		
		Kite kite2 = new Kite("Sashwat","Blue",80,true);
		kite2.showKite();
		
		Kite kite3 = new Kite("Onkar","Sky blue",50,true);
		kite3.showKite();
		
		Kite.showKiteCount();
		
		Kite kite4 = new Kite("Shruti","Pink",50,true);
		kite4.showKite();
		
		Kite kite5 = new Kite("Mitali","Yellow",60,true);
		kite5.showKite();
		
		Kite.showKiteCount();
		
		kite4.kiteFight1(kite5);
	}

}

class Kite{
	private String owner;
	private String color;
	private int length;
	private boolean flying;
	
	private static int kiteCount;
	
	public static void showKiteCount() {
		System.out.println("Total kites in sky : "+ kiteCount);
	}
	public void kiteFight1(Kite ref) {
		for(int i=1;i<=20;i++) {
			double value = Math.random()%10;
			System.out.println("Kites are fighting " + value);
			
			if(value > 0.85) {
				kiteCount--; //assume that one kite is lost
				this.flying=false;
				System.out.println(owner+" lost the kite");
				break;
			}
			
			if(value< 0.010) {
				kiteCount--;
				ref.flying=false;
				System.out.println(ref.owner+" lost the kite");

				break;
			}
			
			if(value >=0.30 && value<=0.33) {
				kiteCount--;
				kiteCount--;
				this.flying=false;
				ref.flying=false;
				System.out.println("Both "+owner+" and "+ref.owner+" lost the kites");

				break;
			}
		}
	}
	
	
	public Kite(String owner, String color, int length,boolean flying) {
		super();
		this.owner = owner;
		this.color = color;
		this.length = length;
		this.flying = flying;
		kiteCount++;
	}
	
	void showKite() { //non-static can refer static
		System.out.println("Kite Owner  : "+owner);
		System.out.println("Kite Color  : "+color);
		System.out.println("Kite Length : "+length);
		System.out.println("Kite count  : "+Kite.kiteCount);
		System.out.println("-------------------");
	}
	
	void kiteFight(Kite ref) {
		System.out.println(color+" Kite initiated fight with "+ ref.color);
	}
	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + "]";
	}
	
}