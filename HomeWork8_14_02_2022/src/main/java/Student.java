public class Student extends Person {
    private int course;

    public Student() {
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public void info() {
        System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d, Курс: %d",
                fullName.firstName, fullName.lastName, age, course);
        System.out.println();
    }

    @Override
    public String activity() {
        return "Я учусь в университете";
    }
}
