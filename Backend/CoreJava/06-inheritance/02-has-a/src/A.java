class A {
    int i = 10;

    void test1() {
        System.out.println("A-test1()");
    }
    
}

// has-a is also called as Composition/Aggregation.

class B {

    A obj;

    B(A ref) {
        obj = ref;
    }
    // No link is created using IIB.
    // {
    //     A a2 = new A();
    //     a2.test1();
    // }

    void test2() {
        System.out.println("B-test2()");
        obj.i = 20;
        System.out.println(obj.i);
        obj.test1();
    }
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B(new A());
        System.out.println(a1.i);
        b1.test2();
        System.out.println(a1.i);
        System.out.println("done");

    }
}