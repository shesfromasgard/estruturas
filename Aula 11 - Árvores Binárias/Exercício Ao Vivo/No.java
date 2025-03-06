public class No {
    public int year;
    public float temp;
    public No left;
    public No right;

    public No(int year, float temp) {
        this.year = year;
        this.temp = temp;
        this.left = null;
        this.right = null;
    }

    public No() {
        this.left = null;
        this.right = null;
    }
}
