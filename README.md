# Projeto de Consulta de CEPs e CNPJs com Java e Spring

## Linguagens e ferramentas  usadas
<div >
     <img align="center" alt="java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white">
     <img align="center" alt="git" src="https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white">
     <img align="center" alt="IntelliJ_IDEA" src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white">
</div><br>


Este é um projeto de exemplo que demonstra como consumir a API Via CEP para consultar CEPs de cidades e a API Brasil API para consultar CNPJs. O projeto é desenvolvido em Java e utiliza o framework Spring Boot para facilitar o desenvolvimento.

## Demonstração de Consulta

Aqui estão imagens de exemplo de como consultar CEPs e CNPJs no projeto:

### Consultando CEP

![Exemplo de Consulta de CEP](https://github.com/Marcos-Gabriell/java-api-consulta/blob/master/Desktop%20Screenshot%202023.10.03%20-%2021.06.06.71.png)

### Consultando CNPJ

![Exemplo de Consulta de CNPJ](https://github.com/Marcos-Gabriell/java-api-consulta/blob/master/Desktop%20Screenshot%202023.10.04%20-%2016.22.59.41.png)

## Pré-requisitos

Antes de começar, certifique-se de que você tenha as seguintes ferramentas instaladas:

- **Java Development Kit (JDK)** 8 ou superior
- **Maven**
- Uma **IDE Java** (por exemplo, IntelliJ IDEA ou Eclipse)

## Configuração

1. Clone este repositório em sua máquina local:

2. Abra o projeto em sua IDE Java preferida.

3. Atualize e instale as dependências do projeto usando o **Maven**.

4. Execute o projeto a partir da IDE ou use o comando Maven para iniciar o aplicativo.


O aplicativo estará disponível em `http://localhost:8080`.

## Uso

Você pode usar as seguintes rotas para consultar CEPs de cidades e CNPJs:

- Consultar CEP: `GET http://localhost:8080/api/cep/{cep}`
  - Substitua `{cep}` pelo CEP que deseja consultar.

- Consultar CNPJ: `GET http://localhost:8080/api/cnpj/{cnpj}`
  - Substitua `{cnpj}` pelo CNPJ que deseja consultar.

## Estrutura do Projeto

A estrutura do projeto segue as melhores práticas do Spring Boot:

- `src/main/java/com/seuprojeto`: Contém os pacotes Java do projeto.
- `src/main/resources`: Contém os arquivos de configuração, incluindo o arquivo `application.properties` para configurações de propriedades.

## Contribuição

Sinta-se à vontade para contribuir para este projeto. Abra um Pull Request com suas melhorias ou correções.


