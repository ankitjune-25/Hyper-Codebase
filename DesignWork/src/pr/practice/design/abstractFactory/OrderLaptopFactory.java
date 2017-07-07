package pr.practice.design.abstractFactory;

public class OrderLaptopFactory extends OrderAbstractFactory{

	@Override
	Laptop orderLaptop(String laptop) {
		if(laptop.equals("Mac"))
		{
			return new MacAirBook();
		}
		else if(laptop.equals("HP"))
		{
			return new HP();
		}
		else
		{
			return null;
		}
	}

	@Override
	Car orderCar(String car) {
		return null;
	}
}
