# 🌐 SpringBoot-Cruds
Projeto desenvolvido com o objetivo de aplicar conceitos de arquitetura em camadas utilizando Spring Boot, explorando controllers, services, repositories e entities para operações CRUD.

# 📌 Objetivo
Gerenciar entidades de forma simples através de operações CRUD (Create, Read, Update, Delete). A aplicação permite:

Cadastro de entidades via API REST

Consulta de registros por ID ou listagem completa

Exclusão de registros

# ⚙️ Tecnologias
Java 25 +

Spring Boot

Spring Data JPA

H2 Database

Maven para gerenciamento de dependências

Git/GitHub para versionamento

# 🧠 Lógica de Negócio
A lógica do sistema é baseada nos seguintes conceitos:

Entity: representa a tabela no banco de dados.

Repository: interface que abstrai operações de persistência com JPA.

Service: camada intermediária que contém a lógica de negócio.

Controller: expõe endpoints REST para interação com o sistema.

CrudsApplication.java: classe principal que inicializa a aplicação.

# 📂 Funcionalidades
Inserção de registros via requisições POST

Consulta de registros via GET

Exclusão de registros via DELETE

Respostas em formato JSON

# 🧩 Estrutura Modular
Controller: gerencia as requisições HTTP

Service: implementa regras de negócio

Repository: comunicação com o banco de dados

Entity: mapeamento das tabelas

CrudsApplication.java: ponto de entrada da aplicação

# ▶️ Execução
Clone o repositório:

bash
git clone https://github.com/seuusuario/SpringBoot-Cruds.git

Compile e execute:
bash
mvn spring-boot:run

Acesse a aplicação na porta configurada:
Code
http://localhost:3000

# 💡 Exemplo de Uso
Cadastro de entidade (POST)
json
POST /api/colaboradores
{
  "id": 1,
  "nome": "Maria Silva",
  "cargo": "Analista",
  "salario": 4500,
  "dataAdmissao": "2022-02-01"
}

Consulta de entidade (GET)
Code
GET /api/colaboradores/1
Atualização de entidade (PUT)
json

Exclusão de entidade (DELETE)
Code
DELETE /api/colaboradores/1

# 👨‍🏫 Avaliação
Critérios atendidos:

Estrutura em camadas (Controller, Service, Repository, Entity)

Operações CRUD completas

Configuração de porta diferenciada (3000)

Uso de Spring Boot e JPA

Modularização e boas práticas de código

Documentação clara
