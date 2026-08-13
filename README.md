# QA Automation Project

Automated UI tests for web application registration and sign-in flows, implemented in Java using a Page Object pattern and Maven for build/test automation.

## Stack
- Language: Java
- Build / test: Maven
- Patterns: Page Object Model (POM)
- Notable components (in-repo): DriverManager, BasePage, RegisterPage, SignInPage

## What this repository contains
This project implements a maintainable UI test suite that drives browser-based tests (e.g., Chrome/Firefox) and isolates page behavior behind page objects to keep tests readable and resilient.

## Project structure
Top-level files and folders:
- .github/           (CI / workflow configuration - repository-level)
- .gitignore
- pom.xml            (Maven project file)
- src/
  - main/
    - java/
      - com/automation/
        - base/      BasePage.java — base helpers and common page functionality
        - core/      DriverManager.java — browser / WebDriver initialization and lifecycle
        - pages/     RegisterPage.java, SignInPage.java — page objects for target flows
  - test/            Tests live under src/test (test framework configured through Maven)

Annotated tree:
```
src/
  main/
    java/
      com/automation/
        base/       Page base classes and utilities (BasePage.java)
        core/       WebDriver bootstrap & lifecycle (DriverManager.java)
        pages/      Page objects for UI flows (RegisterPage.java, SignInPage.java)
  test/            Test classes (functional / integration tests)
pom.xml            Maven configuration and dependencies
```

## How to run
Prerequisites:
- JDK 11+ installed
- Maven installed (mvn on PATH)
- A browser driver available (or WebDriverManager configured via pom.xml)

From the repository root:

1. Verify Java & Maven:
   - mvn -v
2. Run the full test suite:
   - mvn test
3. Run a single test class:
   - mvn -Dtest=YourTestClass test

Environment variables commonly used by the suite (add or adapt in your environment or CI):
- BASE_URL — application base URL under test (e.g., https://example.com)
- BROWSER — browser to run tests on (e.g., chrome, firefox)
- HEADLESS — run browser in headless mode (true/false)

If browser drivers are not managed automatically, ensure the corresponding driver (chromedriver/geckodriver) is available in PATH or the DriverManager is configured to locate it.

## Key code pointers
- src/main/java/com/automation/core/DriverManager.java — central place to configure WebDriver, timeouts, and browser selection
- src/main/java/com/automation/base/BasePage.java — shared page utilities (waits, element helpers)
- src/main/java/com/automation/pages/RegisterPage.java — registration page actions/elements
- src/main/java/com/automation/pages/SignInPage.java — sign-in page actions/elements

## How to present this project on your CV
Concise bullet examples you can use:
- Developed a Java-based UI automation suite using Page Object Model to test registration and sign-in flows.
- Built a reusable DriverManager for cross-browser Selenium WebDriver setup and lifecycle management.
- Automated end-to-end scenarios with Maven-driven builds and test execution.
- Organized tests and page objects for maintainability and easy onboarding of new test cases.

## Notes & next steps (suggestions)
- Confirm which test framework is used (JUnit or TestNG) in pom.xml and list it explicitly in the README.
- Add example test commands and CI badges if you enable GitHub Actions / CI.
- Include a short CONTRIBUTING.md if you want others to run and extend the suite easily.

## License & Contact
- License: (add your license or `UNLICENSED` if private)
- Author: genesis-morales
- Contact: (add email or GitHub profile link)
