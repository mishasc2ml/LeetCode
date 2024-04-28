class Foo {
    
    private Object mutex = new Object();
    private AtomicBoolean isFirstPrinted = new AtomicBoolean(false);
    private AtomicBoolean isSecondPrinted = new AtomicBoolean(false);

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized(mutex) {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            isFirstPrinted.getAndSet(true);
            mutex.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized(mutex) {
            while (true) {
                if (isFirstPrinted.get() == true) {
                    // printSecond.run() outputs "second". Do not change or remove this line.
                    printSecond.run();
                    isSecondPrinted.getAndSet(true);
                    mutex.notifyAll();
                    break;
                }
            mutex.wait();
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized(mutex) {
            while (true) {
                if (isSecondPrinted.get() == true) {
                    // printThird.run() outputs "third". Do not change or remove this line.
                    printThird.run();  
                    break;
                }
                mutex.wait();
            }
        }
    }
}