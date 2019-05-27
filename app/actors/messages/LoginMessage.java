package actors.messages;

import com.fasterxml.jackson.databind.JsonNode;


public class LoginMessage extends Message {

    public LoginMessage(JsonNode payload, String username) {
        super(payload, username);
    }
}
