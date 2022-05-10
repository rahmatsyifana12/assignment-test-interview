Technologies:
* Java
* Spring Boot
* PostgreSQL

How to use:

Open `application.properties` file by going to `src` -> `main` -> `resources` -> `application.properties`. The file will be displayed like this.

```
spring.datasource.url=jdbc:postgresql://localhost:5432/student
spring.datasource.username=
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
```

Create a database with name "student" without quotes in your postgreSQL server. Input `spring.datasource.username` with your postgreSQL username ("postgres" without quotes by default) and `spring.datasource.password` with your postgreSQL password.

Last but not least, run the `DemoApplication.java` and we all set.
