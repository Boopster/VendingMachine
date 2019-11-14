//* The vending machine will accept valid coins (10p, 20p, 50p, etc) and reject invalid ones (1p, 2p).
public enum CoinType {

    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    POUND(100);

    private final int value;

    CoinType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}

