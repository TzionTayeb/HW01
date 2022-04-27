public class Snake {
    private int head;
    private int length;

    public Snake (int length, int squareNum){
        head= squareNum;
        this.length = length;
    }

    public int getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }
}
