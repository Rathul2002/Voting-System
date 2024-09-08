# Online Voting System

## Description

The Online Voting System is a web-based application designed to facilitate secure and anonymous voting. The system verifies voters via their EPIC ID and Date of Birth (DOB), sends an OTP (One-Time Password) to their registered email, and ensures secure voting by verifying the OTP. The application maintains voter anonymity and ensures that each voter can only vote once.

## Features

- **Voter Verification**: Verifies voters using EPIC ID and DOB.
- **OTP Generation and Validation**: Sends an OTP to the voter’s email and validates it.
- **Vote Submission**: Allows authenticated users to cast their votes for different political parties.
- **Email Notifications**: Sends OTPs via email and maintains their expiry.
- **Anonymous Voting**: Ensures voter anonymity by using OTPs and secure encoding methods.

## Technologies Used

- **Java**: Backend development.
- **Spring Boot**: Framework for building the RESTful API.
- **Hibernate/JPA**: ORM for database interactions.
- **MySQL**: Database to store voter information and voting data.
- **JavaScript**: Frontend logic for interacting with the backend API.
- **HTML/CSS**: Structure and styling for the web interface.
- **Spring Mail**: For sending OTP emails.
- **Scheduled Tasks**: For managing OTP expiry and cleanup.

## Setup

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/Rathul2002/Voting-System.git
    cd Voting-System
    ```

2. **Setup the Database**:
    - Create a MySQL database and configure the connection in `application.properties` or `application.yml` file.

3. **Build the Project**:
    ```bash
    ./mvnw clean install
    ```

4. **Run the Application**:
    ```bash
    ./mvnw spring-boot:run
    ```

5. **Access the Application**:
    - Open your web browser and navigate to `http://localhost:8081`.

## API Endpoints

- **Generate OTP**:
  - `POST /api/generateOtp`
  - Parameters: `EpicNo` (EPIC ID), `Dob` (Date of Birth)
  - Response: OTP sent to email if credentials are valid.

- **Validate OTP**:
  - `POST /api/validateOtp`
  - Parameters: `EpicNo` (EPIC ID), `Otp` (One-Time Password)
  - Response: Validation result.

- **Submit Vote**:
  - `POST /api/giveVote`
  - Parameters: `Vote` (Party Name)
  - Response: Vote submission status.

## Frontend

The frontend is a simple HTML/CSS/JavaScript interface that interacts with the backend API. The user interface includes:
- **Initial Screen**: For entering EPIC ID and DOB.
- **OTP Screen**: For entering the received OTP.
- **Voting Screen**: For casting votes.
- **Confirmation Screen**: Displayed after a successful vote.

## Scheduled Tasks

- **Delete Expired OTPs**: Periodically removes expired OTPs from the database.

## Configuration

- **Email Sender**: Update the `JavaMailSender` configuration to use your email server.
- **OTP Expiry Time**: Configurable in `OtpServices.java`.

## Contributing

Feel free to fork the repository and submit pull requests. Please ensure your changes are well-tested and documented.
