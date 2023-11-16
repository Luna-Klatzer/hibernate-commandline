package at.htlleonding;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String greeting(String name) {
        return "Hello " + name;
    }
}
