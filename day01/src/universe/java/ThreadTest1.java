package universe.java;

/**
 * 创建多线程的方式二：实现Runnable接口
 * 1.创建一个实现了Runnable接口的方法
 * 2.实现类去实现Runnable的抽象方法run()
 * 3.创建类实现的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start() --> 调用了Runnable类型的target的run()
 *
 * 例子：遍历100以内的偶数
 *
 * @author shkstart
 * @create 2021-08-22 11:31
 */
public class ThreadTest1 {
    public static void main(String[] args) {
//        3.创建类实现的对象
        MThread mThread = new MThread();
//        4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mThread);
        t1.setName("线程一");
//        5.通过Thread类的对象调用start() --> 调用了Runnable类型的target的run()
        t1.start();

        Thread t2 = new Thread(mThread);
        t2.setName("线程二");
        t2.start();

    }
}
//1.创建一个实现了Runnable接口的方法
class MThread implements Runnable{
//2.实现类去实现Runnable的抽象方法run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}