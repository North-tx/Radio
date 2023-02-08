import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewRadioTests {
    @Test
    public void Test() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


}
