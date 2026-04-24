# Pet Care Reminder System

## Overview

This project is a simple Java-based application designed to help users manage the daily care of their pets. It allows tracking of routine activities such as medication, walking, grooming, and scheduling veterinary checkups. The system is built with a focus on clarity, simplicity, and practical usability.

---

## Features

* Manage multiple pets within a single system
* Assign pet-specific tasks (e.g., walking for dogs, grooming for cats)
* Support both daily and date-based reminders
* Automatically generate reminders based on time and date
* Clean and easy-to-understand structure

---

## Technologies

* Java
* Object-Oriented Programming (OOP)

---

## Project Structure

* `CareTask.java` – Handles task details and reminder logic
* `Pet.java` – Abstract base class for all pets
* `Dog.java` – Implements dog-specific behaviors
* `Cat.java` – Implements cat-specific behaviors
* `User.java` – Manages pets and overall interaction
* `Main.java` – Entry point of the application

---

## How to Run

Compile and run the program using the following commands:

```
javac *.java
java Main
```

---

## Example Output

```
🔔 Walk time for Bruno
⚠ Checkup today for Bruno
```

---

## Design Approach

The system is implemented using fundamental object-oriented principles to ensure modularity and maintainability. Common behavior is defined in a base class, while specific behaviors are handled in derived classes.

---

## Future Enhancements

* Add interactive user input
* Persist data using file or database storage
* Develop a graphical user interface (GUI)

---

## Author

* Nurjahan

---

## Note

This project was developed as part of an academic exercise to demonstrate core Java and OOP concepts in a practical scenario.
