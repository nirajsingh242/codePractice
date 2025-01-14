package designPatternStructural;

public class Iphone {
	private IphoneCharger charger;
	
	
	public Iphone(IphoneCharger charger) {
		this.charger = charger;
	}


	public  void charging()
	{
		charger.iphoneCharge();
	}
}
