## POC do Kafka utilizando Spring Boot

*Instruções:*

### Baixar o Kafka:
------------
- `https://www.apache.org/dyn/closer.cgi?path=/kafka/2.2.0/kafka-2.2.0-src.tgz`


### Baixar o Zookeper: 
------------
- `https://www.apache.org/dyn/closer.cgi/zookeeper/`


### Start Zookeeper (Via terminal Linux)
------------
- `bin/zookeeper-server-start.sh config/zookeeper.properties
`

### Start Kafka Server (Via terminal Linux)
------------
- `bin/kafka-server-start.sh config/server.properties
`

------------



- *Depois dos passos acima inicie a aplicação na sua IDEA.*

### Como testar?

- **Via cURL (Terminal):**

> curl -X POST -F 'message=**mensagem que quer mandar**' http://localhost:9000/kafka/producer

- **Via Postman/navegador:**

> http://localhost:9000/kafka/producer?message= **mensagem que quer mandar**


### Publicações interessantes sobre Kafka:

- `https://medium.com/oril/spring-boot-with-apache-kafka-2b1ecb88a63f`

- `https://www.confluent.io/blog/apache-kafka-spring-boot-application?source=post_page`

- `https://emmanuelneri.com.br/2019/06/04/kafka-no-spring-boot/`

- `http://developers.socialminer.com/2017/11/02/descomplicando-o-apache-kafka/`
