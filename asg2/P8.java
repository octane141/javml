import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//implementation of BufferedReader

class P8
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        String str = br.readLine();
        System.out.println("You entered: " + str);
    }
}