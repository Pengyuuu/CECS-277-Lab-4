import java.util.*;

public class Main {

    public static void main (String[] args){

        ArrayList <GeometricObject> go = new ArrayList<>();

        go.add(new Circle(5));

        for (int i = 0; i < go.size(); i++){

            GeometricObject thingy = go.get(i);
            System.out.println(thingy);
            System.out.println(thingy.getArea());
            System.out.println(thingy.getPerimeter());

        }
    }


}
