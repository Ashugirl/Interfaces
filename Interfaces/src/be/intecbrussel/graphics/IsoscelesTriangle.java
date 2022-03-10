package be.intecbrussel.graphics;

public class IsoscelesTriangle extends Triangle{

    private static int count= 0;
    {
        count++;
    }
    public IsoscelesTriangle(){
        this(0,0, 0, 0,0);
    }
    public IsoscelesTriangle(int width, int height){
        this(width, height,0, 0,0);
    }
    public IsoscelesTriangle(int width, int height, int perpendicular, int x, int y){
        super(height,width, perpendicular, x, y);

    }
    public IsoscelesTriangle(Triangle triangle){
        super(triangle);
    }
    public static int getCount(){
        return count;
    }
    @Override
    public void setHeight(int height){
        setPerpendicular(height);
        super.setHeight(height);
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{} " + super.toString();
    }
}
