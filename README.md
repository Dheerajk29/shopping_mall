ShoppingMall Project
This is a Spring Boot application for a shopping mall. It's set up to use Maven for dependency management and includes configurations for various Integrated Development Environments (IDEs) like STS, IntelliJ IDEA, NetBeans, and VS Code.

Technologies Used
Java: The core programming language used.

Spring Boot: A framework for creating stand-alone, production-grade Spring-based Applications.

Spring Data JPA: For simplifying data access layers.

Spring Web: For building web applications, including RESTful applications.

Maven: A tool for dependency management and building the project.

Getting Started
To get a local copy up and running, follow these simple steps.

Prerequisites
You need to have the Java Development Kit (JDK), version 17 or higher, and Apache Maven installed on your machine.

Installation & Running the Application
First, you'll need to clone the repository to your local machine. Once cloned, navigate into the project's main directory. From there, you can use the provided Maven wrapper script to build the project and run its tests. After the build is successful, you can use the same wrapper script to run the application. The application should then be running on its configured port.

Project Structure
The project follows a standard Maven project structure. The main application source code is located in the src/main/java directory. Configuration files and static resources can be found in src/main/resources. The project's dependencies and build configurations are defined in the pom.xml file. The repository also contains Maven wrapper scripts (mvnw for Unix-like systems and mvnw.cmd for Windows) to ensure a consistent build environment.

Additional Information
This project is configured to ignore common IDE-specific files and build outputs, as defined in the 

.gitignore file, ensuring a clean repository. The 

.project file indicates it is an Eclipse project configured with Java and Maven natures
