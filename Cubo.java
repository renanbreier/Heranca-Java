public class Cubo extends Forma{
    private double altura;
    private double largura;
    private double profundidade;

    public Cubo(String nome, int dimensao, double altura, double largura, double profundidade) {
        super(nome, dimensao);
        if (altura != profundidade || altura != largura) {
            this.altura = Math.max(Math.max(altura, largura), profundidade);
            this.largura = this.altura;
            this.profundidade = this.altura;
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
        return "Forma: Cubo\nDimensão: " + dimensao + "\nAltura: " + altura + ", largura: " + largura + ", profundidade: " + profundidade + "\nÁrea: " + area() + "\nVolume: " + volume();
    }

    public double area() {
        return 4 * largura * largura;
    }

    public double volume() {
        return largura * altura * profundidade;
    }

    public void print() {
        System.out.println(toString());
    }
}
