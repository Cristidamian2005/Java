import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {

        //declaram o lista goala
        List<String> fructe = new ArrayList<>();

        //au o dimensiune dinamica

        //adaugam elemente
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum se iau elementele
        System.out.println(fructe.get(0));
        System.out.println(fructe.get(1));

        //cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));

        //este lista goala?
        System.out.println(" este lista goala? " + fructe.isEmpty());

//        //eliminam toate elementele din lista
//        fructe.clear();

        if(!fructe.isEmpty()){
            System.out.println("avem ce manca");
        } else {
            System.out.println(" nu avem ce manca");
        }

        //scoatem elemente
        fructe.remove("mar");

        //listam elementele
        System.out.println(Arrays.toString(fructe.toArray()));

        //aflam dimensiunea listei
        System.out.println(" dimensiunea listei " + fructe.size());

        //declaram o lista imutabila si o initializam cu valori
        List<String> list1 = Arrays.asList(new String[]{"foo" , "bar"});
        List<Integer> list2 = Arrays.asList(new Integer[]{1, 3 , 45});
        System.out.println(Arrays.toString(list1.toArray()));
       //
        // list2.add(99); nu mai putem adauga elemente

        //declaram o lista dinamica

        String[] flowers = {"ageratum", "allium", "poppy", "catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("rose");
        System.out.println(Arrays.toString(flowerList.toArray()));

        //aflam unde este poppy
        int poppy_index = flowerList.indexOf("poppy");
        System.out.println("Poppy este la pozitia " + poppy_index);
        //stergem ce este in aceasta pozitie
        flowerList.remove(poppy_index);

        //scoatem in functie de valoare

        flowerList.remove("catmint");
        System.out.println(Arrays.toString(flowerList.toArray()));



    }
}
