import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Boocamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //DevPaulo
        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("PAULO");
        System.out.println("Conteudos inscritos Paulo (antes de progredir): " + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        System.out.println("Conteudos inscritos Paulo (depois de progredir): " + devPaulo.getConteudosInscritos());
        System.out.println("Conteudos concluídos Paulo: " + devPaulo.getConteudoConcluidos());
        devPaulo.progredir();
        System.out.println("XP: " + devPaulo.calcularTotalXP());

        System.out.println("----------------------------------");
        //DevJoao
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("JOÃO");
        System.out.println("Conteudos inscritos João: (antes de progredir)" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos inscritos João (depois de progredir): " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluídos João: " + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());

    }
}