public class Ladder {
    private int base;
    private int length;

    public Ladder (int length, int squareNum){
        base=squareNum;
        this.length=length;
    }

    public int getBase() {
        return base;
    }

    public int getLength() {
        return length;
    }
}
