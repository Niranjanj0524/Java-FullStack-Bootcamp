package AccessDemoMain.pack2;
import AccessDemoMain.pack1.AccessDemo;
public class SubClass extends AccessDemo {
    public void test() {
        System.out.println("--- Inside Different Package Subclass ---");
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar); 
    }
}
