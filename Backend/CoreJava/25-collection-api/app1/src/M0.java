// class A {
//     public int i = 10;
// }

// class B extends A {
//     public static void main(String[] args) {
//         B obj = new B();

//         System.out.println(obj.i);
//     }
// }


// /**
//  * M0
//  */

// public interface M0 {

//     public void test();
    
//     static void test1() {
//         System.out.println("from test1 ");
//     }
// }

// class N1 implements M0 {
//     public void test() {
//         System.out.println("test method implemented in N1");
//     }
// }

// class N2 {
//     public static void main(String[] args) {
//         M0 obj = new N1();
//         obj.test();

//     }
// }

class N3 {


    private class NN1 {
        int i;
        transient int j = 23;

    }

    private class NN2 extends NN1{

        {
            i = 10;
        }
    }
    /**
     * Description about the following method 
     * can be give here.
     * This is a test comment
     */
    public void test() {
        NN2 obj = new NN2();
        NN1 obj1 = obj;
        System.out.println(obj.i);
        System.out.println(obj1.i);
    }

    public static void main(String[] args) {
        N3 obj = new N3();
        obj.test();

    }
}