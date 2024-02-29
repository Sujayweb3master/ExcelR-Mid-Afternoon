class A1 extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("from thread " + currentThread().getName());
        }
    }
}

class A2 extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("from thread " + currentThread().getName());
        }
    }
}

class A3 extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("from thread " + currentThread().getName());
        }
    }
}

class A {
    public static void main(String[] args) {
        
        A1 obj1 = new A1();
        A2 obj2 = new A2();
        A3 obj3 = new A3();


        obj1.start();
        obj2.start();
        obj3.start();

        System.out.println("from thread " + Thread.currentThread().getName() );
    }
}