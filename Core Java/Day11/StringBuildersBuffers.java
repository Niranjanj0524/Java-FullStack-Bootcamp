public class StringBuildersBuffers {
    public static void main(String[] args) {
        System.out.println("--- StringBuilder Operations ---");
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");
        System.out.println("append: " + sb);

        sb.insert(5, ",");
        System.out.println("insert: " + sb);

        sb.delete(5, 6);
        System.out.println("delete: " + sb);

        sb.replace(6, 10, "Python");
        System.out.println("replace: " + sb);

        sb.reverse();
        System.out.println("reverse: " + sb);

        System.out.println("\n--- StringBuffer Operations ---");
        StringBuffer sbf = new StringBuffer("Welcome");

        sbf.append(" Home");
        System.out.println("append: " + sbf);

        sbf.insert(7, " to");
        System.out.println("insert: " + sbf);

        sbf.delete(7, 10);
        System.out.println("delete: " + sbf);

        sbf.replace(8, 12, "World");
        System.out.println("replace: " + sbf);

        sbf.reverse();
        System.out.println("reverse: " + sbf);
    }
}
