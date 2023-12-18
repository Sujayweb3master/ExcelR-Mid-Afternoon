class M {
    static int i = 100;
    public static void main(String[] args) {
        System.out.println("a: " + i);
        int i = 10;
        System.out.println("a1 " + i);
        System.out.println("b: " + M.i);
        i = 20;
        System.out.println("c: " + i);
    }
}