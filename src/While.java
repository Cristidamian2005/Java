public class While {
    public static void main(String[] args) {
        // while - loop
        // zona de cod care se repeta atat timp cat o conditie e true

        // problema : masina merge cat timp are benzina
        int litriBenzina = 10 ;
        while (litriBenzina > 0){
            System.out.println("vrum vrum");
            litriBenzina=litriBenzina-1;
            //aprindem beculetul cand avem mai putin de 3 litri
            if (litriBenzina<=3){
                System.out.println("aprindem becul");
            }
        }
        System.out.println("nu mai avem benzina");

    }
}
