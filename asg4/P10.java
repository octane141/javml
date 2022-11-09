//program 10
class Point
{
    int x;
    int y;

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Circle
{
    void area(Point a, Point b)
    {
        double ra, ar;
        ra = Math.sqrt(Math.pow(b.y - a.y, 2) + Math.pow(b.x - a.x, 2));
        ar = Math.PI*Math.pow(ra, 2);
        System.out.println("The area of circle is " + ar);
    }
}

class P10
{
    public static void main(String args[])
    {
        Point ob1 = new Point(2, 3);
        Point ob2 = new Point(5, 7);
        new Circle().area(ob1, ob2);
    }
}