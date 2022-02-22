public abstract class Person {
    protected FullName fullName;
    protected int age;

    public Person() {
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void info() {
        System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d", fullName.firstName, fullName.lastName, age);
    }

    public abstract String activity();
}
