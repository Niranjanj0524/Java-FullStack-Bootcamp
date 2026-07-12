public class ParameterizedConstructor {
    int id;
    String name;

    public ParameterizedConstructor(int stdId, String stdName){
        id = stdId;
        name = stdName;
    }
    void displayStd(){
        System.out.println(id + " " + name);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        ParameterizedConstructor paraCon = new ParameterizedConstructor(1,"Niranjan");
        ParameterizedConstructor paraCon1 = new ParameterizedConstructor(2,"Yash");

        paraCon.displayStd();
        paraCon1.displayStd();
    }
}
