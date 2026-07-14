import AccessDemoMain.pack1.AccessDemo;
import AccessDemoMain.pack1.SamePackage;
import AccessDemoMain.pack2.SubClass;
import AccessDemoMain.pack2.OtherClass;
public class Main {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();
        demo.show();
        SamePackage sp = new SamePackage();
        sp.test();
        SubClass sc = new SubClass();
        sc.test();
        OtherClass oc = new OtherClass();
        oc.test();
    }
}
