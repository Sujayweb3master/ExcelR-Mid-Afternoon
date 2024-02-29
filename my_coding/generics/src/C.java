import javafx.geometry.Dimension2D;

class C1 <X> {
    X j;
    int i;

    C1(X j, int i) {
        this.j = j;
        this.i = i;
    }

    void test() {
        System.out.println("from test");
    }
}

class C {

    public static void main(String[] args) {
        C1 <String> obj1 = new C1 <String> ("a string", 20);
        C1 <String> obj2 = new C1 <String> ("another string", 33);
        C1 <Dimension2D> obj4 = new C1 <Dimension2D> (null, 20);

        obj1.test();
        obj2.test();

    }

}
