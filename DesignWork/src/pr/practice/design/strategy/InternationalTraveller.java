package pr.practice.design.strategy;

public class InternationalTraveller extends TravelMode{

	public InternationalTraveller() {
		super();
		strategy = new FlightStrategy();		
	}
}
