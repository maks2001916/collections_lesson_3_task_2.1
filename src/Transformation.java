import java.util.*;

public class Transformation {
    Map<String, List<Integer>> plenty;
    List<Integer> list;
    private String key;
    Random random = new Random();
    int sum1 = 0;
    List<Integer> list1 = new ArrayList<>();
    Map<String, List<Integer>> plentyFinis = new HashMap<>();
    private void randoms() {
        int one = random.nextInt(1000);
        int two = random.nextInt(1000);
        int three = random.nextInt(1000);
        list1.add(one);
        list1.add(two);
        list1.add(three);
    }

    public Transformation(String plenty) {
        plentyFinis.put(plenty, list1);
        key = plenty;
    }

    public void lineUp() {
        randoms();
        int keyAddress = 0;
        Map<String, Integer> lineUp = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            sum1 = sum1 + plentyFinis.get(key).get(keyAddress);
            lineUp.put(key, sum1);
            keyAddress ++;
        }
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
