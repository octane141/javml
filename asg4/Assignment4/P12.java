class Fraction
{
    int numerator, denominator;

    Fraction(int num, int dem)
    {
        numerator = num;
        denominator = dem;
    }

    void showValue()
    {
        double fr;
        fr = 1.0*numerator/denominator;
        System.out.println(fr);
    }
}

class P12
{
    public static void main(String args[])
    {
        Fraction a = new Fraction(3, 5);
        Fraction b = new Fraction(12, 13);
        Fraction c = new Fraction(22, 15);
        a.showValue();
        b.showValue();
        c.showValue();
    }
}
