# Simply RESTful Api (interview task)

## Project
Structure: Maven project

Language: Java

Framework: Spring Boot

## Implementation
1. Api is available on port 8080 
2. endpoint for downloading users, list elements contain name and last name
```sh
http://localhost:8080/users
```
3. endpoint for downloading user details, the name, last name, date of birth, account number
```sh
http://localhost:8080/users/detail
```

## Info
Application is not ready to accept data from database

To change database connection settings, set your database name in file src.main.resources.application.properties
