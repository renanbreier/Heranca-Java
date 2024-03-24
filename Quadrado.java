public class Quadrado extends Forma {

    private double comprimento;
    private double largura;

    public Quadrado(String nome, int dimensao, double comprimento, double largura) {
        super(nome, dimensao);
        if (comprimento != largura) {
            this.comprimento = Math.max(comprimento, largura);
            this.largura = this.comprimento;
        } else {
            this.comprimento = comprimento;
            this.largura = largura;
        }
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public String toString() {
        return "Forma: Quadrado\nDimensão: " + dimensao + "\nComprimento= largura= " + comprimento + ", Área= " + area();
    }

    public double area() {
        return comprimento * largura;
    }

    public double volume() {
        return 0;
    }

    public void print(){
        System.out.println(toString());
    }
}
