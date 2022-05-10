How to use:

Open `application.properties` file, it will be displayed like this.

```
spring.datasource.url=jdbc:postgresql://localhost:5432/student
spring.datasource.username=
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
```

Create a database called "student" without quotes in your postgreSQL server. Input `spring.datasource.username` with your postgreSQL username and `spring.datasource.password` with your postgreSQL password.
