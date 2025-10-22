# MedVoll 🏥

MedVoll é uma API REST para gestão de consultas em uma clínica médica fictícia.  
O sistema permite gerenciar médicos, pacientes e consultas, além de suportar autenticação JWT, documentação de API via Swagger e testes unitários.

<br>

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Flyway** (migrations de banco de dados)
- **MySQL**
- **Maven** (gerenciamento de dependências)
- **Spring Security** (autenticação e autorização JWT)
- **Spring Doc + Swagger UI** (documentação da API)
- **JUnit + Mockito** (testes unitários)
- **Lombok** (redução de boilerplate)

<br>

## ⚙️ Funcionalidades Principais

### Médicos e Pacientes
- Cadastrar médicos e pacientes
- Listar médicos e pacientes cadastrados
- Atualizar dados de médicos e pacientes
- Inativar médicos e pacientes (soft delete)

### Consultas
- Agendar consulta para paciente com médico específico
- Cancelar consultas existentes
- Listar consultas por paciente ou médico

### Segurança
- Autenticação via JWT
- Controle de acesso baseado em roles (ADMIN, USER)

<br>

## 📡 Endpoints Principais

| Método | Endpoint                         | Descrição                                      |
|--------|----------------------------------|------------------------------------------------| 
| POST   | /medicos                         | Cadastrar médico                               | 
| POST   | /pacientes                       | Cadastrar paciente                             |
| GET    | /medicos                         | Listar médicos cadastrados                     |
| GET    | /pacientes                       | Listar pacientes cadastrados                   |
| PUT    | /medicos                         | Atualizar cadastro de um médico                |
| PUT    | /pacientes                       | Atualizar cadastro de um paciente              |
| DELETE | /medicos/{id}                    | Inativar um médico                             |
| DELETE | /pacientes/{id}                  | Inativar um paciente                           |
| POST   | /consultas                       | Agendar uma consulta                           |
| DELETE | /consultas                       | Cancelar uma consulta                          |
| POST   | /auth/login                      | Autenticação do usuário (JWT)                  |

<br>

## 🛠️ Configuração do Projeto

1. Clone o repositório:

```bash
git clone https://github.com/liedsonlm7/medvoll.git
cd medvoll
```
Abra o projeto em sua IDE de preferência e configure o banco de dados MySQL no arquivo application.properties:

```bash
spring.datasource.url=jdbc:mysql://localhost/vollmed_api
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=validate
```
Execute as migrations com Flyway (automático ao iniciar a aplicação).

Execute a aplicação:

```bash
mvn spring-boot:run
```
Após executar o projeto, a documentação da API estará disponível para acesso em:

```bash
http://localhost:8080/swagger-ui.html
```
<br>

## 🧪 Testes
Testes unitários foram implementados com JUnit e Mockito, focando em:

- MedicoRepository

- ConsultaController

Executar testes:

```bash
mvn test
```
Cobertura de teste e exemplos de mock podem ser encontrados no pacote src/test/java.

<br>

## 🔒 Segurança
- JWT Authentication: Cada endpoint protegido requer um token JWT válido.
- Endpoints públicos: /login para geração do token.

<br>

## 📈 Boas Práticas
- Separação de responsabilidades entre Controller, Service e Repository

- Mapeamento DTO para entidades, garantindo encapsulamento

- Validações de dados com Bean Validation

- Uso de Swagger para documentação interativa

<br>

## ✨ Conclusão
MedVoll é um projeto didático, desenvolvido ao longo da Formação Java e Spring Boot da plataforma Alura, portanto não possui fins comerciais.
