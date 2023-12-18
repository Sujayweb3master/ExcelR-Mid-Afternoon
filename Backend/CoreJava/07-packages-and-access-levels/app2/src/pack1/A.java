package pack1;

public class A {

    public int i;
    protected int j;
    protected static int k = 1;
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.i);
    }   
}

class B extends A {
    int j;

    public static void main(String[] args) {
        B b1 = new B();
        A a2 = new A();

        System.out.println(a2.i);
    }
}
