class F {
    static int i; 
    
    void testF() {
        System.out.println("from F");
    }
}

class G extends F {
    static int j;

    void testG() {
        System.out.println("from G");
    }

    static void method() {
        System.out.println("from method of G");
    }

    public static void main(String[] args) {
        System.out.println(G.i);
        System.out.println(G.j);
    }
}

class H extends G {
    public static void main(String[] args) {
        H h1 = new H(); 

        h1.testF();
        h1.testG();
        H.method();

    }
}