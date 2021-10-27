public class Cubo extends FiguraTridimensional{


    // Atributos

    double Lado;
    double Arista;

    // constante
    public static int Caras () {
        final int  pepe4= 6;
        return pepe4;
    }

    // constructor


    public Cubo(double lado, double arista) {
        Lado = lado;
        Arista = arista;
    }

    public Cubo() {
        Lado =1;
        Arista =1;
    }

    @Override
    public double calcularVolumen(double volumen) {
        volumen = Lado ^ 3;
        return volumen;
    }

    @Override
    public double calcularSuperficie(double superficie) {
        superficie = 6*(Arista^2);
        return 0;
    }

    @Override
    public String toString() {
        return "La figura es un Cubo{" +
                "Lado=" + Lado +
                ", Arista=" + Arista +
                '}';
    }
}
