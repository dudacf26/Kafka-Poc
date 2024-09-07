# POC do Kafka com Spring Boot 🚀

Este repositório contém uma Prova de Conceito (POC) para integração do Apache Kafka com Spring Boot. A seguir estão as instruções para configurar e testar a aplicação.

## Pré-requisitos 🛠️

- Java 8 ou superior
- [Apache Kafka 2.2.0](https://www.apache.org/dyn/closer.cgi?path=/kafka/2.2.0/kafka-2.2.0-src.tgz)
- [Apache Zookeeper](https://www.apache.org/dyn/closer.cgi/zookeeper/)

## Instruções de Configuração 🔧

1. **Baixar o Apache Kafka**:
   - [Clique aqui para baixar](https://www.apache.org/dyn/closer.cgi?path=/kafka/2.2.0/kafka-2.2.0-src.tgz)

2. **Baixar o Apache Zookeeper**:
   - [Clique aqui para baixar](https://www.apache.org/dyn/closer.cgi/zookeeper/)

3. **Iniciar o Zookeeper**:
   - No terminal Linux, execute:
     ```bash
     bin/zookeeper-server-start.sh config/zookeeper.properties
     ```

4. **Iniciar o Servidor Kafka**:
   - Em um novo terminal Linux, execute:
     ```bash
     bin/kafka-server-start.sh config/server.properties
     ```

5. **Iniciar a Aplicação Spring Boot**:
   - Importe o projeto na sua IDE e execute a aplicação.

## Como Testar 🧪

### Usando cURL

No terminal, execute o seguinte comando para enviar uma mensagem para o Kafka:
```bash
curl -X POST -F 'message=mensagem que quer mandar' http://localhost:9000/kafka/producer
```

### Usando Postman ou Navegador

Acesse o seguinte URL e adicione sua mensagem como um parâmetro de consulta:
```perl
http://localhost:9000/kafka/producer?message=mensagem%20que%20quer%20mandar
```
### Recursos Adicionais 📚

Aqui estão algumas leituras recomendadas sobre Apache Kafka e Spring Boot:

Spring Boot com Apache Kafka no Medium
Blog da Confluent sobre Apache Kafka e Spring Boot
Kafka no Spring Boot - Emmanuel Neri
Descomplicando o Apache Kafka - SocialMiner
