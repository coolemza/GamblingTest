import com.google.devtools.common.options.Option;
import com.google.devtools.common.options.OptionsBase;

public class TestOptions extends OptionsBase {

    @Option(name = "length", abbrev = 'l', help = "Sequnce length.", defaultValue = "5")
    public int lenght;

    @Option(name = "alfa", abbrev = 'a', help = "Shape parameter.", defaultValue = "1.2")
    public double alfa;

    @Option(name = "beta", abbrev = 'b', help = "Scale parameter.", defaultValue = "2.1")
    public double beta;

    @Option(name = "help", abbrev = 'h', help = "Prints usage info.", defaultValue = "true")
    public boolean help;
}