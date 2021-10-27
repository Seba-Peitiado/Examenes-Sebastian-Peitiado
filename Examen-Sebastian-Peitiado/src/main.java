public class main {

    public static void main (String[] args) {

        Ortoedro ortoedro = new Ortoedro(3,5,1);

        Cubo cubo = new Cubo(7,8);

        TetraedroRegular tetraedroRegular = new TetraedroRegular(1);


       ortoedro.toString();
       ortoedro.calcularVolumen();
       ortoedro.calcularSuperficie();

       cubo.toString();
       cubo.calcularVolumen();
       cubo.calcularSuperficie();

       tetraedroRegular.toString();
       tetraedroRegular.calcularVolumen();
       tetraedroRegular.calcularSuperficie();

    }
}
