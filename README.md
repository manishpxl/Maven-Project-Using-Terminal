# ☕ Maven Project Using Terminal

A simple **Java Maven project** created entirely using **terminal commands** — no IDEs, just pure hands-on learning! 🚀  

This project demonstrates:
- ✅ How to set up Maven  
- 🧩 How to create a Java project using Maven archetype (from the terminal)  
- 🏗️ Understanding project structure (main class, helper class & tests)

---

## ⚙️ How to Set Up Maven

1. **Download & Install Maven:**
   - Visit [Maven Download Page](https://maven.apache.org/download.cgi)
   - Extract and add Maven's `bin` folder to your system PATH
   - Verify install:
     ```
     mvn -version
     ```

2. **Maven Requires JDK:**
   - Make sure Java is installed:
     ```
     java -version
     ```

---

## 📦 How This Project Was Created

Create a new Maven project from terminal:

  mvn archetype:generate -DgroupId=com.my.app -DartifactId=myapp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false


- `groupId`: your package name  
- `artifactId`: project folder name  
- `archetypeArtifactId`: use Maven's built-in quickstart archetype  

You get a ready-to-run Java skeleton in `myapp/`! 🎉  

---

## 🏗️ Project Structure
myapp/
├── pom.xml
└── src/
├── main/java/com/my/app/App.java
├── main/java/com/my/app/helper/Helper.java
└── test/java/com/my/app/AppTest.java


---

## 🖥️ How to Build & Run

**Build:**
mvn clean install

**Run main class:**
java -cp target/myapp-1.0-SNAPSHOT.jar com.my.app.App

---

## 💡 What Does It Do?

Prints:
Hello World! This is Maven Project
…and calls a simple helper method. 🧠  

---

## 📚 Useful Maven Commands

- `mvn clean install` — builds project and runs tests  
- `mvn clean` — removes target folder  
- `mvn compile` — compiles only  
- `mvn test` — runs tests  

---

## 📝 Credits

Created with ❤️ by [**manishpxl**](https://github.com/manishpxl)  
A simple Maven demo project made entirely using the terminal.

