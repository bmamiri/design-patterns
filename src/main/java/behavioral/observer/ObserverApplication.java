package behavioral.observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ObserverApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ObserverApplication.class, args);
        Subject bean = context.getBean(Subject.class);
        bean.notifyAllShutdown();
    }
}
