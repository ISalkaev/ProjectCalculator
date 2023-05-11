import java.util.Scanner;

public class ProjectCalculator {
    public static String calc(String input) throws Exception {
        String[] tokens = input.split("\\s+");
        if (tokens.length != 3){
            throw new RuntimeException("Строка не является математической операцией");
        }
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[2]);
        char op = tokens[1].charAt(0);
        int result = 0;

        switch (op){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if(b == 0){
                    throw new Exception("Division by zero");}
                result = a / b;
                break;
            default:
                throw new Exception("Строка не является математической операцией");
        }
        if(a < 1 || a > 10 || b < 1 || b > 10){
            throw new Exception("Введите цифры от 1 до 10!");
        }
       
        return Integer.toString(result);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные, (пример: 1 + 2): ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            String result = calc(input);
            System.out.println("Result: "+result);

        }
    }
}
