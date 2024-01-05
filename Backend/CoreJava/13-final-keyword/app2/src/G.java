class G {

    static final int i;

    static {
        i = 10;
    }
    
    final int j;

    // G() {
    //     j = 10;
    // }

    {
        j = 10;
    }

    public static void main(String[] args) {
        System.out.println(i);
    }
}
