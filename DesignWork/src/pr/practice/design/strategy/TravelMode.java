package pr.practice.design.strategy;

public class TravelMode {
	
	public Strategy strategy;

	public void travel()
	{
		this.strategy.travelBy();
	}
	
	public void changeTraveller(Strategy strategy)
	{
		this.strategy = strategy;
	}
}
