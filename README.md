# Online Quiz Game

A web-based quiz application built with Java Servlets and JSP that allows users to test their knowledge through interactive quizzes.

## Features

- User Registration and Authentication
- User Profile Management
- Interactive Quiz Interface
- Score Tracking
- Responsive Design

## Technology Stack

- Java
- Servlets & JSP
- HTML/CSS
- JavaScript
- MySQL Database
- Maven

## Project Structure

```
online-quiz-game-main/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       ├── dao/
│   │   │       ├── model/
│   │   │       ├── servlet/
│   │   │       └── util/
│   │   └── webapp/
│   │       ├── WEB-INF/
│   │       ├── index.html
│   │       ├── login.jsp
│   │       ├── register.jsp
│   │       ├── userProfile.jsp
│   │       ├── script.js
│   │       └── style.css
└── pom.xml
```

## Screenshots

![WhatsApp Image 2025-01-14 at 16 25 43_031da951](https://github.com/user-attachments/assets/c098197f-66b8-4965-b68c-292ce81febb7)

![WhatsApp Image 2025-01-14 at 16 30 11_d982869e](https://github.com/user-attachments/assets/f55c4292-e0a9-42dd-ac28-a70fa3d611e7)

## Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/online-quiz-game.git
```

2. Navigate to the project directory:
```bash
cd online-quiz-game
```

3. Build the project using Maven:
```bash
mvn clean install
```

4. Deploy the WAR file to your servlet container (e.g., Tomcat)

## Database Setup

1. Create a MySQL database named `quiz_game`
2. Execute the SQL scripts in the `database` folder
3. Configure the database connection in `src/main/resources/config.properties`

## Usage

1. Access the application through: `http://localhost:8080/quiz-game`
2. Register a new account or login with existing credentials
3. Navigate to the quiz section and select a category
4. Complete the quiz and view your results
5. Track your progress in the user profile section

## Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature/improvement`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add some feature'`)
5. Push to the branch (`git push origin feature/improvement`)
6. Create a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.


Project Link: [https://github.com/yourusername/online-quiz-game](https://github.com/yourusername/online-quiz-game)
