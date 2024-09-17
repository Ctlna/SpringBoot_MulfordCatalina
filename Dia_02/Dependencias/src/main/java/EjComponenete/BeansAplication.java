package EjComponenete;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeansAplication {
    public static void main(String[] args){
        ApplicationContext cont = new AnnotationConfigApplicationContext(ConfigEsclavo.class);

        Gato cat = cont.getBean(Gato.class);
        System.out.println(cat.getEsclavo());
    }
}
