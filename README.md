# Transformation Portal API README.md

## Clone This Repo
1. For SSH ```git clone git@github.com:biyekorun/transformation-portal-be.git```
2. For HTTPS ```https://github.com/biyekorun/transformation-portal-be.git```

## Modify DB Name
Need to change DB user and pass as like as your DB in ```src/main/resources/application.yml``` 

```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/transformation_portal?autoReconnect=true&useSSL=false
    username: <YOUR DB USER>
    password: <YOUR DB PASS>
```

## Build
1. After clone this ropository got to your dir where it cloned. (exp. ```c:/Download/transformation-portal-be/```)
2. Open CMD or git Bash
3. After that Run this code ```mvn clean install;```

## RUN
After Completing Build need to run
1. Run ```mvn spring-boot:run;```
2. It start Api in ```http://localhost:9191/v.1.0/rest/```
