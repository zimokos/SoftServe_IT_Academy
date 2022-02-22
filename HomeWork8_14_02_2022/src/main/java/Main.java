public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Денис", "Кастасов"), 18, 2);
        Student student2 = new Student(new FullName("Роман", "Зонов"), 20, 4);
        student1.info();
        System.out.println(student1.activity());
        student2.info();
        System.out.println(student2.activity());

        System.out.println();

        Wrapper<Integer> integerWrapper = new Wrapper<>(1);
        System.out.printf("Integer Wrapper: %d\n", integerWrapper.getValue());
        Wrapper<String> stringWrapper = new Wrapper<>("String");
        System.out.printf("String Wrapper: %s\n", stringWrapper.getValue());
        Wrapper<Boolean> booleanWrapper = new Wrapper<>(true);
        System.out.printf("Boolean Wrapper: %b\n", booleanWrapper.getValue());
    }
}
