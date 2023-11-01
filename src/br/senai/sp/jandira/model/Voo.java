package br.senai.sp.jandira.model;

import java.time.*;
import java.util.*;

abstract class Voo {
    private int numeroVoo, capacidadePassageiros;
    private String origem, destino;
    private LocalDate dataPartida;
    private LocalTime horaPartida;

    Random random = new Random();

    LocalDate data = LocalDate.of(2023, random.nextInt(12) + 1, random.nextInt(31) + 1);

    LocalTime hora = LocalTime.of(random.nextInt(24), random.nextInt(60));


    public Voo(int numeroVoo, int capacidadePassageiros, String origem, String destino){

        this.numeroVoo = numeroVoo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = data;
        this.horaPartida = hora;

    }
    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(LocalTime horaPartida) {
        this.horaPartida = horaPartida;
    }
}
