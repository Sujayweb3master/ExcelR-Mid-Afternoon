class K {
    K() {
        System.out.println("K()");
    }   

    K(int i) {
        System.out.println("k(int)");
    }

    public static void main(String[] args) {
        K k1 = new K();
        System.out.println("--------------------");
        K k2 = new K(10);
        System.out.println("--------------------");
    }
}
