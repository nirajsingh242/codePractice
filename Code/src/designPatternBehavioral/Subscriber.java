package designPatternBehavioral;

public class Subscriber implements Observer {
	private String name;
	private Channel c;
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update()
	{
		System.out.println("hey "+name +" Video uploaded"+" of subject "+c.title);
	}
	
	@Override
	public void subscribeChannel(Channel c)
	{
		this.c=c;
	}
}
