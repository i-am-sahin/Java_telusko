package Core_Java;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sahin");
        System.out.println(sb.capacity()); // returns the capacity of String Buffer ; Default 16Bytes.
        sb.append(" Islam");
        sb.insert(0,"Java");
        System.out.println(sb);

        String s = sb.toString();//toString method helps Data to convert Stringbuilder to String
        System.out.println(s);
    }
}
