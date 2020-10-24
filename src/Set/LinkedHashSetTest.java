package Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();

        lhset.add(12);
        lhset.add(63);
        lhset.add(34);
        lhset.add(45);

        Iterator<Integer> iterator = lhset.iterator();
        System.out.println("LinkedHashSet:");
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
