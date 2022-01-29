import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void getAge() {
        Calendar date = new GregorianCalendar();
        age = date.get(Calendar.YEAR) - birthYear;
        System.out.print("Возраст (" + this.firstName + " " + this.lastName + "): " + age);
        System.out.println();
    }

    public void input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя: ");
        this.firstName = reader.readLine();
        System.out.print("Введите фамилию: ");
        this.lastName = reader.readLine();
        System.out.print("Введите год рождения: ");
        this.birthYear = Integer.parseInt(reader.readLine());
    }

    public void output() {
        System.out.println(this.firstName + " " + this.lastName + " (" + this.birthYear + ")");
    }

    public void changeName(String firstName, String lastName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public static void main(String[] args) throws IOException {
        Person person = new Person("Георгий", "Зимокос");
        person.setBirthYear(1980);
        person.output();
        person.getAge();
        person.input();
        person.output();
        person.changeName("Heorhii", "Zymokos");
        person.output();
    }
}
