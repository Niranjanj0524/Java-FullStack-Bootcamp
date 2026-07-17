public class NullPointerDemo {
    public static void main(String[] args) {
        String name = null;

        try{
            int len = name.length();
            System.out.println(len);
        }catch(NullPointerException e){
            System.out.println("--Null pointer--" + e);
        }
        System.out.println(name + " ABCD");
    }
}
