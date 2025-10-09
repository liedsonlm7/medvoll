# medvoll
MedVoll é uma aplicação para consultas de pacientes em uma clinica médica

## 🚀 Tecnologias 
- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Flyway (migrations)
- mySQL
- Maven (gerenciamento de dependências)

<br>

## ⚙️ Funcionalidades:
- Cadastrar médicos e pacientes
- Listar médicos e pacientes cadastrados
- Atualizar dados de médicos e pacientes
- Inativar um médico ou paciente

<br>

## 📡 Endpoints Principais

| Método | Endpoint                         | Descrição                              |
|--------|----------------------------------|----------------------------------------| 
| POST   | /medicos                         | Cadastrar médicos                      | 
| POST   | /pacientes                       | Cadastrar pacientes                    |
| GET    | /medicos                         | Listar médicos cadastrados             |
| GET    | /pacientes                       | Listar pacientes cadastrados           |
| PUT    | /medicos                         | Atualizar cadastro de um médico        |
| PUT    | /pacientes                       | Atualizar cadastro de um paciente      |
| DELETE | /medicos/{id}                    | Inativar um médico                     |
| DELETE | /pacientes/{id}                  | Inativar um paciente                   |

<br>

## ℹ️ Sobre o projeto
Este é um projeto fictício desenvolvido sem fins comerciais com o propósito de fixar os conhecimentos aprendidos ao longo da formação Java + Spring Boot da Alura.
