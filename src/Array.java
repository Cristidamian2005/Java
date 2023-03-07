public class Array {
    public static void main(String[] args) {

        //declarare si initializare cand stim valorile
        String[] elevi = {"gigel" ,"costel" , "mari" , "ela" , "Ada"} ;
        int[] numere = {1, 33, 85,14, 579, } ;
        // contine mai multe elemente de acelasi tip
        //accesam elementele prin index, incepe de la 0
        //are o dimensiune fixa
        // are proprietatea length care ne de dimensiunea array-ului

        System.out.println(elevi[0]);
        System.out.println(elevi[4]);
        elevi[2] = "Sebi";  //suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        //putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0] + " " + elevi[1]);  //gigel + costel  - concatenare de stringuri
        System.out.println(elevi.length + 5);
        //sa printam tot timpul ultimul elem din array
        System.out.println(" last place " + elevi[elevi.length - 1]);

        //declarare si alocare de memorie
        int[] note = new int[5];
        System.out.println(note[1]);
        note[0] = 10;
    }
}

