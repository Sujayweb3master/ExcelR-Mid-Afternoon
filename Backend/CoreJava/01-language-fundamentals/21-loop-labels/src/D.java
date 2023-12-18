public class D {
    public static void main(String[] args) {
        int i, j;
        loop1:
        for( i = 0; i < 2; i++) {
            System.out.println("loop1 begins: " + i);
            for (j = 0; j < 5; j++) {
                System.out.println("loop2 begins: " + j);
                if(j > 2) {
                    continue;
                }
                System.out.println("loop2 end: " + j);

            }
            System.out.println("loop1 end: " + i);
        }
    }
}
