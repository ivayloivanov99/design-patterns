package fmi.chatroom;

public class ChatRoom {

    public static void main(String[] args){

        MessageMediator chat = new Chat();

        User martin = new ChatUser(chat, "Martin");
        User dimitar = new ChatUser(chat, "Dimitar");
        User maria = new ChatUser(chat, "Maria");

        maria.sendMessage("Hello!");
        dimitar.sendMessage("I have a cat.");

    }
}
