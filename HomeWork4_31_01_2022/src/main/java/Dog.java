public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog() {
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void findTheOldestDog(Dog... dogs) {
        Dog theOldestDog = new Dog();
        for (Dog dog : dogs) {
            if (theOldestDog == null) {
                theOldestDog = dog;
            } else {
                if (dog.getAge() > theOldestDog.getAge()) {
                    theOldestDog = dog;
                }
            }
        }
        System.out.println("The oldest dog: " + theOldestDog.getName() + " (" + theOldestDog.getBreed() + ")");
    }

    public static void doesHaveSameName(Dog... dogs) {
        int count = 0;
        System.out.println("Are there dogs with the same name?");
        for (int i = 0; i < dogs.length - 1; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    System.out.println(dogs[i].getName());
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No matches!");
        }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bart", Breed.DOBERMANN, 3);
        Dog dog2 = new Dog("Berta", Breed.GERMAN_SHEPHERD, 5);
        Dog dog3 = new Dog("Cappuccino", Breed.ROTTWEILER, 10);

        findTheOldestDog(dog1, dog2, dog3);
        doesHaveSameName(dog1, dog2, dog3);
    }
}
