public class Test {
    public static void main(String[] args) {
        MobileUser n1;

        n1 = new Imon();
        n1.sendMassage();
        n1.call();

        System.out.println();

        n1 = new jaman();
        n1.call();
        n1.sendMassage();

        System.out.println();

        n1 = new Rojina();
        n1.sendMassage();
        n1.call();
    }
}

