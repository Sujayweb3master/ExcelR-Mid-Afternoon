class J {
    
    static int j = 10;
    int i = 10;
    
    void test1() {
        System.out.println("from test1");
    }

    public static void main(String[] args) {
        J obj = new J();
        obj.test1();
        System.out.println(J.j);
        System.out.println(obj.i);
        // System.out.println(J.i);   // wlll give an error
        System.out.println("end");
    }

}
