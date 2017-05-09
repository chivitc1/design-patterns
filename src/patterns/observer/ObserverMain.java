package patterns.observer;

public class ObserverMain {

	public static void main(String[] args) {
		// create subject
		MyTopic topic = new MyTopic();
		// create observers
		Observer subcrb1 = new MyTopicSubscriber("Subcrb1");
		Observer subcrb2 = new MyTopicSubscriber("Subcrb2");
		Observer subcrb3 = new MyTopicSubscriber("Subcrb3");

		// register observers to the subject
		topic.register(subcrb1);
		topic.register(subcrb2);
		topic.register(subcrb3);

		// attach observer to subject
		subcrb1.setSubject(topic);
		subcrb2.setSubject(topic);
		subcrb3.setSubject(topic);

		// check if any update is available
		subcrb1.update();

		// now send message to subject
		topic.postMessage("New Message");
	}
}
