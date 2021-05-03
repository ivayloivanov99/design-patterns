package fmi.chatroom;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public boolean checkMessage(String message, ChatUser user, MessageMediator mediator){
        if(message.contains("cat")){
            return true;
        }else{
            return false;
        }
    }
}
