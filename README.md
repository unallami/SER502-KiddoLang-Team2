# KiddoLang

**KiddoLang** is a beginner-friendly programming language designed to introduce children to the fundamentals of programming in a fun, simple, and easy-to-understand way. The goal of the language is to make coding approachable for young learners, with a syntax that is intuitive and readable.


## Project Goals
- Create a language with minimal and friendly syntax suitable for children.
- Ensure readability and clear logical flow in code.
- Support basic operations, conditionals, and loops in an intuitive manner.
- Make learning programming fun through an educational-first design.


## Tools and Technologies

We will be using ANTLR as the Lexical analyzer, Parser and since ANTLR supports mutiple languages we will be using Java as our Interpreter.

## Target Platforms

KiddoLang is being developed to support the following systems:
- Linux
- Windows
- macOS

## Planned Language Features
- Primitives: `int`, `float`, `bool`, `string`
- Arithmetic: `+ - * /`
- Logic: `and`, `or`, `not`
- Conditionals: `if`, `? :`
- Loops: `for`, `while`
- `print()` statement

## Build and Run Instructions

## Install Java (JDK 17+) if not already installed.

Download and install Java from:  
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

After installation, verify with in commandline:
java -version

## Compile the Project
From the root directory of the project, run:

Windows:

```javac -cp ".;lib/antlr4-runtime-4.13.1.jar" src/antlr/*.java src/*.java```

macOS/Linux:

```javac -cp ".:lib/antlr4-runtime-4.13.1.jar" src/antlr/*.java src/*.java```


## Run the Parser
Run with a sample program like:

Windows:

```java -cp ".;lib/antlr4-runtime-4.13.1.jar;src" KiddoMain data/test1.kiddo```

macOS/Linux:

```java -cp ".:lib/antlr4-runtime-4.13.1.jar:src" KiddoMain data/test1.kiddo```

## Run the interpreter
Run with a sample program like:

Windows:

```java -cp ".;lib/antlr4-runtime-4.13.1.jar;src" KiddoInterpreter data/test1.kiddo```

macOS/Linux:

```java -cp ".:lib/antlr4-runtime-4.13.1.jar:src" KiddoInterpreter data/test1.kiddo```
