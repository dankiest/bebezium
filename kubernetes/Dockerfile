# FROM strimzi/kafka:0.16.1-kafka-2.4.0
# USER root:root
# RUN mkdir -p /opt/kafka/plugins/oracle
# COPY ./debezium-connector-oracle/ /opt/kafka/plugins/oracle/
# COPY *.jar /opt/kafka/plugins/oracle/
# USER 1001

FROM quay.io/debezium/connect:latest
COPY *.jar /kafka/libs/
