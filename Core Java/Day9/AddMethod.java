public class AddMethod {
    public int add(int n1, int n2){
        return n1 + n2;
    }   
    
    public static void main(String[] args) {
        AddMethod obj = new AddMethod();

        int addition = obj.add(12, 13);
        System.out.println(addition);
    }
}
