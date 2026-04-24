import java.util.ArrayList;
import java.util.List;

class User {
    String name;
    List<Pet> pets = new ArrayList<>();

    User(String name) {
        this.name = name;
    }

    void addPet(Pet pet) {
        pets.add(pet);
    }

    void checkAll(String time, String date) {
        for (Pet p : pets) {
            p.show(time, date);
        }
    }
}