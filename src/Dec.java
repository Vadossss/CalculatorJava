import java.util.Scanner;

public class Dec extends SystemNum {
    public Dec() {
        super();
    }
    public int inputNum() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (true) {
            String input = scanner.nextLine();

            if (input.matches("\\d+")) {
                try {
                    number = Integer.parseInt(input, 10);
                    break;
                }
                catch (Exception e) {
                    System.out.println("Слишком большое число, введите значение заново");
                }
            } else {
                System.out.println("Неверный ввод. Пожалуйста, введите только цифры.");
            }
        }
        return number;
    }
//    @Override
//    public void calculationValues() {
//        long result = 0L;
//
//        if (operator.equals("/") && b == 0) {
//            setResult("Деление на ноль невозможно");
//            return;
//        }
//
//        switch (operator) {
//            case "+":
//                result = (long)a + (long)b;
//                break;
//            case "-":
//                result = (long)a - (long)b;
//                break;
//            case "/":
//                result = (long)a / (long)b;
//                break;
//            case "*":
//                result = (long)a * (long)b;
//                break;
//            default:
//                break;
//        }
//        setResult(Long.toString(result));
//    }
}
