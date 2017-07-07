package pr.practice.design.strategy;

public class BusStrategy implements Strategy{

	@Override
	public void travelBy() {
		
		System.out.println("I'm travel by BUS.");		
	}
}
