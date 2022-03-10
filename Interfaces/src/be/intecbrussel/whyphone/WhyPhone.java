package be.intecbrussel.graphics.whyphone;

public class WhyPhone extends SmartPhone{
    private final String COLOR;

   public WhyPhone(double PRICE, String BRAND,String COLOR ){
       super(PRICE, BRAND);

       this.COLOR = "Blue";
   }

    public String getCOLOR() {
        return COLOR;
    }
}
