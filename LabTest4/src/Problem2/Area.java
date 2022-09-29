package Problem2;

public class Area implements Shape{
	
	public static void main(String[] args) {
		Area a = new Area();
		a.RectangleArea(50,40);
		a.SquareArea(20);
		a.CircleArea(5);
	}

	
	public void RectangleArea(double length, double breadth) {
		System.out.println("Area of Rectangle : "+(length*breadth));
	}

	public void SquareArea(double side) {
		System.out.println("Area of Square : "+(side*side));
	}

	public void CircleArea(double radius) {
		System.out.println("Area of Circle : "+(3.142*radius*radius));	
	}


}
