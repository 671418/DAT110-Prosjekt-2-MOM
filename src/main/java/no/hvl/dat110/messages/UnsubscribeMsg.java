package no.hvl.dat110.messages;

// Task A
public class UnsubscribeMsg extends Message {

	private String topic;
	
	// message sent from client to unsubscribe on a topic 
    public UnsubscribeMsg(String user, String topic) {
    	super(MessageType.UNSUBSCRIBE, user);
    	this.topic = topic;
    }
    
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "UnsubscribeMsg [topic=" + topic + "," + super.toString() + "]";
	}
}
