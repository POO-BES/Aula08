public class Circulo extends FormaGeometrica {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    //Sobrescrita
    @Override
    public float calcularArea() {
        return (float)(Math.PI * Math.pow(raio, 2));
    }

    //Mais de um método com o mesmo NOME: sobrecarga
    public float calcularArea(float raio) {
        this.raio = raio;
        return (float)(Math.PI * Math.pow(this.raio, 2));
    }
}
