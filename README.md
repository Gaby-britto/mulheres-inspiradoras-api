# Mulheres Inspiradoras - Back-end

Este é o back-end do projeto **Mulheres Inspiradoras**, uma API que fornece informações sobre mulheres que marcaram a história com suas contribuições em diversas áreas.  

O objetivo é fornecer dados que podem ser consumidos por aplicações web, mobile ou outros projetos front-end.

---

## Tecnologias

- Java 21
- Spring Boot 3.5
- Maven
- REST API

---

## Funcionalidades

- Listar mulheres inspiradoras com:
  - Nome
  - Área de atuação
  - Frase inspiradora
- Endpoint principal:  

GET /api/mulheres

Retorna uma lista de objetos JSON com as informações das mulheres.

---

## Estrutura do Projeto

mulheres-inspiradoras/

- `src/main/java/com/seuprojeto/mulheres_inspiradoras/`
  - `MulheresInspiradorasApplication.java <- Classe principal Spring Boot`
  - `Mulher.java <- Modelo da mulher` 
  - `MulheresService.java <- Serviço que fornece a lista`
  - `MulheresController.java <- Controlador REST`

