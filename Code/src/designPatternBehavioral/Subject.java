package designPatternBehavioral;

public interface Subject {

	void register(Subscriber sub);

	void unRegister(Observer sub);

	void notifySubscriber();

	void uploadVideo(String title);

}