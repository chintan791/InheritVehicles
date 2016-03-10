
public class Car extends InheritVehicle{


	@Override
	public String UnderstandThis() {
	    String status = "";
	    status = SendInfo( run(), stop(), accelerate());
	    return status;
	}
	
	public String car(){
		return "A car has 4 wheels";
	}
	
	private String SendInfo(String run, String stop, String accelerate) {
	
	    return "Go travel";
	
}
}

