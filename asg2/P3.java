//Array: Sum of even numbers
class P4 
{
    public static void main(String args[])
    {
        int esum  = 0;
        int arr[] = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++)
            if(arr[i] % 2 == 0)
                esum += arr[i];
        System.out.println("The sum of even elements is " + esum);
    }
}
