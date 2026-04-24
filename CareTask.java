class CareTask {
    String name;
    String time;   
    String date;  
    String type;  
    CareTask(String name, String time, String date, String type) {
        this.name = name;
        this.time = time;
        this.date = date;
        this.type = type;
    }

    void check(String currentTime, String currentDate, String petName) {
        if (type.equals("DAILY") && time != null && time.equals(currentTime)) {
            System.out.println("? " + name + " time for " + petName);
        }
        if (type.equals("DATE") && date != null && date.equals(currentDate)) {
            System.out.println("? Checkup today for " + petName);
        }
    }
}