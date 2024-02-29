class A1 <X> {
    X i;
    int j;
}


class A {
    public static void main(String[] args) {
        
        A1<String> obj = new A1<String>();
        obj.i = "String holder";
        System.out.println(obj.i.length());
        System.out.println(obj.j);
    }
}