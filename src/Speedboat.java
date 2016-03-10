
public class Speedboat extends InheritVehicle{
	
	@Override
	public String UnderstandThis() {
	    String forBoat = "";
	    forBoat = BoatInfo(run(), stop(), accelerate());
	    return forBoat;
	}
	

	public String speedBoat(){
		return "A boat can float ";
	}
	
	
	
	private String BoatInfo(String run, String stop, String accelerate) {
	    
	    return "Speed Boat can run, stop and accelerate";
	    
}
}


