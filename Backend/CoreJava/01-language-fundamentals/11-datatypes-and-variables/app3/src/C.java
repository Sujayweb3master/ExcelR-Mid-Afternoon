public class C {
    public static void main(String[] args) {
        int i;
        int j = 10 + i + (i = 2);
        System.out.println(i);
        System.out.println(j);
    }
}
