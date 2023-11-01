package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gol extends Voo{

    String agencia;

    public Gol(int numeroVoo, int capacidadePassageiros, String origem, String destino) {
        super(numeroVoo, capacidadePassageiros, origem, destino);
        this.agencia = "Gol";
    }

    public String getAgencia() {
        return agencia;
    }

}
