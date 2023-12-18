class M {

    int i;

     {
        System.out.println("this is IIB1");
     }

     static {
        System.out.println("this is SIB1");
     }

     public static void main(String[] args) {
        
        System.out.println("main begin");
        M obj1 = new M();
        System.out.println("main end");
     }

}
