package universe.java;

/**
 * 例子：创建三个窗口买票，总票数为100张，使用继承Thread类的方法
 * 线程安全问题，待解决
 *
 * @author shkstart
 * @create 2021-08-22 11:48
 */
public class WindowsTest {
    public static void main(String[] args) {
        windows w1 = new windows();
        windows w2 = new windows();
        windows w3 = new windows();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }
}

class windows extends Thread{
    private static int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(getName() + ":卖票，票号为:" + ticket);
                ticket--;
            }else {
                break;

            }
        }

    }
}
