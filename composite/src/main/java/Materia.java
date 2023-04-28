public class Materia extends Conteudo {
    private int pontuacao;

    public Materia(String descricao, int pontuacao) {
        super(descricao);
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String getConteudo() {
        return "Materia " + this.getDescricao() + " - pontuação: " + this.getPontuacao() + "\n";
    }
}
