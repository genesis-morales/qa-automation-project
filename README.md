# QA Automation Suite — Registration & Sign-In Flows

![Java](https://img.shields.io/badge/Java-11%2B-orange)
![Maven](https://img.shields.io/badge/Build-Maven-blue)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green)
![Pattern](https://img.shields.io/badge/Pattern-Page%20Object%20Model-lightgrey)

Automated UI test suite for a web application's registration and sign-in flows, built with **Java + Selenium WebDriver**, structured using the **Page Object Model (POM)**, and driven by **Maven**.

The goal of this project is to demonstrate a clean, maintainable approach to UI test automation: isolating page interactions from test logic, centralizing browser lifecycle management, and keeping the suite easy to extend as new flows are added.

---

## ✨ Highlights

- **Page Object Model** architecture — test logic is fully decoupled from UI selectors and page behavior.
- **Centralized WebDriver management** via `DriverManager`, handling browser initialization, configuration, and teardown.
- **Reusable base layer** (`BasePage`) providing common waits and element-interaction helpers, reducing duplication across page classes.
- **Configurable execution** through environment variables (`BASE_URL`, `BROWSER`, `HEADLESS`), making the suite portable across local and CI environments.
- **Maven-driven** build and test execution, ready to integrate into a CI/CD pipeline (GitHub Actions).

---

## 🧱 Stack

| Category   | Technology                          |
|------------|--------------------------------------|
| Language   | Java                                  |
| Automation | Selenium WebDriver                    |
| Build/Test | Maven                                 |
| Pattern    | Page Object Model (POM)               |
| CI         | GitHub Actions (`.github/`)           |

---

## 📁 Project Structure

```
src/
├── main/java/com/automation/
│   ├── base/       BasePage.java        # Shared page utilities (waits, element helpers)
│   ├── core/        DriverManager.java   # WebDriver bootstrap & lifecycle
│   └── pages/        RegisterPage.java    # Registration flow page object
│                     SignInPage.java      # Sign-in flow page object
└── test/                                # Test classes (functional/integration)
pom.xml                                   # Maven configuration and dependencies
.github/                                  # CI workflow configuration
```

---

## 🚀 Getting Started

### Prerequisites
- JDK 11+
- Maven (`mvn` available on PATH)
- A browser driver available locally, or WebDriverManager configured in `pom.xml`

### Run the suite

```bash
# Verify environment
mvn -v

# Run the full test suite
mvn test

# Run a single test class
mvn -Dtest=YourTestClass test
```

### Configuration

The suite reads the following environment variables:

| Variable   | Description                          | Example                  |
|------------|----------------------------------------|---------------------------|
| `BASE_URL` | Base URL of the application under test | `https://example.com`     |
| `BROWSER`  | Browser to run tests on                | `chrome`, `firefox`       |
| `HEADLESS` | Run browser in headless mode           | `true` / `false`          |

If drivers aren't managed automatically, make sure `chromedriver`/`geckodriver` is available on PATH, or configured through `DriverManager`.

---

## 🔑 Key Files

| File | Purpose |
|------|---------|
| `core/DriverManager.java` | Central WebDriver configuration, timeouts, browser selection |
| `base/BasePage.java` | Shared page utilities (waits, element helpers) |
| `pages/RegisterPage.java` | Registration page actions and elements |
| `pages/SignInPage.java` | Sign-in page actions and elements |

---

## 👤 Author

**Génesis Morales** — [GitHub](https://github.com/genesis-morales)

## 📄 License

UNLICENSED — private/portfolio project. Update if publishing under an open license.
