package be.intecbrussel.graphics.whyphone;

public interface ISimCard{
    default void startCall(String calling) {
        System.out.println("Calling 911.");
    }

    default void endCall(){
        System.out.println("Call ended.");
    }

}
