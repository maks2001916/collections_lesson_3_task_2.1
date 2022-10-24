import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class Transformation {
    Map<String, List<Integer>> plenty;
    List<Integer> list;

    Random random = new Random();
    private void randoms() {
        int one = random.nextInt(1000);
        int two = random.nextInt(1000);
        int three = random.nextInt(1000);
        list.add(one);
        list.add(two);
        list.add(three);
    }

    public Transformation(String plenty) {
        this.plenty.put(plenty, list);
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
