class M {
    void test1() {
        System.out.println("from test1");
    }    

    static {
        M obj = new M();
        obj.test1();
    }
}
