class M /*extends Object */ //optional 
{
    M() {
        super();
        System.out.println("M()");  
    }   

    M(int m) {
        System.out.println("M(int)");
    }

}

class N extends M {
    N() {
        //super()
        //IIB
        this(10);
        System.out.println("N()");
    }

    {
        System.out.println("From IIB1");
    }

    N(int n) {
        super(10);
        System.out.println("N(int)");
    }



    public static void main(String[] args) {
        N n1 = new N();
        System.out.println("done");
        // String newString = n1.toString();
        // System.out.println(newString);

    }

    static {
        System.out.println("from SIB1");
    }
}


/*
 * In Java 'Object' class is the super-most class.
 * Each class whether directly or indirectly extends 'Object' class.  
 * In the 'Object' we have members which are required by all the classes
   in Java(user or inbuilt).
 * 
 */