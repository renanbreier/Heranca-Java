public abstract class Forma {
    protected String nome;
    protected int dimensao;

    public Forma(String nome, int dimensao) {
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public int getDimensao() {
        return dimensao;
    }

    public abstract String toString();
    public abstract double area();
    public abstract double volume();
    public abstract void print();
}
