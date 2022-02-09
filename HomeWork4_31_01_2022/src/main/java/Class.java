import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class {
    public static void main(String[] args) throws IOException {
//        doesNumberBelongRange();
//        findMinMax();
        decipherErrorCode();
    }

    public static void doesNumberBelongRange() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float[] numbers = new float[3];
        System.out.println("Введите три дробных числа:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("#" + (i + 1) + ": ");
            numbers[i] = Float.parseFloat(reader.readLine());
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= -5 && numbers[i] <= 5) {
                System.out.println("Число " + numbers[i] + " принадлежит диапазону от -5 до 5");
            } else {
                System.out.println("Число " + numbers[i] + " не принадлежит диапазону от -5 до 5");
            }
        }
    }

    public static void findMinMax() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        System.out.println("Введите три целых числа:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("#" + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int minNumber = numbers[0];
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Минимум: " + minNumber);
        System.out.println("Максимум: " + maxNumber);
    }

    public static void decipherErrorCode() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите код ошибки: ");
        int errorCode = Integer.parseInt(reader.readLine());
        switch (errorCode) {
            case (400):
                System.out.println("Название: " + Errors.ERROR400.getDescription());
                break;
            case (401):
                System.out.println("Название: " + Errors.ERROR401.getDescription());
                break;
            case (402):
                System.out.println("Название: " + Errors.ERROR402.getDescription());
                break;
            case (403):
                System.out.println("Название: " + Errors.ERROR403.getDescription());
                break;
            case (404):
                System.out.println("Название: " + Errors.ERROR404.getDescription());
                break;
            default:
                System.out.println("Unknown error!");
        }
    }
}
