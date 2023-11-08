package br.senai.sp.jandira.model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Menu {

    List<Voo> voos = new ArrayList<>();
    List<Voo> voosPesquisa = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    
    public void mostrarVoos(List<Voo> voos){

        for (Voo voo: voos) {
            System.out.println("Número do Voo: " + voo.getNumeroVoo());
            System.out.println("Capacidade de Passageiros: " + voo.getCapacidadePassageiros());
            System.out.println("Origem: " + voo.getOrigem());
            System.out.println("Destino: " + voo.getDestino());
            System.out.println("Data de Partida: " + voo.getDataPartida());
            System.out.println("Horário de Partida: " + voo.getHoraPartida());
            System.out.println("");
        }
        
    }
    
    public void cadastrarVoos(){

        Gol voo1 = new Gol(1, 300, "São Paulo", "Salvador");
        voos.add(voo1);
        Gol voo2 = new Gol(2, 300, "São Paulo", "Casa da Gabriela");
        voos.add(voo2);
        Gol voo3 = new Gol(3, 300, "São Paulo", "Rio de Janeiro");
        voos.add(voo3);

        VoosEmirates voo4 = new VoosEmirates(4, 300, "São Paulo", "Salvador");
        voos.add(voo4);
        VoosEmirates voo5 = new VoosEmirates(5, 300, "São Paulo", "Paris");
        voos.add(voo5);
        VoosEmirates voo6 = new VoosEmirates(6, 300, "São Paulo", "Lisboa");
        voos.add(voo6);

        VooDelta voo7 = new VooDelta(7, 300, "São Paulo", "Coreia do Sul");
        voos.add(voo7);
        VooDelta voo8 = new VooDelta(8, 300, "São Paulo", "Japão");
        voos.add(voo8);
        VooDelta voo9 = new VooDelta(9, 300, "São Paulo", "China");
        voos.add(voo9);
        
    }

    public void pesquisar(String pesquisa){

        voosPesquisa.clear();
        int numeroVoo = 0;
        LocalDate newDate = LocalDate.of(2000, 1, 1);

        try {

            numeroVoo = Integer.parseInt(pesquisa);

        } catch (Exception erro){}

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM uuuu");
            newDate = LocalDate.parse(pesquisa, formatter);

        } catch (Exception erro){}

        for (Voo voo : voos) {

            String origem = voo.getOrigem(), destino = voo.getDestino();
            int nvoo = voo.getNumeroVoo();
            LocalDate data = voo.getDataPartida();
            System.out.println(voo.getDataPartida());

            if (pesquisa.equalsIgnoreCase(origem)){
                voosPesquisa.add(voo);
            } else if (pesquisa.equalsIgnoreCase(destino)) {
                voosPesquisa.add(voo);
            } else if (numeroVoo == nvoo) {
                voosPesquisa.add(voo);
            } else if (pesquisa.equalsIgnoreCase(data.toString())) {
                voosPesquisa.add(voo);
            }
        }

    }
    public void mostrarMenu(){
        
        boolean continuar = true;
        
        while (continuar){

            System.out.println("*****************************************");
            System.out.println("                  Menu");
            System.out.println("*****************************************");
            System.out.println("1- Mostrar Voos");
            System.out.println("2- Pesquisar Voo");
            System.out.println("3- Sair");
            int resposta = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");
            switch (resposta){
                
                case 1:
                    mostrarVoos(voos);
                    break;
                    
                case 2:
                    System.out.println("Pesquise por Número do Voo, Origem, Destino ou Data de Partida");
                    pesquisar(scanner.nextLine());
                    System.out.println("");
                    if (voosPesquisa.size() >= 1){
                        mostrarVoos(voosPesquisa);
                    }else{
                        System.out.println("Voo não encontrado");
                    }
                    break;
                    
                case 3:
                    continuar = false;
                    break;
            }
            
        }
        
    }
    
}
