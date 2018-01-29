--配置hosts
127.0.0.1 slf.eureka.center
127.0.0.1 slf.eureka.center1
127.0.0.1 slf.eureka.center2
127.0.0.1 slf.eureka.center3


--启动单台应用
java -jar eurekaFeign-0.0.1.jar

--查看集群服务
http://slf.eureka.center1:9001/

http://localhost:5001/feign/hi

http://localhost:5001/feign/test/hi


E:\workspace\SpringCloud\dest