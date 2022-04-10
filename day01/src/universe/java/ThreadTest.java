package universe.java;

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run()-->将此线程执行的操作声明在run()中
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 *
 * 例子：遍历100以内的所有的偶数
 *
 * @author shkstart
 * @create 2021-08-22 10:04
 */
//1.创建一个继承于Thread类的子类
class MyThread extends Thread{
   // 2.重写Thread类的run()-->将此线程执行的操作声明在run()中
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        MyThread t = new MyThread();
        //4.通过此对象调用start()
        t.start();

        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i + "***********************");
            }
        }
    }
}

