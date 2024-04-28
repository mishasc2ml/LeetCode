class Foo {
    
    private Lock lock = new ReentrantLock();
    private Condition isFirstPrinted  = lock.newCondition(); 
    private Condition isSecondPrinted = lock.newCondition();
    private boolean firstDone = false;
    private boolean secondDone = false;

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            firstDone = true;
            isFirstPrinted.signal();
        } finally {
            lock.unlock();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        try {
            while (true) {
                if (firstDone) {
                    // printSecond.run() outputs "second". Do not change or remove this line.
                    printSecond.run();
                    secondDone = true;
                    isSecondPrinted.signal();
                    break;
                }
                isFirstPrinted.await();
            }
        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try {
            while (true) {
                if (secondDone) {
                    // printThird.run() outputs "third". Do not change or remove this line.
                    printThird.run();
                    break;
                }
                isSecondPrinted.await();
            }
        } finally {
            lock.unlock();
        }
    }
}