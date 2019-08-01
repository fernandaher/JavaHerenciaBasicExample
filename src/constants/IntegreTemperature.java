package constants;

public enum IntegreTemperature {

    CERO(0),
    NINE(9),
    FIVE(5),
    THIRTY_TWO(32);

    private int val;

    IntegreTemperature(int i) {
        this.val = i;
    }

    public int getVal() {
        return val;
    }
}
