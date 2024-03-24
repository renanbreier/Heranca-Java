public class Tetraedro extends Forma{
    private double altura;
    private double largura;
    private double profundidade;

    public Tetraedro(String nome, int dimensao, double altura, double largura, double profundidade) {
        super(nome, dimensao);
        if (altura != Math.sqrt(6) / 3 * largura || profundidade != Math.sqrt(2) / 2 * largura) {
            this.altura = Math.sqrt(6) / 3 * largura;
            this.largura = largura;
            this.profundidade = Math.sqrt(2) / 2 * largura;
        } else {
            this.altura = altura;
            this.largura = largura;
            this.profundidade = profundidade;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public String toString() {
    return "Forma: Tetraedro\nDimensão: " + dimensao + "\nlargura: " + largura + "\nprofundidade: " + profundidade + "\nAltura: " + altura + "\nÁrea: " + area() + "\nVolume: " + volume();
    }

    public double area() {
        return Math.sqrt(3) * largura * largura;
    }

    public double volume() {
        return Math.sqrt(2) / 12 * largura * largura * largura;
    }

    public void print() {
        System.out.println(toString());
    }
}

