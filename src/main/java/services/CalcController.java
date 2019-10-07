package services;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CalcController {

    private ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(PokemonCalculator.class);

    public void showListNames() {
        applicationContext.getBean("giveListName");
    }

    public void showDetails() {
        applicationContext.getBean("giveDetails");
    }

    public void showType() {
        applicationContext.getBean("giveType");
    }
}
