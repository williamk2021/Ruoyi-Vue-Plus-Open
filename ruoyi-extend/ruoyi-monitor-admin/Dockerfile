FROM openjdk:11

MAINTAINER Lion Li

RUN mkdir -p /ruoyi/monitor/logs

WORKDIR /ruoyi/monitor

ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

EXPOSE 9090

ADD ./target/ruoyi-monitor-admin.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
