package universe.exer;

/**
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 * @author shkstart
 * @create 2021-08-22 10:31
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
//new Thread(){
//@Override
//public void run() {
//        for (int i = 0; i < 100; i++) {
//        if(i % 2 == 0){
//        System.out.println(Thread.currentThread().getName() + ":" + i);
//        }
//        }
//        }
//        }.start();


// new Thread(){
//@Override
//public void run() {
//        for (int i = 0; i < 100; i++) {
//        if(i % 2 != 0){
//        System.out.println(Thread.currentThread().getName() + ":" + i);
//        }
//        }
//        }
//        }.start();


class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
