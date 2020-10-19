/**
 * @author hjy
 * @date 2020/10/9 10:15 上午
 */
// 三元运算符
public class demo04 {
    public static void main(String[] args) {
//        sendMessage();
        printNumber(1234);
    }

    public static void printNumber(int num) {
        int last = num % 10;
        int second = num / 10 % 10;
        int theer = num / 100 % 10;
        int four = num / 1000 % 10;
        System.out.println("last = " + last);
        System.out.println("second = " + second);
        System.out.println("theer = " + theer);
        System.out.println("four = " + four);
    }
//    public static void sendMessage(){
//        System.out.println("sendMessage");
//    }
}
