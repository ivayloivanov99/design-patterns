package fmi.chatroom;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator{

    private List<User> users;

    public Chat(){
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(User user) {
        this.users.remove(user);
    }

    @Override
    public void sendMessage(String message, User user) {
       if(message.contains("cat")){
           System.out.println("User blocked");
       }
        for(User chatUser: this.users){
            if(user != chatUser){
                chatUser.receiveMessage(message);
            }
        }
    }
}
