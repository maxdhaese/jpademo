package be.intecbrussel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class MessageTest {
    @Id
    @GeneratedValue //autonumbering
    private Integer id;
    private String sender;
    private String receiver;
    private String message;
    private String timestamp;

    public Integer getId() {
        return id;
    }

    public MessageTest setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;

    }

    @Override
    public String toString() {
        return "MessageTest{" +
                "id=" + id +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", message='" + message + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}

