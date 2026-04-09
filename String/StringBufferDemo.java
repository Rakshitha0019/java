public class StringBufferDemo {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("java program");

        sb = sb.deleteCharAt(4);
        System.out.println(sb);

        sb = sb.delete(0, 4);
        System.out.println(sb);
    }
}