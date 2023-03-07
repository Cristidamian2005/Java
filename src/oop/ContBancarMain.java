package oop;

public class ContBancarMain {
    public static void main(String[] args) {

        // initializam obiecte de tip ContBancar
        // instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Georgel Ganea", "RO001");
        ContBancar cont2 = new ContBancar("Mirel Marin", "Ro002");

        // apelam metoda descriere
//       cont1.descriere();
//       cont2.descriere();

       //activam contul
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);

        //alimentam contul
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        // negative testing, cheltuim mai mult decat avem
        cont1.plataCard(500);  //corect

        // positiv cu suma exacta
        cont1.plataCard(300.5);  //corect

        // positive de 2X
        cont2.plataCard(100);
        cont2.plataCard(200);


        cont1.interogareSold();
        cont2.interogareSold();




    }
}
