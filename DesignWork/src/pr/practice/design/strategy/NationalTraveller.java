package pr.practice.design.strategy;

public class NationalTraveller extends TravelMode{

	public NationalTraveller() {
		super();
		strategy = new BusStrategy();		
	}	
}
