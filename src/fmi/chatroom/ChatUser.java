package fmi.chatroom;

public class ChatUser extends User{

    Singleton bot = Singleton.getInstance();

    public ChatUser(MessageMediator mediator, String name) {
        super(mediator, name);
        mediator.addUser(this);
    }

    @Override
    public void sendMessage(String message) {
        if(bot.checkMessage(message,this,mediator)){
            System.out.println(this.name + " sends: " + message);
            System.out.println(this.name + " has been removed from the chatroom.");
            mediator.removeUser(this);
            mediator.sendMessage("Message from "+ this.name +
                    " contained banned words and could not be sent.", this);
        }else{
            System.out.println(this.name + " sends: " + message);
            mediator.sendMessage(message, this);
        }
    }

    @Override
    public void receiveMessage(String message) {
            System.out.println(this.name + " received: " + message);
    }
}
