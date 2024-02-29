class B1 implements Runnable {

    @Override
    public void run() {
        for (int j = 0; j < 101; j++) {
            System.out.println("from thread " + Thread.currentThread().getName() +" : "+ j);
        }
    }
    
}

class B {
    public static void main(String[] args) {
        
        B1 obj1 = new B1();
        Thread t1 = new Thread(obj1);

        t1.start();
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();    
        // }
        System.out.println("from thread " + Thread.currentThread().getName() );

    }
}