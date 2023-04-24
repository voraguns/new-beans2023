package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

class Start {
    public static void main(String[] args) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        Brand b = context.getBean(Brand.class);
        System.out.println(b.name);
        //SpringApplication.exit(context);
    }
}
@SpringBootApplication
class Setup {
    
}
@Component
class Brand {
    String name = "iCoffee";
    int year = 2018;
}