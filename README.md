# 项目名称
### mycloud
# 目录
### 1.服务发现-myeureka
##### 访问：http://localhost:1024/
### 2.服务配置-myconfig
### 3.服务提供-myservice
##### 访问：http://localhost:1001/getTime
### 4.服务消费-myclient
##### 访问：http://localhost:2001/getTime
### 5.服务网关-myzuul
##### 访问：http://localhost:1003/api/getTime?token=22
### 6.服务跟踪-zipkin-server
##### 启动：java -jar zipkin-server-2.12.9-exec.jar
##### 访问：http://localhost:9411/
