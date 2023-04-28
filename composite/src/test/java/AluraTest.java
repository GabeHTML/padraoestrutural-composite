import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AluraTest {
    @Test
    void deveRetornarEmentaDaAlura() {
        Curso curso1 = new Curso("Introdução a Python");
        Curso curso2 = new Curso("Introdução a C#");
        Curso curso3 = new Curso("HTML e CSS");

        Materia materia1 = new Materia("Desenvolvendo dados usando BD", 45);
        Materia materia2 = new Materia("Curso Intuitivo de HTML e CSS", 55);

        curso2.addConteudo(materia2);
        curso3.addConteudo(materia1);

        Curso ementa = new Curso("Curso de Desenvolvimento de Jogos");
        ementa.addConteudo(curso1);
        ementa.addConteudo(curso2);
        ementa.addConteudo(curso3);

        Alura alura = new Alura();
        alura.setEmenta(ementa);

        assertEquals(
                "Curso de Desenvolvimento de Jogos\n" +
                "Curso Introdução a Python\n" +
                "Curso Introdução a C#\n" +
                "Projeto Curso Intuitivo de HTML e CSS - pontuação: 55\n" +
                "Projeto Desenvolvimento de Dados usando BD - pontuação: 45\n", alura.getEmenta());
    }

    @Test
    void deveLancarExcecaoQuandoAluraNaoTiverEmenta() {
        try {
            Alura alura = new Alura();
            alura.getEmenta();
            fail();
        } catch (NullPointerException ex) {
            assertEquals("Alura está sem ementa disponível.", ex.getMessage());
        }
    }
}