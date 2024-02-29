class M0 {
    void test1() {
        System.out.println("from M0");
    }
}

class M00 extends M0 {

    void test() {
        System.out.println("from M00");
    }
}

class M000 {
    public static void main(String[] args) {
        
        M0 obj = new M00();
        obj.test1();
        ((M00)obj).test();

    }
}