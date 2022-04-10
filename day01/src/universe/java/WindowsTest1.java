package universe.java;

/**
 * @author shkstart
 * @create 2021-09-04 18:26
 */
public class WindowsTest1 {
    public static void main(String[] args) {
        Wthread1 wthread1 = new Wthread1();
        Thread t1 = new Thread(wthread1);
        Thread t2 = new Thread(wthread1);
        Thread t3 = new Thread(wthread1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();


    }
}

class Wthread1 implements Runnable{
    private static int ticket = 100;

    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为:" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
