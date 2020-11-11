package sk.it.strausz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("sk.it.strausz")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return  new SadFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        return  new SwimCoach(sadFortuneService());
    }

}
