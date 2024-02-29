class F1 <T extends M1> { // bounded generic
        // can extend one class and any number of interfaces separated by '&'
    T i;
    
    public void test1() {
        i.test();
    }

}

class M5 {

}

class F {
    public static void main(String[] args) {
        
        F1 <M1> obj1 = new F1 <> ();
        F1 <M2> obj2 = new F1 <> ();
        F1 <M3> obj3 = new F1 <> ();
        F1 <M4> obj4 = new F1 <> ();  

        obj1.i.s1 = "a string";
        obj2.i.s1 = "another string";

    }
}
