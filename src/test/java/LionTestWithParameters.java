import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;


@RunWith(Parameterized.class)
public class LionTestWithParameters {
    private final String gender;
    private final boolean expected;

    public LionTestWithParameters(String gender, boolean expected) {
        this.gender = gender;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(gender, feline);
        List<String> lionFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(lionFood, lion.getFood());
    }

    @Test
    public void lionDoesHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(gender, feline);
        Assert.assertEquals(expected, lion.doesHaveMane());
    }

    @Test
    public void lionGetKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(gender, feline);
        Assert.assertEquals(1, lion.getKittens());
    }
}
