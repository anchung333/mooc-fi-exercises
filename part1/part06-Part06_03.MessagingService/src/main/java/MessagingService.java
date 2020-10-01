/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */

import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> messageList;
    
    public MessagingService() {
        this.messageList = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messageList.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return messageList;
    }
}
