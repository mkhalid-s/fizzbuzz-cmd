import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.jboss.logging.Logger;

import javax.inject.Inject;

@QuarkusMain
public class FizzBuzzApp implements QuarkusApplication {

    private static final Logger logger = Logger.getLogger(FizzBuzzApp.class);

    private final FizzBuzz fizzBuzz;

    @Inject
    public FizzBuzzApp(FizzBuzz fizzBuzz){
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public int run(String... args) throws Exception {
        logger.info("Starting FizzBuzz Application");
        fizzBuzz.execute();
        logger.info("Stopping FizzBuzz Application");
        return 0;
    }
}
