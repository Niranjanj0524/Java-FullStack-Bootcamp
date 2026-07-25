enum Laptop{
    Dell(2000), Lenovo(1800), Mac(3000);

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}

public class LaptopEnum {
    public static void main(String[] args) {
        for(Laptop laptop : Laptop.values()){
            System.out.println(laptop + " price is " + laptop.getPrice());
        }
    }
}
