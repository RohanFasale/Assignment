
public class AbstractTest {
	public static void main(String[] args) {
			
		GeometricalShape gs = new Square(5);
		gs.calcArea();
		gs.calcPerimeter();
		
		GeometricalShape gs1 = new Rectangle(4,6);
		gs1.calcArea();
		gs1.calcPerimeter();
	}
}

abstract class GeometricalShape{
	abstract void calcArea();
	abstract void calcPerimeter();
}

class Square extends GeometricalShape
{
	private int side;
	
	
	
	public int getSide() {
		return side;
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	void calcArea() {
		int area = side*side;
		System.out.println("area : "+ area);
	}
	
	void calcPerimeter() {
		int perimeter = side*4;
		System.out.println("perimeter : "+perimeter);
	}
}

class Rectangle extends Square{
	int breadth;

	public Rectangle(int side, int breadth) {
		super(side);
		this.breadth = breadth;
	}
	
	void calcArea() {
		int area = getSide() * breadth;
		System.out.println("area : "+area);
	}
	
	void calcPerimeter() {
		int perimeter = 2*(getSide()+breadth);
		System.out.println("Perimeter : "+ perimeter);
	}
}