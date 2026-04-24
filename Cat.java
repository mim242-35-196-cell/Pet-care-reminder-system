class Cat extends Pet {

    Cat(String name) {
        super(name);
    }

    void addDefaultTasks() {
        tasks.add(new CareTask("Medicine", "09:00", null, "DAILY"));
        tasks.add(new CareTask("Grooming", "17:00", null, "DAILY"));
        tasks.add(new CareTask("Vet Checkup", null, "2026-05-02", "DATE"));
    }
}