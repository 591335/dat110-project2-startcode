package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {

	private String topic;
	private String message;
	// message sent from client to create publish a message on a topic

	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

	public PublishMsg(String name, String topic, String message) {
		super(MessageType.PUBLISH, name);
		this.topic = topic;
		this.message = message;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PublishMsg [topic=" + topic + ", message=" + message + ", getType()=" + getType() + ", getUser()="
				+ getUser() + "]";
	}

}
