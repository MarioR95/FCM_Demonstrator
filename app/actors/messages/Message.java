package actors.messages;

import com.fasterxml.jackson.databind.JsonNode;

public class Message {
    private final JsonNode payload;
    private final String username;

    public Message(final JsonNode payload, final String username){
        this.payload = payload;
        this.username = username;
    }

    public JsonNode getPayload() {
        return payload;
    }

    public String getUsername() {
        return username;
    }
}