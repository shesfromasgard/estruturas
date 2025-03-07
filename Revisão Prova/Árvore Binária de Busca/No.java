public class No {
    public int key;
    public No left;
    public No right;

    public No(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public No() {
        this.left = null;
        this.right = null;
    }
}