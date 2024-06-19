package br.com.dio.desafio.dominio;


import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java descrição");
        curso1.setCargaHoraria(80);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
