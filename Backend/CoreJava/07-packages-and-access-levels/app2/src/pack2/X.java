package pack2;

import pack1.A;

public class X {
    public static void main(String[] args) {
        A a1 = new A();
        X x1 = new X();
        // System.out.println(x1.i);
        System.out.println(a1.i);
        System.out.println(a1);
    }
}

class Y extends pack1.A {
    int l;

    public static void main(String[] args) {
        A a2 = new A();
        Y y1 = new Y();
        System.out.println(y1.j);
        System.out.println(Y.k);
    }
}
