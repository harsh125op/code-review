# Code Review

A Spring Boot-based AI-powered code review service that leverages Google Generative AI to provide detailed, actionable feedback on code snippets. Designed for developers looking to improve code quality, maintainability, performance, and security through automated expert-level reviews.

---

## Table of Contents

- [Overview](#overview)
- [Main Features](#main-features)
- [Architecture & Services](#architecture--services)
- [How it Works](#how-it-works)
- [API Endpoints](#api-endpoints)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## Overview

**Code Review** acts as an automated senior code reviewer with 7+ years of experience, focusing on:
- Code quality and best practices
- Efficiency and performance
- Error detection and security
- Scalability and maintainability

Developers submit code snippets via an HTTP API and receive thorough, constructive reviews based on industry standards and latest practices.

---

## Main Features

- **AI-Powered Reviews**: Integrates Google Generative AI (Gemini model) for expert-level code analysis.
- **Feedback Guidelines**: Reviews cover readability, maintainability, performance, security compliance, style consistency, DRY/SOLID principles, simplicity, documentation, and modern practices.
- **Actionable Output**: Highlights issues, suggests improvements, provides real code examples, and encourages best practices.
- **REST API**: Simple POST endpoint to submit code and receive reviews.
- **Spring Boot**: Robust backend with test coverage and easy configuration.

---

## Architecture & Services

### CodeReviewApplication

- Entry point for the Spring Boot application.
- Enables WebMVC for RESTful endpoints.

### Service Layer

#### AiService

- **Purpose**: Core business logic for AI-powered code review.
- **How It Works**:
  - Receives a code snippet via a `ReviewReq` DTO.
  - Constructs a prompt with detailed instructions for the AI (acting as a senior code reviewer).
  - Calls Google Generative AI (Gemini 2.5 Flash) using the `Client` bean.
  - Returns the AI-generated review via a `ReviewRes` DTO.

- **Review Guidelines** (enforced by the AI prompt):
  1. Provide constructive feedback, explaining why changes are needed.
  2. Suggest code improvements and refactoring.
  3. Detect and fix performance bottlenecks.
  4. Ensure security compliance (e.g., SQL injection, XSS, CSRF).
  5. Promote consistency (formatting, naming, style guides).
  6. Adhere to DRY & SOLID principles.
  7. Identify unnecessary complexity.
  8. Verify test coverage.
  9. Advise on documentation.
  10. Encourage modern frameworks, libraries, and patterns.

- **Tone & Output**: Precise, constructive, with real-world examples and actionable fixes.
- **Example**:
  - Points out async errors, missing error handling, poor structure.
  - Suggests improved code with explanations.

#### AICOnfig

- Configures the Google GenAI client bean for dependency injection.

### Controller Layer

#### AiController

- Exposes REST API for code review:
  - **POST /ai/get-review**: Accepts a JSON payload with the code, returns review text.

### DTOs

- `ReviewReq`: Contains the code string to be reviewed.
- `ReviewRes`: Contains the review result string.

---

## How it Works

1. **Send a code snippet** via HTTP POST to `/ai/get-review`.
2. **AI processes the code** using a prompt tailored for senior code review expertise.
3. **Response** contains:
   - List of issues found
   - Suggested fixes and improvements
   - Examples and explanations

---

## API Endpoints

### POST /ai/get-review

- **Request Body**:
    ```json
    {
      "code": "your_source_code_here"
    }
    ```
- **Response**:
    ```json
    {
      "review": "Detailed review text here."
    }
    ```

---

## Getting Started

### Prerequisites

- Java 17+
- Maven

### Installation

```bash
git clone https://github.com/harsh125op/code-review.git
cd code-review
./mvnw clean install
```

### Run Locally

```bash
./mvnw spring-boot:run
```

### Test

```bash
./mvnw test
```

---

## Contributing

1. Fork the repo
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## License

**No explicit license specified.** Please contact [harsh125op](https://github.com/harsh125op) for usage details.

---

## Contact

For support or business inquiries, please open an issue or contact the repository owner.

---