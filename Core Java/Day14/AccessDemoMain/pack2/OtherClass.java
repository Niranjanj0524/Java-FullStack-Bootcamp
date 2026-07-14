package AccessDemoMain.pack2;
import AccessDemoMain.pack1.AccessDemo;
public class OtherClass {
    public void test() {
        AccessDemo obj = new AccessDemo();
        System.out.println("--- Inside Different Package Non-Subclass ---");
        System.out.println("Public: " + obj.publicVar);
    }
}
