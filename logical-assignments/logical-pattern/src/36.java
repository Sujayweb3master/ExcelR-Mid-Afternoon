class P36 {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + (i - 1));
            }
            for (int j = 2; j <= i; j++){
                System.out.print(i + (i - 1));
            }
            System.out.println();
        }
        
    }
}