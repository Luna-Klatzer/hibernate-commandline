package at.htlleonding;

import at.htlleonding.GreetingService;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class GreetingMain implements QuarkusApplication {
    @Inject
    GreetingService service;

    @Override
    public int run(String... args) throws Exception {

        if (args.length>0) {
            System.out.println(service.greeting(args[0]));
        } else {
            System.out.println(service.greeting(""));
        }

        return 0;
    }
}
