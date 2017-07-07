package pr.practice.design.strategy;

public class FlightStrategy implements Strategy{

	@Override
	public void travelBy() {
		
		System.out.println("I'm travel by FLIGHT.");		
	}
}
