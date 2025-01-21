import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    public void testLAppearsThriceInHelloWorld() {
        //Arrange set up test
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hello world");
        //Act get frequency
        int actualCount = counter.getFrequency('l');
        //Assert check if equals
        assertEquals(3, actualCount);
    }
}