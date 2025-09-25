ShoppingMall Project
This is a Spring Boot application for a shopping mall. It appears to be set up to use Maven for dependency management and includes configurations for various IDEs like STS, IntelliJ IDEA, NetBeans, and VS Code.

Technologies Used
Java: The core programming language used.

Spring Boot: Framework for creating stand-alone, production-grade Spring-based Applications.

Spring Data JPA: For simplifying data access layers.

Spring Web: For building web applications, including RESTful applications.

Maven: Dependency management and build tool.

Getting Started
To get a local copy up and running, follow these simple steps.

Prerequisites
You need to have the following installed on your machine:

Java Development Kit (JDK) - Version 17 or higher.

Apache Maven

Installation & Running the Application
Clone the repository:

Bash

git clone <your-repository-url>
Navigate to the project directory:

Bash

cd ShoppingMall
Build the project and run the tests using the Maven wrapper:

On macOS/Linux:

Bash

./mvnw clean install
On Windows:

Bash

.\mvnw.cmd clean install
Run the application:

On macOS/Linux:

Bash

./mvnw spring-boot:run
On Windows:

Bash

.\mvnw.cmd spring-boot:run
The application should now be running on the configured port.

Project Structure
The project follows a standard Maven project structure:

src/main/java: Contains the main application source code.

src/main/resources: Contains configuration files and static resources.

src/test/java: Contains test source code.

pom.xml: Defines project dependencies and build configurations.

.mvn/wrapper: Contains Maven wrapper properties and JARs.


mvnw & mvnw.cmd: Executable Maven wrapper scripts for Unix-like systems and Windows, respectively.


Additional Information
This project is configured to ignore common IDE-specific files and build outputs, as defined in the 

.gitignore file. This ensures a clean and consistent repository. The 

.project file indicates it is an Eclipse project configured with Java and Maven natures
