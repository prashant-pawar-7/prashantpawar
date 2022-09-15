public class Rectangle {
	double length;
	double width;
	//sets default values of length and width
	public Rectangle() {
		length=0;
		width=0;
	}
	//sets values of length and width
	Rectangle(double m,double n){
		this.length=m;
		this.width=n;
	}
	// area method calculates area
	void area(){
		 double area= length*width;
		 System.out.println(area);
	}

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(30.35,40.30);
		//calls method area
		rectangle.area();
	}

}
