public abstract class FormaGeometrica {
    private String nome;

    public String getNome() {
        nome = nome.toLowerCase();
        return nome;
    }

    public abstract float calcularArea();
}
