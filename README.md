# Paper Kotlin Plugin Template

This is a template repository for creating Minecraft plugins using Kotlin for the Paper server software. It provides a basic structure and essential setup to kickstart your plugin development.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting started](#getting-started)
    - [Using the template](#using-the-template)
    - [Building your plugin](#building-your-plugin)
    - [Running the server](#running-the-server)
- [Sidenotes](#sidenotes)
- [License](#license)

## Features

- A pre-configured Gradle setup for building Paper plugins with Kotlin. The built-in libraries contains:
  - [shadowJar](https://github.com/johnrengelman/shadow): to shade your dependencies into the plugin.
  - [run-paper](https://github.com/jpenilla/run-task): to create a server with your compiled plugin and desired version.
  - [Lamp](https://github.com/Revxrsal/Lamp): a simple to use commands annotation framework with Brigadier built into it.
- A basic plugin template with sample code to get you started.
- Integration with Paper API for Minecraft plugin development.
- A well-organized project structure to keep your code clean and maintainable.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- [Java Development Kit (JDK) 8 or later](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Gradle](https://gradle.org/install/) or the built-in wrapper
- [Paper server software](https://papermc.io/) or the built-in [run-paper](https://github.com/jpenilla/run-task) task _(I'd assume you want to test your code...)_

## Getting started

To get started with this template, follow these steps:

### Using the template

1. Click on the "Use this template" button at the top of this repository to create a new repository based on this template.
2. Clone your new repository to your local machine using Git:

```shell
git clone https://github.com/your-username/paper-kotlin-plugin-template.git
```

3. Open the project in your preferred Kotlin-compatible IDE (e.g., IntelliJ IDEA).
4. Customize the project information in the `build.gradle.kts` file.
5. Modify the `src/main/kotlin/com/example/pluginName/PluginName.kt` file to start building your plugin.

### Building your plugin

You can build your plugin using Gradle:

```shell
./gradlew build
```

This command will compile your code, package it into a JAR file, and place it in the `build/libs/` directory.

### Running the server

You can automatically create a Paper server using Gradle:

```shell
./gradlew runServer
```

You can modify the server version in the `build.gradle.kts` file.

## Sidenotes

- Remember to change the plugin's package and information on the `plugin.yml` file.
- You can learn more about Lamp by [clicking here](https://github.com/Revxrsal/Lamp/wiki).
- We have a great community at [learnspigot.com](https://learnspigot.com/). You should definitely check it out! #notsponsored
- Feel free to implement anything you need and wish! The code is all yours.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
