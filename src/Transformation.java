import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Transformation {
    Map<String, List<Integer>> plenty;
    List<Integer> list;

    private void random() {

    }

    public Transformation(String plenty, ) {
        this.plenty = plenty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transformation that = (Transformation) o;
        return Objects.equals(plenty, that.plenty) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plenty, list);
    }

    @Override
    public String toString() {
        return "Transformation{" +
                "plenty=" + plenty +
                ", list=" + list +
                '}';
    }
}
