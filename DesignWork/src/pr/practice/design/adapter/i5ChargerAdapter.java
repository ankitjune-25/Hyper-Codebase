package pr.practice.design.adapter;

public class i5ChargerAdapter implements Charger{

	i5Charger i5 = new i5Charger();
	
	@Override
	public void chargePhone() {
		
		i5.chargei5();
		
	}
}
