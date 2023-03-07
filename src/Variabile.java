public class Variabile {
    public static void main(String[] args) {
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Am cumparat o masina model: " + modelMasina);

        //override
        modelMasina =  "XC 60 Facelift";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Am cumparat o masina model: " + modelMasina);

        //declarare
        String nume;
        String prenume;
        //initializare
        prenume = "Andy";
        nume = "Sanpetrean";
        System.out.println(nume + " " + prenume);



    }
}

//strongly typed - trebuie sa specificam tipul variabilelor cu care lucram - codul este mai explicit
