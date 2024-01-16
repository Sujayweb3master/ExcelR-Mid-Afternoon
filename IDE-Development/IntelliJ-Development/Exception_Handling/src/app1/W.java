package app1;

class W {
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            System.out.println("try begin");
            String s1 = "hello";
            String s2 = s1.substring(0,3);
            System.out.println(s2);
            System.out.println("try end");

        }
        catch(StringIndexOutOfBoundsException ex) {
            System.out.println("from catch");
        }
        System.out.println("main end");
    }    
}
