public class Ortoedro extends FiguraTridimensional{

    // Atributos
    double ancho;
    double base;
    double altura;

    // constructores


    public Ortoedro(double ancho, double base, double altura) {
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }

    public Ortoedro() {
        ancho =1;
        base=1;
        altura=1;
    }

    public static int Caras () {
        final int pepe2 = 6;
        return pepe2;
    }

    @Override
    public double calcularVolumen(double volumen) {
        volumen = ancho*base*altura;
        return volumen;
    }

    @Override
    public double calcularSuperficie(double Superficie) {
        Superficie = 2*(ancho*base)+2*(ancho*altura)+2*(base*altura);
        return Superficie;
    }

    @Override
    public String toString() {
        return "La Siguiente Figura es un Ortoedro{" +
                "ancho=" + ancho +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
