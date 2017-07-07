package pr.practice.design.abstractFactory;

public class BuyerClient {

	public static void main(String[] args) {
		
		OrderFactoryProducer orderFactory = new OrderFactoryProducer();
		orderFactory.placeOrder("Laptop").orderLaptop("Mac").os();
		orderFactory.placeOrder("Car").orderCar("Safari").type();
	}
}
