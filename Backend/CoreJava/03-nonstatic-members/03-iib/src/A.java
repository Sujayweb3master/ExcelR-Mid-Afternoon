class A {
    A() {
        this(20);
        System.out.println("A()");
        
    }   
    // if there is common implementation for all the objects then we can keep that code in IIB.
    //
    {
        System.out.println("IIB1");
    }

    {
        System.out.println("IIB2");
    }

    A(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println("main begin");
        A a1 = new A();
        System.out.println("---------------");
        A a2 = new A(10);
        System.out.println("main end");
    }
}
