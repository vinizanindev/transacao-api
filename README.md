# Transação API

API REST desenvolvida com **Java 21**, **Spring Boot** e **Gradle** para gerenciamento de transações e cálculo de estatísticas com base nas transações realizadas nos últimos **60 segundos**.

---

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Gradle
- Docker

---

## Pré-requisitos

Para rodar esta aplicação localmente, você precisa ter:

- **JDK 21** ou superior
- **Gradle** 
- **Git**
- **Docker** 

---

## Como Configurar o Projeto

### 1. Clone o repositório

```bash
git clone https://github.com/vinizanindev/transacao-api.git
cd transacao-api
```
## Compile o projeto
```
./gradlew build
```
## Execute a aplicação
```
./gradlew bootRun
```
### A aplicação estará disponível em: http://localhost:8080
## Como Executar via Docker
### Crie a imagem Docker
```
docker build -t api-transacoes .
```
### Execute o container
```
docker run -p 8080:8080 api-transacoes
```
## Documentação da API
### Receber Transações
### POST /transacao
```
Parâmetro  | Tipo            | Descrição
valor      | BigDecimal      | Obrigatório. Valor da transação
dataHora   | OffsetDateTime  | Obrigatório. Horário da transação (UTC)
```
## Limpar Transações

### DELETE /transacao
#### Remove todas as transações armazenadas.

## Calcular Estatísticas 
### GET /estatistica
```
Parâmetro         | Tipo | Descrição
intervaloSegundos | int  | Opcional. Padrão é 60 segundos
```
### Retorna estatísticas das transações no intervalo especificado.




