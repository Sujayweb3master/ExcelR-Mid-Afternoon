package app1;

class Q {
    public static void main(String[] args) {
        
        try {
            int x = 10 / 0;
        }
        catch (ArithmeticException ex) {
            System.out.println(ex.getStackTrace());
        }
        System.out.println("This is printed!!");
    }    
}
