package app1;

public class X
{
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            System.out.println("try begin");
            main(args);
            System.out.println("try end");

        }
        catch(StackOverflowError er) {
            System.out.println("from catch");
        }
        catch(OutOfMemoryError er) {
            System. out.println("from catch");
        }
        catch(ClassCastException ex) {
            System.out.println("from catch");
        }
        System.out.println("main end");

    }
}
