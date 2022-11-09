import java.io.*;

class Item
{
    String code;
    int price;

    Item(String c, int p)
    {
        code = c;
        price = p;
    }

    void display()
    {
        System.out.println(code + "\t\t" + price);
    }
}

class P13
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c = new String();
        int pr, tot = 0;
        Item ob[] = new Item[5];
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter Item " + (i + 1) + ":");
            System.out.print("Enter Item Code: ");
            c = br.readLine();
            System.out.print("Enter Item Price: ");
            pr = Integer.parseInt(br.readLine());
            ob[i] = new Item(c, pr);
            tot += pr;
        }
        System.out.println("\nDISPLAYAING ITEMS:");
        System.out.println("Item Code\t Price\n");
        for(int i = 0; i < ob.length; i++)
            ob[i].display();
        System.out.println("\nTotal\t\t " + tot);
    }
}