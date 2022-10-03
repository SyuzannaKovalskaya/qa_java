import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Cat cat;

    @Test
    public void catGetSoundTest() {
        cat.getSound();
        Mockito.verify(cat, Mockito.times(1)).getSound();
    }


    @Test
    public void catGetFoodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> catFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(catFood, cat.getFood());
    }

}
