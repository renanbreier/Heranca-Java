public class TrianguloEquilatero extends Forma{
    private double largura;
    private double altura;

    public TrianguloEquilatero(String nome, int dimensao, double largura, double altura) {
        super(nome, dimensao);
        if (Math.sqrt(3) * largura != altura) {
            this.largura = Math.sqrt(3) * largura;
            this.altura = this.largura;
        } else {
            this.largura = largura;
            this.altura = altura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public String toString() {
        return "Forma: Triangulo Equilatero\nDimensão: " + dimensao + "\nLargura: " + largura + "\nAltura: " + altura + "\nArea: " + area();
    }

    public double area() {
        return largura * altura / 2;
    }

    public double volume() {
        return 0;
    }

    public void print() {
        System.out.println(toString());
    }
}
