package designPatternBehavioral;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subscriber s1=new Subscriber("Niraj");
		Subscriber s2=new Subscriber("Prashant");
		Subscriber s3=new Subscriber("Sonu");
		Subscriber s4=new Subscriber("Vishal");
		Subscriber s5=new Subscriber("Manish");
		
		Channel c=new Channel("Amdocs vlogs");
		c.register(s1);
		c.register(s2);
		c.register(s3);
		c.register(s4);
		c.register(s5);
		
		s1.subscribeChannel(c);
		s2.subscribeChannel(c);
		s3.subscribeChannel(c);
		s4.subscribeChannel(c);
		s5.subscribeChannel(c);
		
		c.uploadVideo("Java 8 Streams");
		
		c.unRegister(s5);
		
		c.uploadVideo("React fullStack Project");
		
		
		

	}

}
