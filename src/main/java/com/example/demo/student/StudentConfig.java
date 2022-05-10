package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@mail.com",
                    LocalDate.of(2000, Month.APRIL, 5)
            );

            Student damian = new Student(
                    "Damian",
                    "damian@mail.com",
                    LocalDate.of(2001, Month.APRIL, 20)
            );

            repository.saveAll(
                    List.of(mariam, damian)
            );
        };
    }
}
