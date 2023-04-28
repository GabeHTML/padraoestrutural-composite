public class Alura {
    private Conteudo ementa;

    public String getEmenta() {
        if (this.ementa == null) {
            throw new NullPointerException("Alura sem ementa disponível.");
        }
        return this.ementa.getConteudo();
    }

    public void setEmenta(Conteudo ementa) {
        this.ementa = ementa;
    }
}
