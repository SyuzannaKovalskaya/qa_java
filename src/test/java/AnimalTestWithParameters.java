import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTestWithParameters {
    private final String animalClass;
    private final List<String> food;

    public AnimalTestWithParameters(String animalClass, List<String> food) {
        this.animalClass = animalClass;
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void animalGetFoodTest() throws Exception {
        Animal animal = new Animal();
        List<String> animalFood = food;
        Assert.assertEquals(animalFood, animal.getFood(animalClass));
    }
}
