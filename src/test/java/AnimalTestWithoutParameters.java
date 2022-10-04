import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class AnimalTestWithoutParameters {
    @Test
    public void animalGetFoodExeptionTest() {
        Animal animal = new Animal();
        Exception exception = assertThrows(Exception.class, () -> {
            animal.getFood("Водоплавающее");
        });

        String expectedMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void animalGetChildrenTest() {
        Animal animal = new Animal();
        Assert.assertEquals(0, animal.getChildren());
    }


    @Test
    public void animalGetFamilyTest() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
