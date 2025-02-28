# API Login com Spring Boot

Este projeto é uma API de autenticação e login utilizando **Spring Boot** e **Spring Security**. Ele implementa autenticação baseada em JWT e inclui exemplos de proteção de endpoints para diferentes roles de usuário.

## Funcionalidades

- Login com email e senha.
- Emissão de tokens JWT para autenticação.
- Proteção de endpoints com diferentes níveis de acesso (público, usuário autenticado e administrador).
- Testes automatizados para validação da segurança dos endpoints.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Security
- JWT
- Lombok
- JUnit 5 e MockMvc para testes

## Endpoints

### Público
- **`GET /`**: Endpoint público.
  - **Exemplo de requisição:**
    ```http
    GET / HTTP/1.1
    Host: localhost:8080
    ```

### Protegido
- **`GET /secured`**: Disponível para usuários autenticados.
  - **Exemplo de requisição:**
    ```http
    GET /secured HTTP/1.1
    Host: localhost:8080
    Authorization: Bearer <seu-token-jwt>
    ```
- **`GET /admin`**: Disponível apenas para administradores.
  - **Exemplo de requisição:**
    ```http
    GET /admin HTTP/1.1
    Host: localhost:8080
    Authorization: Bearer <seu-token-jwt>
    ```

### Login
- **`POST /auth/login`**: Recebe email e senha, retorna um token JWT.
  - **Exemplo de requisição:**
    ```http
    POST /auth/login HTTP/1.1
    Host: localhost:8080
    Content-Type: application/json

    {
      "email": "test@test.com",
      "password": "test"
    }
    ```
