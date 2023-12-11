# Selenide Tests for Symphony App Frame (SAF)

This repository contains Selenide tests to automate testing for Symphony App Frame (SAF). 
These tests cover various functionalities to ensure the application works as expected.

## Prerequisites

Before running the tests, ensure you have the following tools installed:

- Maven
- Git

## Getting Started

### Clone the Repository

Clone this repository to your local machine using the following command:

```bash
git clone https://github.com/martinskopec/yunex-test-selenide.git
```


### Install Dependencies
Once you have the repository downloaded, you need to install necessary dependencies:

```bash
cd your-repository
mvn clean install
```


### Set Environment Variables
Because it's not a good practice to have sensitive information hardcoded within the code, you also need to create
`config.properties` file in the `src/main/resources/` path and write the following lines into that file.

**You need to replace `username`, `password` and `url` with the correct values!**
```bash
login_username=username
login_password=password
baseUrl=url
```

### Running the Tests

```bash
mvn clean test
```
Also you can add some parameters to this command like running in headless mode, in different browser etc.
```bash
mvn clean test -DargLine="-Dselenide.headless=true -Dbrowser=firefox"
```
<br />

Enjoy your testing! :)
