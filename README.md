# Products - API de gerenciamento de produtos

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/franzoso-agregador-de-investimentos/blob/main/LICENSE) 


# Sobre o projeto

Products é uma aplicação backend desenvolvida para fornecer uma API REST que possibilita operações de CRUD em produtos. A aplicação utiliza DTOs para garantir uma gestão eficiente e segura dos dados. Além disso, o Flyway é utilizado para garantir que a tabela de produtos seja criada e gerida corretamente.
O banco de dados utilizado é o PostgreSQL, executado em um container Docker para simplificar o processo de desenvolvimento e integração. A aplicação também conta com documentação automatizada através do Swagger, tornando a interação com a API mais acessível e intuitiva.

# Funcionalidades
- CRUD Completo: Realiza operações de criação, leitura, atualização e deleção de produtos.
- Documentação Automática: A documentação da API é gerada automaticamente pelo Swagger, facilitando a compreensão das rotas e parâmetros.
- Gerenciamento de Banco de Dados: Utiliza Flyway para versionamento e gerenciamento do banco de dados.
- Persistência de Dados: Utiliza o PostgreSQL como banco de dados relacional para armazenar as informações dos produtos.

# Tecnologias utilizadas
- Java: Linguagem de programação utilizada para o desenvolvimento.
- Spring Boot: Framework para construção da aplicação.
- JPA / Hibernate - ORM (Object-Relational Mapping) para interação com o banco de dados.
- Maven - Gerenciador de dependências e build.
- Flyway - Para gerar a tabela no banco de dados
- Swagger: Para documentação automatizada das APIs.
- Postgres: Banco de dados relacional.
- PgAdmin: Ferramenta gráfica para gerenciamento do PostgreSQL.
- Docker: Utilizado para containerizar o banco de dados PostgreSQL e PgAdmin.

# Endpoints
## Os seguintes endpoints estão disponíveis para interagir com a aplicação:
- GET /products: Retorna todos os produtos cadastrados.
- GET /products/{id}: Retorna um produto específico identificado pelo id.
- POST /products: Cria um novo produto com os dados fornecidos. 
- PUT /products/{id}: Atualiza os dados de um produto identificado pelo id.
- DELETE /products/{id}: Deleta um produto identificado pelo id.

# Como executar o projeto
## Back end
### Pré-requisitos: 
- Java 17 ou superior
- Maven (para construção do projeto)
- Docker

```bash
# clonar repositório
git clone git@github.com:WelingtonFranzoso/products.git

# entrar na pasta do projeto back end
cd products

# executar o projeto
./mvnw spring-boot:run
```

Docker: Configuração do PostgreSQL e PgAdmin
O projeto já está configurado para rodar o PostgreSQL em um container Docker. Para isso, basta garantir que o Docker esteja instalado e em funcionamento. O Docker irá gerenciar o banco de dados de forma transparente.

Acessando o PgAdmin
Para acessar o PgAdmin, você pode navegar até http://localhost:5050 e usar as credenciais padrão:

Email: admin@admin.com
Senha: admin
Lá você poderá gerenciar o banco de dados PostgreSQL utilizado pela aplicação.

# Acessando a Documentação Swagger
## A documentação da API pode ser acessada no seguinte endereço:

Swagger UI: http://localhost:8080/swagger-ui.html

# Autor

Welington Franzoso
https://www.linkedin.com/in/welington-franzoso-88a8301b9
