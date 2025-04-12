# S01.01-InheritancePolymorphism_Level01
## 🎶 Java OOP Exercises – Music, Vehicles, Smartphones & Newsroom

---

## 📝 Description

This repository contains a collection of Java Object-Oriented Programming (OOP) exercises structured across three levels. Each exercise is designed to help you understand and apply OOP principles such as inheritance, polymorphism, abstraction, encapsulation, and interface implementation in a variety of real-world inspired scenarios.

- Use **Eclipse** or **IntelliJ IDEA** for all exercises.
- Follow the best practices detailed in **Sprint 0** for consistent delivery in your GitHub repositories.
- You may build the projects using **Maven**, **Gradle**, or plain **Java**.
- All code must be written in **English**.

---

## 🎯 Objectives

- Apply and understand core **OOP principles** in Java.
- Learn to use **abstract classes**, **inheritance**, **interfaces**, and **polymorphism**.
- Practice building **interactive CLI-based applications** in Java.

---

## 📚 Exercise Overview

---

### Level 1

#### Exercise 1 – Musical Instruments

Create a class hierarchy to represent a group of musical instruments:
- `WindInstrument`, `StringInstrument`, and `PercussionInstrument`
- All share common attributes: `name` and `price`, and an abstract method `play()` which is implemented by each subclass:
  - Wind → "Wind instrument is playing"
  - String → "String instrument is playing"
  - Percussion → "Percussion instrument is playing"

Also, demonstrate class loading behavior in Java using static blocks and initialization blocks.

---

#### Exercise 2 – Car Class

Create a `Car` class with the following attributes:
- `brand` → `static final`
- `model` → `static`
- `power` → `final`

Add methods:
- `brake()` → static → prints "The vehicle is braking"
- `accelerate()` → non-static → prints "The vehicle is accelerating"

Show how to call both methods from the `main()` method and explain which fields can be initialized in the constructor.

---

### Level 2

#### Exercise 1 – Smartphone

Create a `Phone` class with attributes `brand` and `model`, and method:
- `call(String number)` → prints "Calling {number}..."

Define two interfaces:
- `Camera` → method `takePhoto()` → prints "Taking a photo"
- `Clock` → method `alarm()` → prints "Alarm is ringing"

Create a `Smartphone` class that extends `Phone` and implements both interfaces.

Instantiate a `Smartphone` object from `main()` and call all its methods.

---

### Level 3

#### Exercise 1 – Newsroom System

Create a newsroom system where news articles are categorized by sport: **Football**, **Basketball**, **Tennis**, **F1**, and **Motorcycling**.

**Journalist**:
- Attributes: `name`, `DNI` (immutable), and `salary` (shared by all)
- Initial salary: €1500
- Journalists can write multiple articles

**News Article**:
- Attributes: `headline`, `text` (initially empty), `score`, `price`
- Each sport-specific subclass includes additional context:
  - Football: competition, club, player
  - Basketball: competition, club
  - Tennis: competition, players
  - F1: team
  - Motorcycling: team

**Price Calculation**:
Each news type has a base price with conditional additions based on competition, team, or player names.

Example – Football:
- Base €300
- + Champions League €100
- + Barça or Madrid €100
- + Torres or Benzema €50
- = **€550**

**Score Calculation**:
Each news type has a base score with extra points for certain conditions.

Example – Football:
- Base 5
- + Champions League 3
- + Barça 1
- + Ferran Torres 1
- = **10 points**

**Menu from `main()`**:
1. Add journalist  
2. Remove journalist  
3. Add news to journalist  
4. Delete news (by journalist and headline)  
5. Show all news by journalist  
6. Calculate news score  
7. Calculate news price  

---

## 💻 Technologies Used

- Java **JDK 21** (Oracle)
- IntelliJ IDEA or Eclipse
- Git & GitHub
- (Optional) Maven or Gradle for build automation

---

## 📋 Requirements

- Java Development Kit (**JDK 21**)
- Git (to clone the repository)
- A compatible IDE such as **IntelliJ IDEA** or **Eclipse**

---

## 🛠️ Installation

1. **Clone the repository**  
   ```bash
   git clone https://github.com/DiegoBalaguer/S0101-InheritancePolymorphism.git
   ```
2. **Open in your IDE**  
Open IntelliJ IDEA or Eclipse and import the cloned project. If you're using Maven or Gradle, import it as a corresponding project type. Otherwise, import it as a regular Java project.

3. **Set up JDK**  
Make sure the project is configured to use Oracle JDK 21. Set the language level to 21 if required.

---

## ▶️ Execution

To run the project:
1. Locate the class containing the main() method (usually in the main or app package).
2. Right-click the file and choose Run, or use the terminal:
   ```bash
   java Main
   ```
3. Interact with the console-based menu to test each exercise.

💡 Make sure the main() method is properly set as the entry point in case you're using a build system like Maven or Gradle.

---
	
## Deployment
### 🌐 Deployment

This is an educational project and is **not intended for production deployment**.

However, if you wish to package and run the application as a `.jar` file, follow these steps:

```bash

# Compile the main Java file
javac Main.java

# Package all class files into a runnable JAR named 'OOPExercises.jar'
jar cfe OOPExercises.jar Main *.class

# Execute the JAR file
java -jar OOPExercises.jar
```

---

## 📦 Repository

You can find the source code on GitHub:
🔗 https://github.com/DiegoBalaguer/S0101-InheritancePolymorphism.git

---

## ✅ Author Notes

Feel free to fork, clone, or contribute to enhance the project. These exercises are designed as building blocks to strengthen your understanding of Java OOP through hands-on practice.

Happy coding! 🚀"# S0101-InheritancePolymorphism" 
