public class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiply) {
        return new Franc(amount * multiply);
    }
}