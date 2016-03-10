
public class Plane extends InheritVehicle{

	@Override
	public String UnderstandThis() {
	    String forPlane = "";
	    forPlane = PlaneInfo(run(),stop(), accelerate());
	    return forPlane;
	}
	

	public String plane(){
		return "A plane can fly ";
	}
	
	
	
	private String PlaneInfo(String run, String stop, String accelerate) {
	    
	    return "Plane can run, stop and accelerate";
	    
}
}
