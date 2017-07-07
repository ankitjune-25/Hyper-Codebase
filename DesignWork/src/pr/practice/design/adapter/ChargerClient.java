package pr.practice.design.adapter;

public class ChargerClient {

	public static void main(String[] args) {
		
		ChargePhone charge = new ChargePhone();
		Charger charger = new i5ChargerAdapter();
		charge.setChager(charger);
		charge.i4Charger();
	}
}
