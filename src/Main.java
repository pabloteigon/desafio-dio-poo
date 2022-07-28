import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição curso Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso JS");
        cursoJs.setDescricao("Descrição curso JS");
        cursoJs.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso);
        System.out.println(mentoria);

        System.out.println(curso.calcularXP());
        System.out.println(mentoria.calcularXP());*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoria);

        Dev devPablo = new Dev();
        devPablo.setNome("Pablo");
        devPablo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devPablo.getConteudosInscritos());
        devPablo.progredir();
        devPablo.progredir();
        System.out.println("Conteúdos inscritos: " + devPablo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devPablo.getConteudosConcluidos());
        System.out.println("XP: " + devPablo.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devPablo.calcularTotalXp());
    }
}
