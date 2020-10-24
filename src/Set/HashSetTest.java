package Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();

        hset.add(12);
        hset.add(63);
        hset.add(34);
        hset.add(45);

        Iterator<Integer> iterator = hset.iterator();
        System.out.println("HashSet:");
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
