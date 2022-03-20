package recitelyric.entity;

public class Pair {
    private String left;
    private String right;

    public Pair(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public Pair(String left) {
        this.left = left;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }
}
