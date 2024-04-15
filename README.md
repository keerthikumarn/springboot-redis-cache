# springboot-redis-cache


# Spring Boot with Redis Cache

This is a Spring Boot application that demonstrates the integration of Redis cache to improve the performance of your application.

## Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Configuration](#configuration)
- [Testing](#testing)

## Features

- Spring Boot 3.x
- Redis cache integration
- Caching of frequently accessed data
- Configurable cache settings

## Prerequisites

- Java 17 or higher
- Redis server running on your local machine or a remote server

## Installation

Clone the repository:

   ```bash
   git clone https://github.com/keerthikumarn/springboot-redis-cache.git

```
cd spring-boot-redis-cache
./mvnw clean install

## Usage

Run the application with the below command:
```
./mvnw spring-boot:run
```
The application will start running on http://localhost:8080

## Configuration

Update the application.properties with the below entries:
```
# Redis Config
spring.cache.type=redis
spring.redis.host=localhost
spring.redis.port=6379
```

## Testing
```
./mvnw test
```