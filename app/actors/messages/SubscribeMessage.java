package actors.messages;


import play.mvc.WebSocket;

public class SubscribeMessage {
	
	    private final String username;
	    private final WebSocket socket;
	  

	    public SubscribeMessage(final String username, final WebSocket socket) {
	        this.username = username;
	        this.socket= socket;
	       
	    }

	    public String getUsername() {
	        return username;
	    }
	    
	    public WebSocket getSocket() {
	    	return socket;
	    }

}
