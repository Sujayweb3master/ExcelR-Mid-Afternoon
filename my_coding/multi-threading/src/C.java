class C1 implements Runnable {

    @Override
    public void run() {
        Util.sleepThread(5000);
        for (int j = 0; j < 101; j++) {
            System.out.println("from thread " + Thread.currentThread().getName() +" : "+ j);
        }
    }
    
}

class C2 implements Runnable {

    @Override
    public void run() {
        Util.sleepThread(10000);
        for (int j = 101; j < 201; j++) {
            System.out.println("from thread " + Thread.currentThread().getName() +" : "+ j);
        }
    }
    
}

class C3 extends Thread {

    @Override
    public void run() {
        Util.sleepThread(1  5000);
        for (int j = 201; j < 301; j++) {
            System.out.println("from thread " + Thread.currentThread().getName() +" : "+ j);
        }
    }
    
}

class Util extends Thread {

    
    static void sleepThread(int m) {
        try {
            sleep(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class C {
    public static void main(String[] args) {
        
        C1 obj1 = new C1();
        Thread t1 = new Thread(obj1);
        C2 obj2 = new C2();
        Thread t2 = new Thread(obj2);
        C3 obj3 = new C3();

        t1.start();
        t2.start();
        obj3.start();
 
        
        
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();    
        // }
        System.out.println("from thread " + Thread.currentThread().getName() );

    }
}