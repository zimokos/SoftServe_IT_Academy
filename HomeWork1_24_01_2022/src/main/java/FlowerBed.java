import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {
    public static void main(String[] args) throws IOException {
        int radiusFlowerBed = radiusInput();
        calculatePerimeterFlowerBed(radiusFlowerBed);
        calculateAreaFlowerBed(radiusFlowerBed);
    }

    public static int radiusInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите радиус клумбы: ");
        int radiusFlowerBed = Integer.parseInt(reader.readLine());
        return radiusFlowerBed;
    }

    public static void calculatePerimeterFlowerBed(int radiusFlowerBed) {
        double perimeterFlowerBed = 2 * Math.PI * radiusFlowerBed;
        System.out.println("Периметр клумбы равен: " + perimeterFlowerBed);
    }

    public static void calculateAreaFlowerBed(int radiusFlowerBed) {
        double areaFlowerBed = Math.PI * radiusFlowerBed * radiusFlowerBed;
        System.out.println("Площадь клумбы равна: " + areaFlowerBed);
    }
}