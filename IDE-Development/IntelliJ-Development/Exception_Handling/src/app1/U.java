package app1;

class U {

    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            System.out.println("try begin");
            Object obj = new Object();
            U u1 = (U) obj;
            System.out.println("try end");

        }
        catch(StringIndexOutOfBoundsException ex) {
            System.out.println("from catch");
        }
        catch(ClassCastException ex) {
            System.out.println("from catch");
        }
        System.out.println("main end");
    }    
}
    

