class Sum implements Expression {
    Expression addend;
    Expression augend;

    Sum(Expression augend, Expression addend) {
        this.addend = addend;
        this.augend = augend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    public Expression plus(Expression addend) {
        return null;
    }
}
