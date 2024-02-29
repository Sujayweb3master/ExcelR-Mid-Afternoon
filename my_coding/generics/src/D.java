interface D1 <T> {
    void test();
    T method1(T obj);
}

class D2 implements D1 <Integer> {

    public void test() {
        System.out.println("from test");
    }

    public Integer method1(Integer obj) {
        System.out.println("from method1");
        return obj;
    }
}

class D {
    public static void main(String[] args) {
        D2 obj1 = new D2();
        obj1.test();
        obj1.method1(32);
    }
    
}
