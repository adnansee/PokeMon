package services;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class CalcController {

    public void showListNames() {
        try (
                ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(PokemonCalculator.class)) {
            applicationContext.getBean("giveListName");
        }
    }

    public void showDetails() {
        try (
                ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(PokemonCalculator.class)) {
            applicationContext.getBean("giveDetails");
        }
    }

    public void showType() {
        try (
                ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(PokemonCalculator.class)) {
            applicationContext.getBean("giveType");
        }

    }

}
