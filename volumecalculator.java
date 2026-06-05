import java.util.Scanner;

class Cylinder {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    void volume() {
        double v = Math.PI * radius * radius * height;
        System.out.println("volume of cylinder = " + v);
    }
}

class Cuboid {
    double length, breadth, height;

    Cuboid(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    void volume() {
        double v = length * breadth * height;
        System.out.println("Volume of Cuboid = " + v);
    }
}

class Cone {
    double radius, height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    void volume() {
        double v = (Math.PI * radius * radius * height) / 3;
        System.out.println("Volume of Cone = " + v);
    }
}

public class volumecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius and height of cylinder: ");
        Cylinder c1 = new Cylinder(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter length, breadth and height of cuboid: ");
        Cuboid c2 = new Cuboid(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter radius and height of cone: ");
        Cone c3 = new Cone(sc.nextDouble(), sc.nextDouble());

        c1.volume();
        c2.volume();
        c3.volume();

        sc.close();
    }
}