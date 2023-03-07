import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        //map este o reprezentare de date in sistem cheie valoare
        //exemplu: gigel are nota 10, costel are nota 9

        //declaram un map
        Map<String, Integer> noteElevi = new HashMap<>();

        //adaugam elemente
        noteElevi.put("Gigel", 10);
        noteElevi.put("costel", 9);
        noteElevi.put("ana", 10);

        //aflu notele
        System.out.println("nota anei " + noteElevi.get("ana"));

        //actualizare valori
        noteElevi.replace("costel", 10);
        System.out.println("Ccostel si-a marit nota la " + noteElevi.get("costel"));

        //aflam dimensiunea
        System.out.println("dimensiunea " + noteElevi.size());

        //stergem valori
        noteElevi.remove("Gigel");
        System.out.println("am scos Gigel, noua dimenisune este " +noteElevi.size());

        //declaram si initializam cu valori
        //map nu este ordonat
        Map<String, Integer> luni = new HashMap<>()
        {{
            put ("Jan", 1);
            put ("Feb", 2);
            put ("Mar", 3);
        }};

        System.out.println(luni);


    }
}
