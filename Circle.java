import java.lang.Math.*;

public class Circle extends GeometricObject {

    private int radius;

    public Circle(){

        super();
        radius = 1;
    }

    public Circle(int r, String name){

        super(name);
        radius = r;
    }

    public int getRadius(){

        return radius;
    }

    public double getArea(){

        return 3.14 * (radius * radius);
    }

    public double getPerimeter(){
        super.getPerimeter();
        return 2 * Math.PI * radius;
    }

    public void getDiameter(){

        System.out.println(radius * 2);
    }

    /**
    @Override
    public String toString(){

        return "This is a circle: ";
    }
    */
}
