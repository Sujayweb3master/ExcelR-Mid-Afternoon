class D {
    void test1() {
        System.out.println("from test1()");
    }    
}

class E extends D {
    void test2() {
        System.out.println("form test2()");
    }

    public static void main(String[] args) {
        E e1 = new E();
        e1.test1();
        e1.test2();
    }
}
