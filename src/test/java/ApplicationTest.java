import org.junit.Test;
import research.com.Application;
import static org.junit.Assert.*;

/**
 * The test class for Application
 */
public class ApplicationTest {

    private Application application = new Application();

    @Test
    public void testMain() {
        assertEquals(application.hello(), "Hello World. Today is September 18th!");
    }
}
