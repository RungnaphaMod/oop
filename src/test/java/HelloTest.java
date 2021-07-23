import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    public void case01() {
        Hello hello = new Hello();
        String name = "rungnapha";

        String actualResult = hello.greet(name);

        assertEquals("Hello rungnapha", actualResult);
    }

}