package contracts.data;

/**
 * Created by chandrashekarj on 8/31/2017.
 */
public class Message {
    public Message(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    String messageText;
}
