class R {
    
    public static void test() {
        System.out.println("from test");
    }
    public static void main(String... args) {
        System.out.println("main begin");
        test();
        System.out.println("main end");
    }
}