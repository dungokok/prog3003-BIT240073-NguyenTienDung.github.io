package bainam_message;

public class SimpleMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent: " + message);
    }
}
