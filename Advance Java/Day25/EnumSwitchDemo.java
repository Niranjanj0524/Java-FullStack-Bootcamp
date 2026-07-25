enum Signal {
    RED, YELLOW, GREEN
}

public class EnumSwitchDemo {
    public static void main(String[] args) {
        Signal s = Signal.RED;

        switch (s) {
            case RED:
                System.out.println("Stop");
                break;
            case YELLOW:
                System.out.println("Ready");
                break;
            case GREEN:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}
