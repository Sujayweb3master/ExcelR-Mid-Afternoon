class L {
    int i;
    L() {
        System.out.println("from L()");
    }

    // // IIB - Instance Initialization Block
    // {
    //     i = 10;
    // }

    L(int i) {
        this();
        System.out.println("from L(int)");
        // to access the class member 'i'
        this.i = i;
    }

    public static void main(String[] args) {
        System.out.println("main begin:");
        L obj1 = new L(10);
        System.out.println(obj1.i);
        System.out.println("main end");
    }
}