class W {
    W(int i) {
        System.out.println("W(int)");
    }

}
class X extends W {
//     X() {
//         super(10);
//         System.out.println("X()");
//     }

    X(int i) {
        super(10);
        System.out.println("X(int)");
    }
}
