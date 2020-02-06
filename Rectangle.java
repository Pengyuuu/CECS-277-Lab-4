public class Rectangle extends GeometricObject {

    private int width;
    private int height;

    public Rectangle(String name) {
        super(name);
    }

    public Rectangle(int x, int y, String name) {
        super(name);
        width = x;
        height = y;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int x) {
        width = x;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int y) {
        height = y;
    }

    public double getArea() {
        super.getArea();
        return width * height;
    }

    public double getPerimeter() {
        super.getPerimeter();
        return ((2*width) + (2*height));
    }

    /**
    @Override
    public String toString(){

        return "This is a rectangle ";
    }
    */

}
