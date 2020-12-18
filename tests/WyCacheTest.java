import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WyCacheTest {
    @Test
    public void multiplier() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void equality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void currency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
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
//TO-DO times()
//TO-DO Сравнение Франков и Долларов
//TO-DO Валюта?
//TODO Нужен ли francMultiplier()?