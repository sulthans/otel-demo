https://opentelemetry.io/docs/languages/java/instrumentation/

java agent - https://opentelemetry.io/docs/languages/java/getting-started/


Steps : 

export JAVA_TOOL_OPTIONS="-javaagent:/Users/sulthan.hammed/Documents/project/lib/opentelemetry-javaagent.jar"

export OTEL_JAVAAGENT_LOGGING=application

export OTEL_SERVICE_NAME="otel-kafka"

Run : 

 java -jar otel-demo/spring-kafka/target/spring-kafka-0.0.1-SNAPSHOT.jar 
