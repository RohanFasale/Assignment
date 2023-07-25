
public class FinalFieldTest {

	public static void main(String[] args) {
		
//		final float PI=3.14f;
//		System.out.println("PI "+PI);
		Circle circle1 = new Circle(45);
		Circle circle2 = new Circle(55);
		Circle circle3 = new Circle(85);
		Circle circle4 = new Circle(43);
		Circle circle5 = new Circle(34);
		
		circle1.calcArea();
		circle2.calcArea();
		circle3.calcArea();
		circle4.calcArea();
		circle5.calcArea();
	}

}

class Circle
{
	private float radius;
	private static final float PI=3.14f;
	public Circle(float radius) {
		super();
//		PI=3.44f;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	void calcArea() {
		float area = PI*radius*radius;
		System.out.println("area : "+area);
	}
	
}
