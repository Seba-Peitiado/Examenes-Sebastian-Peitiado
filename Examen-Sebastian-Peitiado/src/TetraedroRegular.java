public class TetraedroRegular extends FiguraTridimensional{

    // Atributos
    double Arista;

// constructores


    public TetraedroRegular(double arista) {
        Arista = arista;
    }

    public TetraedroRegular() {
        Arista =1;
    }

    public static int Caras () {
        final int  pepe3=4;
        return pepe3;
    }

    @Override
    public double calcularVolumen(double volumen) {
        volumen = Math.sqrt(2)*(Arista^3)/12;

        return volumen;
    }

    @Override
    public double calcularSuperficie(double superficie) {
        superficie = Math.sqrt(3)*(Arista^2);
        return superficie;
    }

    @Override
    public String toString() {
        return "La figura es un TetraedroRegular{" +
                "Arista=" + Arista +
                '}';
    }
}
