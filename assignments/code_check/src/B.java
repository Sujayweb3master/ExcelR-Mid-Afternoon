class B {
    static {
        printValue(); // IFR error
    }

    static int value = 5;

    static void printValue() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        System.out.println("done");
        long l = (long)2323323.23;
        double d = l;
    }
}