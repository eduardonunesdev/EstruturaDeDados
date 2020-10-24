package Set;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet <Integer> tree = new TreeSet<Integer>();

        tree.add(12);
        tree.add(63);
        tree.add(34);
        tree.add(45);

        Iterator<Integer> iterator = tree.iterator();
        System.out.println("Tree set data:");
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
