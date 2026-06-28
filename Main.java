public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Message msg = new Message();

        int result = calc.add(10, 20);

        msg.printMessage();
        System.out.println("10 + 20 = " + result);
    }
}
