//program 10
import java.util.Scanner;

class ThreeDObject
{
    void wholeSurfaceArea(){}
    void volume(){}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Box\n2. Cube\n3. Cylinder\n4. Cone\nEnter Choice: ");
        int ch = sc.nextInt();
        double a, b, c;
        switch(ch)
        {
            case 1:
            System.out.println("Enter Length, Breath and Height:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            ThreeDObject ob = new Box(a, b, c);
            System.out.print("Surface Area: ");
            ob.wholeSurfaceArea();
            System.out.print("Volume: ");
            ob.volume();
            break;
            case 2:
            System.out.println("Enter Side Length:");
            a = sc.nextDouble();
            ThreeDObject ob2 = new Cube(a);
            System.out.print("Surface Area: ");
            ob2.wholeSurfaceArea();
            System.out.print("Volume: ");
            ob2.volume();
            break;
            case 3:
            System.out.println("Enter Radius and Height:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            ThreeDObject ob1 = new Cylinder(a, b);
            System.out.print("Surface Area: ");
            ob1.wholeSurfaceArea();
            System.out.print("Volume: ");
            ob1.volume();
            break;
            case 4:
            System.out.println("Enter Radius and Height:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            ThreeDObject ob3 = new Cone(a, b);
            System.out.print("Surface Area: ");
            ob3.wholeSurfaceArea();
            System.out.print("Volume: ");
            ob3.volume();
            break;
            default:
            System.out.println("INVALID INPUT.");
        }
    }
}

class Box extends ThreeDObject
{
    double a, b, c;

    Box(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void wholeSurfaceArea()
    {
        double area = 2*(a*b + b*c + c*a);
        System.out.println(area);
    }

    void volume()
    {
        double vol = a*b*c;
        System.out.println(vol);
    }
}

class Cylinder extends ThreeDObject
{
    double r, h;

    Cylinder(double a, double b)
    {
        r = a;
        h = b;
    }
    void wholeSurfaceArea()
    {
        double area = 2*Math.PI*r*h;
        System.out.println(area);
    }

    void volume()
    {
        double vol = Math.PI*r*r*h;
        System.out.println(vol);
    }
}

class Cube extends ThreeDObject
{
    double s;

    Cube(double s)
    {
        this.s = s;
    }

    void wholeSurfaceArea()
    {
        double area = 6*s*s;
        System.out.println(area);
    }

    void volume()
    {
        double vol = Math.pow(s, 3);
        System.out.println(vol);
    }
}

class Cone extends ThreeDObject
{
    double r, h;

    Cone(double r, double h)
    {
        this.r = r;
        this.h = h;
    }

    void wholeSurfaceArea()
    {
        double area = Math.PI*r*(r+Math.sqrt(h*h + r*r));
        System.out.println(area);
    }

    void volume()
    {
        double vol = 1/3.0*Math.PI*r*r*h;
        System.out.println(vol);
    }
}