import java.util.ArrayList;
import java.util.List;

public class Curso extends Conteudo {
    private List<Conteudo> conteudos;

    public Curso(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<>();
    }

    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    @Override
    public String getConteudo() {
        StringBuilder output = new StringBuilder("Curso " + this.getDescricao() + "\n");
        for (Conteudo conteudo  : conteudos) {
            output.append(conteudo.getConteudo());
        }
        return output.toString();
    }
}
