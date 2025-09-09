package linkedList;

public class ComparatorMentor implements java.util.Comparator<ComparatorMentor> {
    @Override
    public int compare(ComparatorMentor o1, ComparatorMentor o2) {
        return o1.compare(o1, o2);
    }
}
