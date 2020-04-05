package behavioral.observer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Subject {
    private final ApplicationEventPublisher applicationEventPublisher;

    public Subject(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void notifyAllShutdown() {
        applicationEventPublisher.publishEvent(new ShutdownEvent());
    }
}
