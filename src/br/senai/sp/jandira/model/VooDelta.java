package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VooDelta extends Voo {

    String agencia;

    public VooDelta(int numeroVoo, int capacidadePassageiros, String origem, String destino) {
        super(numeroVoo, capacidadePassageiros, origem, destino);
        this.agencia = "Voo Delta";
    }

    public String getAgencia() {
        return agencia;
    }

}
