import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonalInformation {
    public static void main(String[] args) throws IOException {
        String name = nameInput();
        String address = addressInput(name);
        printInformation(name, address);
    }

    public static String informationInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        return string;
    }

    public static String nameInput() throws IOException {
        System.out.print("What is your name? ");
        String name = informationInput();
        return name;
    }

    public static String addressInput(String name) throws IOException {
        System.out.print("Where are you live, " + name + "? ");
        String address = informationInput();
        return address;
    }

    public static void printInformation(String name, String address) {
        System.out.println(name + " from " + address);
    }
}