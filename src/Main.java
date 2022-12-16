import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriela = new Dev();
        devGabriela.setNome("Gabriela");
        devGabriela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriela:" + devGabriela.getConteudosInscritos());
        devGabriela.progredir();
        devGabriela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriela:" + devGabriela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gabriela:" + devGabriela.getConteudosConcluidos());
        System.out.println("XP:" + devGabriela.calcularTotalXp());

        System.out.println("-------");

        Dev devTamarindo = new Dev();
        devTamarindo.setNome("TamarindodevTamarindo");
        devTamarindo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devTamarindo.getConteudosInscritos());
        devTamarindo.progredir();
        devTamarindo.progredir();
        devTamarindo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devTamarindo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devTamarindo.getConteudosConcluidos());
        System.out.println("XP:" + devTamarindo.calcularTotalXp());

}
}
