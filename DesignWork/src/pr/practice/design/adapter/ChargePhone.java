package pr.practice.design.adapter;

public class ChargePhone {

	Charger charger;

	public Charger getCharger() {
		return charger;
	}

	public void setChager(Charger charger) {
		this.charger = charger;
	}
	
	public void i4Charger()
	{
		charger.chargePhone();
	}
}
