package pr.practice.design.strategy;

public class TravelClient {

	public static void main(String[] args) {
		
		System.out.println("National Traveller :");
		TravelMode tvNational = new NationalTraveller();
		tvNational.travel();
		System.out.println("InterNational Traveller :");
		TravelMode tvInternational = new InternationalTraveller();
		tvInternational.travel();
		
		System.out.println("National Traveller want to travel by Flight :");
		tvNational.changeTraveller(new FlightStrategy());
		tvNational.travel();
	}	
}
