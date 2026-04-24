class Dog extends Pet {

    Dog(String name) {
        super(name);
    }

    void addDefaultTasks() {
        tasks.add(new CareTask("Medicine", "08:00", null, "DAILY"));
        tasks.add(new CareTask("Walk", "18:00", null, "DAILY"));
    }
}