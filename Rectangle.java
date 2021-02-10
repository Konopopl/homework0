
public class Rectangle extends Figure {
       
    private final double width;
    private final double height;
    
    public Rectangle(String name, double width, double height) {
	super(name);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return width * height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }

}