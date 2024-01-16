import java.lang.ArithmeticException;

class A {
    public static void main(String[] args) {
        
        // ArithmeticException : Unchecked Exception (Runtime Exception)
        // int x = 10 / 0;

        // System.out.println(x);

        ArithmeticException ex = new ArithmeticException();
        System.out.println(ex.getMessage());
        // main(args);

    }   

}
