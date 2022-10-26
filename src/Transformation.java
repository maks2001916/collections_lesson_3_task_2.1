import java.util.*;

public class Transformation {
    Map<String, List<Integer>> plenty;
    List<Integer> list;
    private String key;
    private int sum;
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
        Map<String, List<Integer>> plentyFinis = new HashMap<>();
        plentyFinis.put(plenty, list);
        key = plenty;
    }

    private void calculatingTheAmount() {
        sum = list.get(0) + list.get(1) + list.get(2);
    }

    public void lineUp() {
        Map<String, Integer> lineUp = new HashMap<>();
        lineUp.put(key, sum);
        System.out.println(lineUp);
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
