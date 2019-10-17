import com.google.devtools.common.options.OptionsParser;
import org.apache.commons.math3.distribution.WeibullDistribution;
import org.apache.commons.math3.random.MersenneTwister;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class GamblingTest {
    public static void main(String[] args) {
        var parser = OptionsParser.newOptionsParser(TestOptions.class);
        parser.parseAndExitUponError(args);

        var options = parser.getOptions(TestOptions.class);
        if (Objects.requireNonNull(options).lenght < 0) {
            printUsage(parser);
            return;
        }

        var rng  = new MersenneTwister((int)System.currentTimeMillis());
        var distribution = new WeibullDistribution(rng, options.alfa, options.beta);
        var s = distribution.sample(options.lenght);

        System.out.println(Arrays.toString(s));
    }

    private static void printUsage(OptionsParser parser) {
        System.out.println("Usage: java -jar archive.jar OPTIONS");
        System.out.println(parser.describeOptions(Collections.emptyMap(), OptionsParser.HelpVerbosity.LONG));
    }
}
