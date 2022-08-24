public class App {
    public static void main(String[] args) throws Exception {

        int num1;
        int num2;

        num1 = 25;

        num2 = (num1 == 10) ? 100 : 200;

        System.out.println("num2:" + num2);

        num2 = (num1 == 25) ? 100 : 200;

        System.out.println("num2: " + num2);
    }
}
