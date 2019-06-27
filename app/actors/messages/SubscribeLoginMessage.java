package actors.messages;

import play.mvc.WebSocket;

public class SubscribeLoginMessage extends SubscribeMessage  {

	
	
	public SubscribeLoginMessage(String username, WebSocket socket) {
		super(username, socket);
	}


}
