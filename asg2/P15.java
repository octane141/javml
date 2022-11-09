//concepts of String and StringBuffer
class P15
{
    static public void main(String[] args)
    {
        String str = new String("  Example");
        StringBuffer stb = new StringBuffer("Buffer");
        System.out.println("String class Functions:");
        str = str.trim();
        System.out.println("Example of trim: " + str);
        System.out.println("Example of charAt: " + str.charAt(2));
        System.out.println("Example of compareTo: " + str.compareTo("Extra"));
        System.out.println("Example of equals: " + str.equals("example"));
        System.out.println("Example of eqaulsIgnoreCase: " + str.equalsIgnoreCase("example"));
        System.out.println("Example of indexOf: " + str.indexOf('p'));
        System.out.println("Example of length: " + str.length());
        System.out.println("Example of substring: " + str.substring(0, 4));
        char ch1[] = str.toCharArray();
        System.out.println("Example of tocharArray: " + ch1[3]);
        System.out.println("Example of toLowerCase: " + str.toLowerCase());
        System.out.println("Example of toString: " + (6 + Integer.toString(5)));
        System.out.println("Example of toUpperCase: " + str.toUpperCase());
        System.out.println("Example of valueOf: " + (100 + Integer.valueOf("25")));
        System.out.println("\nStringbuffer class Functions:");
        System.out.println("Example of append: " + stb.append("s"));
        System.out.println("Example of capacity: " + stb.capacity());
        System.out.println("Example of charAt: " + stb.charAt(0));
        System.out.println("Example of delete: " + stb.delete(0, 2));
        System.out.println("Example of deleteCharAt: " + stb.deleteCharAt(0));
        stb.getChars(0, 2, ch1, 0);
        System.out.println("Example of getChars: " + ch1[0] + ch1[1] + ch1[2] + ch1[3]);
        stb.ensureCapacity(20);
        System.out.println("Example of ensureCapacity: " + stb.capacity());
        System.out.println("Example of indexOf: " + stb.indexOf("er"));
        System.out.println("Example of insert: " + stb.insert(0, "Buf"));
        System.out.println("Example of length: " + stb.length());
        stb.setCharAt(2, 'F');
        System.out.println("Example of setCharAt: " + stb);
        stb.setLength(10);
        System.out.println("Example of setLength: " + stb.length());
        System.out.println("Example of substring: " + stb.substring(5));
        str = stb.toString();
        System.out.println("Example of toString: " + str);
    }
}