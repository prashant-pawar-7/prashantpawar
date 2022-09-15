
public class Rectangle {
     double length;
    double width;
	Rectangle(){
		length=0;
		width=0;
	}
	Rectangle(double m, double n){
		this.length=m;
		this.width=n;
	}
	public static void main(String[] args) {
    Rectangle rectangle=new Rectangle(12, 12);
               rectangle.area();
	}
	 void area() {
		double area=length*width;
		System.out.println(area);
	}

}
