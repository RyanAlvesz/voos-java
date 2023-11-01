package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VoosEmirates extends Voo{

    String agencia;

    public VoosEmirates(int numeroVoo, int capacidadePassageiros, String origem, String destino) {
        super(numeroVoo, capacidadePassageiros, origem, destino);
        this.agencia = "Voos Emirates";
    }

    public String getAgencia() {
        return agencia;
    }

}
