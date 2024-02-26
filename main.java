package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Вивід привітання
        System.out.println("Hello and welcome!");

        // Цикл для виводу значень
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Завантаження контексту Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        // Отримання біна bean1 з контексту
        Bean1 bean1 = (Bean1) context.getBean("bean1");

        // Використання біна
        System.out.println(bean1.getBean2().getValue()); // Має вивести "Hello, world!"
    }
}
