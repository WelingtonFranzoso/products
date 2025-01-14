# Products - API de gerenciamento de produtos

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/franzoso-agregador-de-investimentos/blob/main/LICENSE) 


# Sobre o projeto

Products é uma aplicação backend que fornece uma API RESTful para realizar operações de CRUD em produtos. A aplicação utiliza DTOs para garantir uma gestão eficiente e segura dos dados, e trata as exceções de forma personalizada utilizando ExceptionHandler.
Além disso, a aplicação conta com documentação automatizada gerada pelo Swagger, tornando a interação com a API mais acessível e intuitiva. A Flyway é utilizada para garantir o versionamento e gerenciamento da tabela de produtos no banco de dados, que é um banco PostgreSQL executado dentro de um container Docker.

# Funcionalidades
- CRUD Completo: Realiza operações de criação, leitura, atualização e deleção de produtos.
- Documentação Automática: A documentação da API é gerada automaticamente pelo Swagger, facilitando a compreensão das rotas e parâmetros.
- Exceções Personalizadas: O gerenciamento de exceções é feito de forma personalizada com ExceptionHandler.
- Gerenciamento de Banco de Dados: ara gerar e atualizar a tabela no banco de dados.
- Persistência de Dados: Utiliza o PostgreSQL como banco de dados relacional para armazenar as informações dos produtos.

# Tecnologias utilizadas
- Java: Linguagem de programação utilizada para o desenvolvimento.
- Spring Boot: Framework para construção da aplicação.
- JPA / Hibernate - ORM (Object-Relational Mapping) para interação com o banco de dados.
- Maven: Gerenciador de dependências e build.
- Flyway: Ppara versionamento e gerenciamento do banco de dados.
- Swagger: Para documentação automatizada das APIs.
- Postgres: Banco de dados relacional.
- PgAdmin: Ferramenta gráfica para gerenciamento do PostgreSQL.
- Docker: Utilizado para containerizar o banco de dados PostgreSQL e PgAdmin.

# Endpoints
## Os seguintes endpoints estão disponíveis para interagir com a aplicação:
- GET /products/all: Retorna todos os produtos cadastrados.
- GET /products/{id}: Retorna um produto específico identificado pelo id.
- POST /products: Cria um novo produto com os dados fornecidos. 
- PUT /products/{id}: Atualiza os dados de um produto identificado pelo id.
- PUT /products: torna um produto ativo no banco de dados
- DELETE /products/{id}: Deleta um produto identificado pelo id.
- DELETE /products:  Torna um produto inativo no banco de dados.
## Filtros Personalizados
- GET /products: Retorna todos os produtos ativos, ou seja, com a coluna active igual a true.

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
