import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
    public static void main(String[] args) throws IOException {
        String[] regions = {"Украина", "Европа", "США"};
        int[] costByRegion = costByRegions(regions);
        totalCost(costByRegion);
    }

    public static int[] informationInput(String[] regions) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[regions.length];
        for (int i = 0; i < array.length; i++) {
            System.out.print(regions[i] + ": ");
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int[] priceCallsInput(String[] regions) throws IOException {
        System.out.println("Введите цену звонков:");
        int[] priceCalls = informationInput(regions);
        return priceCalls;
    }

    public static int[] durationCallsInput(String[] regions) throws IOException {
        System.out.println("Введите продолжительность звонков:");
        int[] durationCalls = informationInput(regions);
        return durationCalls;
    }

    public static int[] costByRegions(String[] regions) throws IOException {
        int[] priceCalls = priceCallsInput(regions);
        int[] durationCalls = durationCallsInput(regions);
        int[] costByRegions = new int[regions.length];
        System.out.println("Стоимость звонков по регионам:");
        for (int i = 0; i < costByRegions.length; i++) {
            costByRegions[i] = priceCalls[i] * durationCalls[i];
            System.out.println(regions[i] + ": " + costByRegions[i]);
        }
        return costByRegions;
    }

    public static void totalCost(int[] costByRegions) throws IOException {
        int totalCost = 0;
        for (int region : costByRegions) {
            totalCost = totalCost + region;
        }
        System.out.print("Общая стоимость звонков: ");
        System.out.println(totalCost);
    }
}