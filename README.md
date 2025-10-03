# Mulheres Inspiradoras - Back-end
![a-vibrant-product-shot-advertisement-for_ldEQ2Q24SeWK2DkKG5TQNQ_fbDZpQStSa2fRwUZiMkQ5g](https://github.com/user-attachments/assets/122c62a3-73b2-42a7-990a-a8089f541691)



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


---

## Como Rodar

1. Clone o repositório:
```bash
git clone https://github.com/Gaby-britto/mulheres-inspiradoras-api
```
2. Entre na pasta do projeto:
 ```bash
cd mulheres-inspiradoras
```
3. Compile e rode o projeto:
```bash
mvn clean spring-boot:run
```
4. Acesse a API:

```bash
http://localhost:8080/api/mulheres
```
---

Gabriele Brito - Desenvolvedora do projeto

