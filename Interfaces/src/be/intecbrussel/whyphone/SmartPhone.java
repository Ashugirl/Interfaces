package be.intecbrussel.graphics.whyphone;

public class SmartPhone implements ISimCard, IWifi, ICamera, IGps, IRadio{

    private final double PRICE;
    private final String BRAND;

    public SmartPhone(double PRICE, String BRAND) {
        this.PRICE = PRICE;
        this.BRAND = BRAND;
    }

    public double getPRICE() {
        return PRICE;
    }
    public String getBRAND(){
        return BRAND;
    }


    @Override
    public void shootAPhoto(double numPhotos) {
        System.out.println("You have this many photos: " + numPhotos);
    }

    @Override
    public String[] viewPhotos() {
        return new String[0];
    }

    @Override
    public String locate(double lat, double lon) {
        return "Amsterdam";
    }

    @Override
    public void playChannel(double channel) {
        System.out.printf("You're listening to %.1f FM!", channel);
    }

    @Override
    public void changeChannel(double newChannel) {
        System.out.printf("Change the channel to %.1f FM!", newChannel);
    }

    @Override
    public void connect(String connected) {
        System.out.println("Wifi connected.");
    }

    @Override
    public void disconnect(String disconnected) {
        System.out.println("Wifi disconnected.");
    }

    @Override
    public void startCall(String calling) {
        ISimCard.super.startCall(calling);
    }

    @Override
    public void endCall() {
        ISimCard.super.endCall();
    }
}
