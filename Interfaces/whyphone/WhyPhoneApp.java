package be.intecbrussel.whyphone;

public class WhyPhoneApp {
    public static void main(String[] args) {

        WhyPhone phone = new WhyPhone(299.99, "WhyPhone", "aqua");


        //WhyPhoneApp whyPhoneApp = new WhyPhoneApp();
        //whyPhoneApp.showSpecs(phone);

        showSpecs(phone);

    }
    public static void showSpecs(SmartPhone phone){
        phone.playChannel(38.9);
        phone.changeChannel(97.6);
        System.out.println();
        phone.startCall("911");
        phone.endCall();
        System.out.println();
        phone.connect("Wifi connected.");
        phone.disconnect("Wifi disconnected.");
        System.out.println();
        System.out.println(phone.locate(45, 60));
        phone.navigate();
        System.out.println();
        phone.shootAPhoto(7);
        String[] photos = phone.viewPhotos();
        for(String photo : photos){
            System.out.println(photo);
        }


    }
}