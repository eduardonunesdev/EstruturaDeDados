package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor("Willian", "111");
        Consumidor consumidor2 = new Consumidor("Eduardo", "222");


        Produto produto3 = new Produto("XBOX Series X", 3,5000);
        Produto produto4 = new Produto("PlayStation 5", 4, 5000);

        Map<Consumidor, Produto> map = new HashMap<>();



        map.put(consumidor, produto3);
        map.put(consumidor2, produto4);

        System.out.println(map);

        }
    }
