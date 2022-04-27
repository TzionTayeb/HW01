public class Die {
    private int upperBound;
    private int lowerBound;

    public Die (int to, int from){
        upperBound=to;
        lowerBound=from;
    }

    public Die (){
        this (6,1);
    }

    public int roll (){
        return Main.rnd.nextInt((upperBound - lowerBound) +1) + lowerBound;
    }
}
