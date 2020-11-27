class Multiply {
    void mul(int a, int b) {
        System.out.println("Product of two=" + (a * b));
    }

    void mul(int a, int b, int c) {
        System.out.println("Product of three=" + (a * b * c));
    }
}
public class multiply {
    public static void main(String args[]) {
        Multiply m = new Multiply();
        m.mul(6, 5);
        m.mul(4, 6, 5);
    }
}
