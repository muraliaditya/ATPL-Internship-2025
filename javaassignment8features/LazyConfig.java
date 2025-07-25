
import java.util.Optional;
import java.util.function.Supplier;

public class LazyConfig{
    public static void main(String[] args) {
        Optional<String> config = Optional.empty();
        Supplier<String> loadConfig = () -> {
            System.out.println("Loading config...");
            return "config-value";
        };
        String finalConfig = config.orElseGet(loadConfig);

        System.out.println("Final Config: " + finalConfig);
    }
}