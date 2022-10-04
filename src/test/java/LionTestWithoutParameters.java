import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTestWithoutParameters {


    @Test
    public void lionGenderUnknownTest() {
        Feline feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Тип не определен", feline);
        });
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Mock
    Lion lion;

    @Test
    public void lionDoesHaveManeTest() {
        lion.doesHaveMane();
        Mockito.verify(lion, Mockito.times(1)).doesHaveMane();
    }
}
