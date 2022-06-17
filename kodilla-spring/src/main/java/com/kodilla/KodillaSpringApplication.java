package com.kodilla;

import com.kodilla.spring.Square;
import com.kodilla.spring.shape.Shape;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootApplication
public class KodillaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaSpringApplication.class, args);
    }

}