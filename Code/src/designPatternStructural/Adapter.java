package designPatternStructural;

public class Adapter implements IphoneCharger {

	SamsungCharger s;
	
	public Adapter(SamsungCharger s) {
		this.s = s;
	}

	@Override
	public void iphoneCharge() {
		// TODO Auto-generated method stub
		s.samsungCharge();
		
	}

}
