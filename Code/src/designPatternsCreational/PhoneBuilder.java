package designPatternsCreational;

public class PhoneBuilder {

	private String os;
	private int ram;
	private String processor;
	private int battery;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	
	
	public Phone build()
	{
		return new Phone(os, ram, processor, battery);
	}
	

	
}
