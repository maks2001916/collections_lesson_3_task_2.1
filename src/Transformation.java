import java.util.*;

public class Transformation {
    Map<String, List<Integer>> plenty;
    List<Integer> list;
    private String key;
    private int sum;
    Random random = new Random();
    int sum1 = 0;
    List<Integer> list1 = new ArrayList<>();
    int variableOne = 0;
    int variableTwo = 0;
    int variableThree = 0;
    private void randoms() {

        int one = random.nextInt(1000);
        int two = random.nextInt(1000);
        int three = random.nextInt(1000);
        list1.add(one);
        list1.add(two);
        list1.add(three);
        variableOne = one;
        variableTwo = two;
        variableThree = three;

    }

    public Transformation(String plenty) {
        Map<String, List<Integer>> plentyFinis = new HashMap<>();
        plentyFinis.put(plenty, list1);
        key = plenty;
    }

    private void calculatingTheAmount() {
        sum1 = variableOne + variableTwo + variableThree;
    }

    public void lineUp() {
        randoms();
        calculatingTheAmount();
        Map<String, Integer> lineUp = new HashMap<>();
        lineUp.put(key, sum1);
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
