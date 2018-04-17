public class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (! obj.getClass().equals(Dollar.class))
            return false;
        Dollar dollar = (Dollar) obj;
        return amount == dollar.amount;
    }
}
