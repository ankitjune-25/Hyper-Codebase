package pr.practice.design.abstractFactory;

public class OrderFactoryProducer {

	public OrderAbstractFactory placeOrder(String orderType)
	{
		if(orderType.equals("Laptop"))
		{
			return new OrderLaptopFactory();
		}
		else if(orderType.equals("Car"))
		{
			return new OrderCarFactory();
		}
		else
		{
			return null;
		}
	}
}
