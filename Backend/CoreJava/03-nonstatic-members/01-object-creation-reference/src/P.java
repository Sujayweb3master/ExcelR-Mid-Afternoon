class P {
    static int j;
    int i;
    
    public static void main(String[] args) {
        // System.out.println(j);
        // int j = 100;
        // System.out.println(j);

        // System.out.println(P.j);
        // P P = new P();
        // System.out.println(P.i);
        // System.out.println(P.j);

        P p1 = new P();
        P p2 = p1;
        System.out.println(p1.i);
        System.out.println(p2.i);
        p1.i = 10;
        System.out.println(p2.i);
        p2.i = 20;
        System.out.println(p1.i); 
    }
}

class Q {
    public static void main(String[] args) {
        System.out.println(P.j);
        P p2 = new P();
        System.out.println(p2.i);
    }
}