class F {
    int i;
    boolean j;
    F() {
        System.out.println("F()");
        i = 10;
    }    
    public static void main(String[] args) {
        F f1 = new F();
        System.out.println("from main: " + f1.i);
        System.out.println("from main: " + f1.j);
    }
}
