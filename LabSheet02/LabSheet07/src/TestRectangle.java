
public class TestRectangle {
	public static void main(String[] args) {
		//Test constructors and toString()
		//Call default constructor
		Rectangle r1 = new Rectangle(); 
		//System.out.println(r1.toString());
		System.out.println(r1);//call toString() method
		
		//Call Parameterize Constructor method
		Rectangle r2 = new Rectangle(1.2f,3.4f); 
		System.out.println(r2);//call toString() method
		System.out.println();
		
		//Test setter and getters
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);//call toString() method
		System.out.println("Length is " + r1.getLength());
		System.out.println("Width is " + r1.getWidth());
		System.out.println();
		
		//Test getArea() and getter gerPerimeter()
		System.out.printf("area is %.2f%n",r1.getArea());
		System.out.printf("perimeter is %.2f", r1.getPerimeter());
	}
}
