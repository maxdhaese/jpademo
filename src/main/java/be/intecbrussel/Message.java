package be.intecbrussel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
    private Integer id;
    private String text;

    public Message(){

    }

    public Message(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
