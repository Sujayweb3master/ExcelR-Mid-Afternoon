interface E1 <Y> {
    void test();
    Y method1(Y obj);
}

class E2 <T> implements E1 <T> {

    public void test() {
        System.out.println("from test");
    }

    public T method1(T obj) {
        System.out.println("from method1");
        return obj;
    }
}

class E {
    public static void main(String[] args) {
        
        E2<String> obj1 = new E2 <String> ();

        obj1.test();
        obj1.method1("hello");
    }
}
