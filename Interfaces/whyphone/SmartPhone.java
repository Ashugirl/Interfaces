package be.intecbrussel.whyphone;

public class SmartPhone implements ISimCard, IWifi, ICamera, IGps, IRadio{

    private final double PRICE;
    private final String BRAND;
    private int numberOfPHotos;

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
        numberOfPHotos+=numPhotos;
    }

    @Override
    public String[] viewPhotos() {
        String [] photos = new String[numberOfPHotos];
        for(int i = 0; i < photos.length; i++){
            photos[i] = "Photo" +i + "jpg";
        }
        return photos;
    }

    @Override
    public String locate(double lat, double lon) {
        if (lat > 0 && lon > 0){
            return "Amsterdam";
        }else if(lat > 10 && lon > 10){
            return "Brazil";
        }
        return "Australia";
    }

    @Override
    public void navigate() {
        System.out.println("Turn left at next intersection");
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
        System.out.println("Connecting to " + connected);
    }

    @Override
    public void disconnect(String disconnected) {
        System.out.println("Wifi " + disconnected);
    }

}