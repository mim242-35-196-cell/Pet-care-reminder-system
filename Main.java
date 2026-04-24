public class Main {
    public static void main(String[] args) {

        User user = new User("Rahim");

        Pet dog = new Dog("Bruno");
        Pet cat = new Cat("cinnamon");
        Pet cat1 = new Cat("pimpi");

        
        dog.addTask(new CareTask("Vet Checkup", null, "2026-04-25", "DATE"));
        cat.addTask(new CareTask("Vet Checkup", null, "2026-04-30", "DATE"));
        cat1.addTask(new CareTask("Medicine","09:00", null,"DATE"));

        user.addPet(dog);
        user.addPet(cat);

        String time = "09:00";
        String date = "2026-04-30";

        user.checkAll(time, date);
    }
}