package vlsu;

import java.util.Comparator;

public class PointComparator implements Comparator<Object> {
    public int compare(Object o1, Object o2) {
        Points p1 = (Points) o1;
        Points p2 = (Points) o2;
        return (p1.getX() < p2.getX()) ? -1 : ((p1.getX() == p2.getX()) ? 0 : 1);
    }
}
