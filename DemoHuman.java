public class DemoHuman {
    public static void main(String[] args) {
        final int MALE = 0;
        final int FEMALE = 1;
        Human Humen = new Human("Cam", 20, FEMALE, "DHXD");
        Humen.walk();
        Humen.eat();
    }
}
