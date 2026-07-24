public class WrapperClassDemo {
    public static void main(String[] args) {
        String intStr = "123";
        int parsedInt = Integer.parseInt(intStr);
        System.out.println(parsedInt);

        String doubleStr = "55.45";
        double parsedDouble = Double.parseDouble(doubleStr);
        System.out.println(parsedDouble);

        char ch1 = '8';
        boolean intDigit = Character.isDigit(ch1);
        System.out.println(intDigit);

        char ch2 = 'A';
        boolean isLetter = Character.isLetter(ch2);
        System.out.println(isLetter);
    }    
}
