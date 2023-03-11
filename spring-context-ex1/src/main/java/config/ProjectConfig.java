package config;

import beans.Horse;
import beans.Jockey;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean

    public Horse horse(){
        Horse h= new Horse();
        h.setName("FastBilly");
        return h;
    }
@Bean
    public Jockey jockey(){
        Jockey j =new Jockey();
        //j.setHorse( new Horse()); //Be careful this is not a horse in the context,nb:this is a new instance
        j.setHorse(horse());
        return j;

    }
}
