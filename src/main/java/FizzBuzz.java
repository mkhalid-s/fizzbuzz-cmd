import io.quarkus.arc.config.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FizzBuzz {

    private static final Logger logger = Logger.getLogger(FizzBuzz.class);

    @ConfigProperty(defaultValue = "100", name = "application.fizzbuzz.maxnum")
    Integer maxNumber;

    public void execute(){
        for (int i = 0; i < maxNumber; i++) {
            String res = "";
            if (i%3 == 0)
                res = res + "fizz ";
            if (i%5 == 0)
                res = res + "buzz ";
            logger.info(res != "" ? res : i);

        }
    }


}
