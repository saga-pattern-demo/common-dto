# Common-DTO Service

### Overview

The Common-DTO Service Java is a Java-based service that provides a set of common Data Transfer Objects (DTOs) for use across multiple microservices or applications within a larger software ecosystem. This service is designed to promote code reusability and maintainability by centralizing the definition and management of DTOs that are frequently used in various parts of your system.

### Table of Contents

1. [Getting Started](#Getting-Started)
    - [Prerequisites](####Prerequisites)
    - [Installation and Deploy](####Installation-and-Deploy)
2. [Usage](#Usage)

### Getting Started

#### Prerequisites

Before you can use the Common-DTO Service, make sure you have the following prerequisites installed on your system:

-   Java Development Kit (JDK) 17
-   Maven (for building and managing dependencies)

#### Installation and Deploy

1. Clone the Common-DTO Service repository to your local machine:
    ```
    https://github.com/saga-pattern-demo/common-dto.git
    ```
2. Navigate to the project directory:
    ```
    cd common-dto
    ```
3. Deploy to Nexus:

    - Make sure you replace the placeholders with your actual information in _.mvn/maven-settings.xml_:

        ```
        <settings xmlns="http://maven.apache.org/SETTINGS/1.2.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.2.0 http://maven.apache.org/xsd/settings-1.2.0.xsd">
            <servers>
                <server>
                    <id>nexus</id>
                    <username>your-username</username>
                    <password>your-password</password>
                </server>
            </servers>

            <profiles>
                <profile>
                    <id>nexus</id>
                    <repositories>
                        <repository>
                            <id>repository-id</id>
                            <name>nexus-repo</name>
                            <url>http://your-repository-url</url>
                        </repository>
                    </repositories>
                    <properties>
                        <altDeploymentRepository>
                            nexus::default::http://your-repository-url
                        </altDeploymentRepository>
                    </properties>
                </profile>
            </profiles>

            <activeProfiles>
                <activeProfile>nexus</activeProfile>
            </activeProfiles>

        </settings>
        ```

    - Then deploy it:
        ```
        mvn -s .mvn/maven-settings.xml clean deploy
        ```

### Usage

This service provides a set of common DTOs that can be easily integrated into your microservices or applications. To use a DTO, follow these steps:

1. First, we need to add custom setting maven file for download this dependency from nexus

    - Create a new file named maven-settings.xml in a directory of your choice.
    - Open the maven-settings.xml file with a text editor and paste the following code, replacing the placeholders with your actual information:

        ```
        <settings xmlns="http://maven.apache.org/SETTINGS/1.2.0"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.2.0 http://maven.apache.org/xsd/settings-1.2.0.xsd">
            <servers>
                <server>
                    <id>repository-id</id>
                    <username>your-username</username>
                    <password>your-password</password>
                </server>
            </servers>
            <profiles>
                <profile>
                    <id>nexus</id>
                    <repositories>
                    <repository>
                        <id>repository-id</id>
                        <url>http://your-repository-url</url>
                    </repository>
                    </repositories>
                </profile>
            </profiles>

            <activeProfiles>
                <activeProfile>nexus</activeProfile>
            </activeProfiles>
        </settings>
        ```

    - Install maven dependencies:
        ```
        mvn -s path/to/maven-settings.xml clean install -U -Pnexus -DskipTests
        ```

2. Import the Common-DTO Service library into your project's dependencies. You can do this by adding the following Maven dependency to your project's _pom.xml_ file:
    ```
    <dependency>
        <groupId>com.saga</groupId>
        <artifactId>common</artifactId>
        <version>0.0.2</version>
    </dependency>
    ```
3. Use the imported DTOs in your code by simply including their package and class names in your imports. For example:
    ```
    import com.saga.common.dto.OrderRequestDTO;
    ```
