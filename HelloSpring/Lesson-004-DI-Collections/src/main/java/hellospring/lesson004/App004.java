package hellospring.lesson004;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.stream.Stream;

@Configuration
@ComponentScan
class App004 {

    public static void main(String[] args) {
        try(AbstractApplicationContext context = new AnnotationConfigApplicationContext(App004.class)) {
            Stream.of(context.getBeanDefinitionNames()).forEach(name -> System.out.println("Bean: "+name));
        }
    }
}
