package EjComponenete;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Gato.class)
public class ConfigEsclavo {
    @Bean
    public Personita getPersona(){
        return new Personita("David V.");
    }
}
