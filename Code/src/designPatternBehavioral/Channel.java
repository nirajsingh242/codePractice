package designPatternBehavioral;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
String name;
public Channel(String name) {
	super();
	this.name = name;
}

List<Subscriber> subscribers=new ArrayList<>();
 String title;

@Override
public void register(Subscriber sub)
{
	subscribers.add(sub);
}

@Override
public void unRegister(Observer sub)
{
	subscribers.remove(sub);
}

@Override
public void notifySubscriber()
{
	for(Observer subscriber:subscribers)
	{
		subscriber.update();
	}
}

@Override
public void uploadVideo(String title)
{
	this.title=title;
	//System.out.println(title);
	notifySubscriber();
}


}
