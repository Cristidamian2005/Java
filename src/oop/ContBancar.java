package oop;

public class ContBancar {
    // program files = definim logica unui cont bancar

    // oop = object oriented programming
    // poo = programare orientata pe obiecte

    // o clasa = este un tip nou
    // este definitita unui concept
    //reteta la paste carbonara, ADN-ul uman
    //ex: clasa  Carbonara

    // un obiect = instanta unei clase
    // paste carbonara, un om

    // fields = proprietati = atribute
    // variabile
    // ex: culoare, marca, model, consum, pret,

    // metode - actiuni ce pot fi facute de obiecte
    // functii
    // ex: accelereaza(), franeaza(), deschideUsa(), vopsire()


    // proprietatile
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercariActivare = 0;

    // constructor = are rolul de a impune date de start
    // ca si * din formulare. required fields

    // Click dr -> generate constructor
    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // metode
    public void interogareSold(){
        System.out.println("titular " + this.titularCont);
        System.out.println(" iban " +this.iban);
        System.out.println(" sold " + this.sold);
        System.out.println("activ? " + this.activ);
        System.out.println("nr de incercari gresite "+ this.incercariActivare);
        System.out.println("-------------------");
    }

    public void activareCont(int pinUtilizator){
        // modifica activ in true doar daca pinul e corect
        System.out.println("Buna " + this.titularCont);
        if (pinUtilizator == this.pin){
            System.out.println("activat cu succes");
            this.activ = true;
        } else {
            System.out.println("Pin Gresit");
            this.incercariActivare++ ; //se incrementeaza
        }
    }

    public void alimentareCont(double sumaDepusa){
        // la ce aveam in cont se mai adauga suma depusa
        this.sold = this.sold + sumaDepusa;
        System.out.println(" Buna " + this.titularCont);
        System.out.println("Ati depus cu suuces suma de " + sumaDepusa + "  Aveti in cont suma de " + this.sold);
    }

    public void plataCard(double sumaCheltuita){
        System.out.println(" Buna " + this.titularCont);
        // pot sa cheltuiesc doar ce am
        // daca suma chetuita <= sold
        if (sumaCheltuita <= this.sold){
            //dispar banii din cont
            this.sold = this.sold - sumaCheltuita;
            System.out.println("Ai cheltuit " + sumaCheltuita);
            System.out.println("Mai ai " + this.sold);
        } else {
            System.out.println("Fonduri insuficiente");

        }

    }


    // inheritance
    // polimorphism
    // encapsulation
    // abstractization



}
