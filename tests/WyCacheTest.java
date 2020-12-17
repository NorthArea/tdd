import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WyCacheTest {
    @Test
    public void multiplier() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void equality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));

        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));

        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    @Test
    public void francMultiplier() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}

//TODO $5 + 10CHF = $10 при 2:1
//TO-DO $5 * 2 = $10
//TODO Сделать amount закрытым членом класса
//TO-DO Побочные эффекты класса Dollar
//TODO Округлением денежных величин?
//TO-DO equals()
//TODO hashCode()
//TODO Равенство значению null
//TODO Равенство объектов
//TO-DO 5CHF * 2 = 10CHF
//TODO Дублирование Dollar\Franc
//TO-DO Общие операции equals()
//TODO times()
//TODO Сравнение Франков и Долларов
//TODO Валюта?