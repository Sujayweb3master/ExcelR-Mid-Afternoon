package pack1;

class C {
    private C() {
        System.out.println("C()");
    } 
    
    C(int i) {
        System.out.println("C(int)");
    }

}

class D extends C {
    D() {
        super(10);
    }
}
