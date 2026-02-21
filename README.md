# 🔐 Login API - Spring Boot Authentication (JWT)

Este projeto é uma API REST de autenticação desenvolvida com **Spring Boot** e **Spring Security**, utilizando **JWT (JSON Web Token)** para controle de acesso.  
O objetivo é consolidar conceitos de autenticação, segurança, arquitetura em camadas e boas práticas de configuração.

> 🚀 Projeto desenvolvido para fins de aprendizado e portfólio.

---

## 🧩 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Security
- JWT (Auth0)
- H2 Database (Ambiente de desenvolvimento)
- Maven
- Lombok
- Spring Profiles (dev / prod)

---

## 📁 Estrutura do Projeto
com.example.login_arth_api

- controllers # Camada de controle (REST endpoints)

- domain.user # Entidades JPA

- dto # Data Transfer Objects

- infra.security # Configurações de segurança e JWT

- repository # Repositórios JPA


---

## 🔐 Funcionalidades

### ✅ Registro de Usuário
- Endpoint: `POST /auth/register`
- Criptografia de senha com BCrypt
- Geração automática de token JWT após cadastro

### ✅ Login
- Endpoint: `POST /auth/login`
- Validação de credenciais
- Retorno de token JWT

### ✅ Proteção de Rotas
- Rotas protegidas com filtro JWT
- Autenticação Stateless (sem sessão)

---

## ⚙️ Spring Profiles

O projeto utiliza **Spring Profiles** para separar configurações de ambiente:

### `application-dev.properties`
- Chave JWT fixa para desenvolvimento

### `application-prod.properties`
- Exemplo de configuração para banco real
- Uso de variável de ambiente para o segredo JWT:

```properties
api.security.token.secretKey=${JWT_SECRET};
```
🔑 Variáveis de Ambiente

Para ambiente de produção, configure a variável:

- JWT_SECRET=your-secret-key

Um arquivo de referência foi adicionado:

- .env.example

## ▶️ Como Executar o Projeto

1️⃣ Clonar o repositório
- git clone https://github.com/seu-usuario/login-arth-api.git

2️⃣ Executar com Maven
- mvn spring-boot:run 

3️⃣ Testar API com Postman/Insomnia
- Utilize ferramentas como Postman ou Insomnia para testar os endpoints REST da aplicação.


## 🧪 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /auth/register | Register user |
| POST | /auth/login | Login and get JWT |
| GET | /users | Protected route example |

## 🏗️ Arquitetura
- Controller → recebe requisições REST

- DTO → transporte de dados

- Entity → mapeamento JPA

- Repository → acesso a dados

- Security Layer → autenticação JWT

- Filter → interceptação de requisições protegidas

## 📚 Observações de Aprendizado

Este projeto foi realizado com foco em:

- Autenticação JWT

- Spring Security Stateless

- Configuração de filtros customizados

- Separação de ambientes com Spring Profiles

- Boas práticas de configuração de segredos

- Estruturação de projeto em camadas

## 👨‍💻 Autor

Micael Cruz Batista Martins

Estudante de Engenharia de Software

Interessado em desenvolvimento backend, arquitetura de software e cloud.
