FROM zimmem/jdk

ADD target/kubernets-demo-dubbo-provider-0.0.1-SNAPSHOT.jar /usr/local/kubernets-demo-dubbo-provider.jar

EXPOSE 20880

CMD ["java", "-jar", "/usr/local/kubernets-demo-dubbo-provider.jar", "Provider"]


