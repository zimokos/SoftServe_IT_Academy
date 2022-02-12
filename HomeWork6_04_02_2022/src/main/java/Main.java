public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Grey", false);
        Swallow swallow = new Swallow("Black", true);
        Penguin penguin = new Penguin("Black", true);
        Chicken chicken = new Chicken("Yellow", false);

        Bird[] birds = {eagle, swallow, penguin, chicken};

        eagle.fly();
        swallow.fly();
        penguin.fly();
        chicken.fly();

        System.out.println();

        System.out.println(eagle);
        System.out.println(swallow);
        System.out.println(penguin);
        System.out.println(chicken);

        System.out.println();

        Employee employee = new Employee("Bogdan", 35, 35000.00);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
