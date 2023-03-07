public class Functii {

    // functie = logica delimitata care poate fi refolosita
    //  nu putem folosi spatii in nume
    // nu putem defini o functie in alta functie

    // o functie simpla care ne printeaza ceva pe ecran
    // nu ne da nici un raspuns
    // nu are parametri

    public static void printGreeting(){
        System.out.println("Buna ziua! Bine ati venit! ");
    }

    // o functie care saluta clientul in functie de numele lui
    // nu ne da nici un raspuns
    // are nevoie de parametri
    public static void printGreetingByName (String nume, String prenume){
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    // o functie care calculeaza media a 3 numere
    // ne da un raspuns - suma numerelor - va avea return
    // ce tip de date va avea raspunsul?
    // are nevoie de parametri

    public static double mediaNr(double a, double b, double c){
        double media = (a + b + c) / 3;
        return media;
    }

    // o functie care ne da valoarea lui pi
    // ne da un raspuns ? da
    // ce tip de date va avea raspunsul? double
    // are nevoie de parametri? nu

    public static double piValue(){
        //constanta - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }


    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia

        // intra clientul 2
        printGreeting();  //TRL + Click pe functie ne duce in corpul ei

       // apelam o functie cu parametri oferind argumente
        printGreetingByName(" Andy", "Sanpetrean");
        printGreetingByName(" Alex", "Sanpetrean");
        printGreetingByName(" Crina", "Sanpetrean");

        System.out.println(mediaNr(4, 3, 3));
        double media1 = mediaNr(31213, 312313, 423);
        System.out.println(media1);

        System.out.println(piValue());
        System.out.println(piValue());


    }
}
