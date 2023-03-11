package main;

import beans.Horse;
import beans.Jockey;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var h = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            Horse x = h.getBean(Horse.class);
            Jockey j = h.getBean(Jockey.class);

            System.out.println(x);
            System.out.println(j);
        }
    }
}
