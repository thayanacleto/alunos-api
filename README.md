# Alunos API

REST API para gerenciamento de alunos, desenvolvida com Java e Spring Boot.

## Tecnologias
- Java 25
- Spring Boot 3.5.15
- Spring Data JPA
- PostgreSQL
- Maven

## Funcionalidades
- Cadastrar aluno
- Listar alunos
- Atualizar aluno
- Deletar aluno

## Como rodar

### Pré-requisitos
- Java 17+
- PostgreSQL
- Maven

### Configuração
1. Crie um banco de dados chamado `alunos_db` no PostgreSQL
2. Configure as credenciais no `application.properties`
3. Execute:

```bash
./mvnw spring-boot:run
```

## Endpoints

| Método | URL | Descrição |
|--------|-----|-----------|
| GET | /alunos | Lista todos os alunos |
| POST | /alunos | Cadastra um aluno |
| PUT | /alunos/{id} | Atualiza um aluno |
| DELETE | /alunos/{id} | Remove um aluno |

## Autora
Thaynara Anacleto — [GitHub](https://github.com/thayanacleto)