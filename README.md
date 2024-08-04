# bite-buddies-api

To build the project
```
./gradlew build
```

To run the project
```
./gradlew bootRun
```

To access the application url in browser
```
http://localhost:8080/restaurants/list
```

To build using docker
```
docker build --build-arg JAR_FILE=build/libs/\*.jar -t bite-buddies/bite-buddies-spring-boot-docker .
```

To run using docker
```
docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8080:8080 -t bite-buddies/bite-buddies-spring-boot-docker
```
