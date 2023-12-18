class I {
    void test() {
        System.out.println("from test");
    }
    public static void main(String[] args) {
        I i1 = new I();
        i1.test();
        System.out.println("done");
    }
}