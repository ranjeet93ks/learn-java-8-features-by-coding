package com.learnJava.method.constructor.references;

interface Messageable {
	public Message getMessage(String msg);
}

//constructor reference :: 
// for constructor reference- mandatory to have same argument types only
class Message {
	Message(String msg) {
		System.out.println(msg);
	}
}

public class ConstructorReference {

	public static void main(String[] args) {

		// using lambda exp:--
		Messageable msg = (str) -> {
			Message m = new Message("using lambda exp: ");
			return m;
		};
		Message msg1 = msg.getMessage("test ");

		// using Constructor Reference
		Messageable hello = Message::new;
		hello.getMessage("using Constructor Reference : ");
	}
}
