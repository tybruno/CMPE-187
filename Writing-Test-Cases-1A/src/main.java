import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        Triangle equilateral = new Triangle(10,10,10);
        Triangle scalene = new Triangle(2,10,20);
        Triangle isoscelese = new Triangle(5,5,3);

        ArrayList<Triangle> triangles = new ArrayList<>();

        triangles.add(equilateral);
        triangles.add(scalene);
        triangles.add(isoscelese);

        for(Triangle t: triangles){
            print("equilateral",t.checkEquilateral());
            print("Scalene", t.checkScalene());
            print("Isosceles",t.checkIsosceles());
            System.out.println("");
        }

    }

    public static void print(String type,boolean b)
    {
        System.out.println(type + ": " +b);
    }


}



