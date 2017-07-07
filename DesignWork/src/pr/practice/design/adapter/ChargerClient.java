package pr.practice.design.adapter;

public class ChargerClient {

	public static void main(String[] args) {
		
		System.out.println("Adapt i4 charger as i5 charger.");
		ChargePhone charge = new ChargePhone();
		Charger charger = new i5ChargerAdapter();
		charge.setChager(charger);
		charge.i4Charger();
	}
}
