
public class VehicleApp {

	public static void main(String[] args) {
	
		
		Plane c = new Plane();
		System.out.println(c.run());
		System.out.println(c.stop());
		System.out.println(c.accelerate());
		System.out.println(c.UnderstandThis());	
		
		Car a= new Car();
		System.out.println(a.run());
		System.out.println(a.stop());
		System.out.println(a.accelerate());
		System.out.println(a.UnderstandThis());		
		
		Speedboat b= new Speedboat();
		System.out.println(b.run());
		System.out.println(b.stop());
		System.out.println(b.accelerate());
		System.out.println(b.UnderstandThis());
		
	}

}
