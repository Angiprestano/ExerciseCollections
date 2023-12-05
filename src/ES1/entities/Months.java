package ES1.entities;

public class Months {
    private int n;
    private String words;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Months {" +
                "n= " + n +
                ", words='" + words + '\'' +
                '}';
    }

    public Months(int n, String words) {
        this.n = n;
        this.words = words;
    }
}
