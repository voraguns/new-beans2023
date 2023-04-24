package web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

class Start {
    public static void main(String[] args) {
        ApplicationContext context;
        context = new AnnotationConfigApplicationContext(Setup.class);
        String[] all = context.getBeanDefinitionNames();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}
@Configuration
class Setup {
    
}
@Component
class Brand {
    String name = "iCoffee";
    int year = 2018;
}