public class NumberFormatDemo {
    public static void main(String[] args) {
        String numS1 = "43AB";
        try{
            int num = Integer.parseInt(numS1);
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("---Number Format--- " + e);
        }
        System.out.println("numS1 : " + numS1);

        String numS2 = "32";
        int num1 = Integer.parseInt(numS2);
        System.out.println("numS2 : " + num1);
    }
}
