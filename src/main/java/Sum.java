class Sum implements Expression {
    Money addend;
    Money augend;

    Sum(Money augend, Money addend) {
        this.addend = addend;
        this.augend = augend;
    }

    public Money reduce(String to) {
        return new Money(augend.amount + addend.amount, to);
    }
}
