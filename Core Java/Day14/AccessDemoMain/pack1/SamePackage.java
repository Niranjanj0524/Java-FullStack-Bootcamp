package AccessDemoMain.pack1;
public class SamePackage {
    public void test() {
        AccessDemo obj = new AccessDemo();
        System.out.println("--- Inside Same Package ---");
        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);
    }
}
