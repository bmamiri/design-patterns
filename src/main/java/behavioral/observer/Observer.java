package behavioral.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Observer {

    @EventListener
    public void tellMeWhenSystemIsShuttingSown(ShutdownEvent shutdownEvent) {
        System.out.println("System Shitting Down 1");
    }

    @EventListener
    public void update(ShutdownEvent shutdownEvent) {
        System.out.println("System Shitting Down 2");
    }
}
