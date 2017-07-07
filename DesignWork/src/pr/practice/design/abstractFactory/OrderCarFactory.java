package pr.practice.design.abstractFactory;

public class OrderCarFactory extends OrderAbstractFactory {

	@Override
	Laptop orderLaptop(String laptop) {
		return null;
	}
	
	@Override
	Car orderCar(String car) {
		if(car.equals("Swift"))
		{
			return new Swift();
		}
		else if(car.equals("Safari"))
		{
			return new Safari();
		}
		else
		{
			return null;
		}
	}
}
