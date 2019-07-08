# ExactaDesafio
Desafio para vaga Backend Exacta

## RestAPI
A API foi construída utilizando Spring Boot e o Rest Controller. 
Ela implementa os métodos requisitados e inclusive PUT e DELETE. 
O banco de dados relacional foi optado pelo HSQLDB. 
Por não se tratar do foco da aplicação foi optado esse banco de dados temporário e simples, 
sem necessidade de instalação, visto que com a abstração do Spring Data, qualquer banco de dados pode ser facilmente utilizado.

A API é acessada pélo gaminho http://localhost:8080, 
os detalhes dos métodos são detalhados na documentação Swagger, descrita abaixo. 
Acessar a documentação da api em Swagger pelo caminho http://localhost:8080/swagger-ui.html

## Cliente para consumo da API
O cliente para consumo da API foi construído utilizando Swagger. 
O JSON da API como contrato foi gerado e utilizando Swagger foi gerado um cliente que consome os dados da API. 
Esse cliente é um JAR que é importado separadamente na aplicação WebAPP.

## WebAPP
A aplicação WebAPP foi construída com Spring Boot e JSP para consumir os dados do Cliente Swagger.
Ela chama funções da Lib jar gerada pelo Cliente Swagger e executa os métodos de Criar gasto, 
Listar todos os gastos e Listar os dados de um gasto específico. 
Essa aplicação é acessada pelo caminho http://localhost:8081/

## Repositório
No repositório estão 3 projetos, RestAPI, WebAPP e java-client-generated. 
Desses projetos são necessários para execução somente RestAPI e WebAPP. 
Pois em WebAPP a biblioteca gerada pelo java-client-generated já está contida. 
Além disso foi optado por não realizar o deploy da API no Heroku ou em serviço semelhante.
