import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
       //  Flow control - if else
       //  evalueaza conditii si bifurca codul in functie de rezultate

        System.out.println("Pornim radioul");
        boolean piesaFaina = true;
        if (piesaFaina == true){
            System.out.println("Dau mai tare");
            System.out.println("Incep sa fredonez");
        }

        System.out.println("Oprim radioul");
//
//        int nr = 7;
//        if (nr % 2 == 0){
//            System.out.println("Par");
//        } else{
//            System.out.println("impar");
//        }
//        // if else if else
//        // luam date de la tastatura
//        System.out.println("introdu ora ");
//        Scanner sc = new Scanner(System.in);
//        int ora = sc.nextInt();
//        if (ora<0){
//            System.out.println("ora invalida");
//        } else if (ora<=11){
//            System.out.println("neata");
//        } else if (ora<=18){
//            System.out.println("ziua");
//        } else if (ora<=21){
//            System.out.println("seara");
//        } else if (ora<=24){
//            System.out.println("nb");
//        } else{
//            System.out.println("ora invalida");
//        }
//switch - se foloseste cand stim valorile posibile
        System.out.println("alege optiunea");
        Scanner sc = null;
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("engl");
                break;
            default:
                System.out.println("invalida");
        }



    } // inchide functia main
}   //inchide clasa
