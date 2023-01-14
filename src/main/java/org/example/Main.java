package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        emitirPedido();
        criarRoupa();
        gerenciaEstoque();
        gerenciaEstoque();


    }

    public static void gerenciaEstoque() {

        Estilista estilista = new Estilista(1, "123456789", "35984114444", "Rua 1", "Joao");
        Supervisor supervisor = new Supervisor("1", "Manha", "123456789", "João", "Rua 1");
        MaquinaDeCostura maquinaDeCostura = new MaquinaDeCostura(1, List.of(new TipoDeTecido("1", "Algodão")), List.of(new TipoDeCostura("3", "Ponto zig-zag")), supervisor, "Embrael", false, null);
        Costureira costureira = new Costureira("1", "Marcia", null, maquinaDeCostura, "Manhã", supervisor);
        Estoque estoque = new Estoque("0", 0, new ArrayList<>());

        System.out.println("Processo de gerenciar o estoque");
        Roupa roupa = estilista.projetaRoupa("Vestido Vermelho");
        Roupa roupaProduzida = costureira.criaRoupa(roupa);
        costureira.finalizarProducaoDaRoupa(roupaProduzida, estoque);
        estoque.gerarRelatorioDePecasVendidas();
        costureira.gerarRelatorioDeRoupasProduzidas();
    }

    public static void monitoraMaquina() {
        Supervisor supervisor = new Supervisor("1", "Manha", "123456789", "João", "Rua 1");
        MaquinaDeCostura maquinaDeCostura = new MaquinaDeCostura(1, List.of(new TipoDeTecido("1", "Algodão")), List.of(new TipoDeCostura("3", "Ponto zig-zag")), supervisor, "Embrael", false, null);


        Manutencao manutencao = supervisor.enviarMaquinaAoConcerto(maquinaDeCostura);
        manutencao.registraManutencao(maquinaDeCostura);
        supervisor.gerarRelatorioDeMaquinasQuebradas();
        supervisor.removeDaManutencao(manutencao, maquinaDeCostura);

    }

    public static void criarRoupa() {
        Estilista estilista = new Estilista(1, "123456789", "35984114444", "Rua 1", "Joao");
        Supervisor supervisor = new Supervisor("1", "Manha", "123456789", "João", "Rua 1");
        MaquinaDeCostura maquinaDeCostura = new MaquinaDeCostura(1, List.of(new TipoDeTecido("1", "Algodão")), List.of(new TipoDeCostura("3", "Ponto zig-zag")), supervisor, "Embrael", false, null);
        Costureira costureira = new Costureira("1", "Marcia", null, maquinaDeCostura, "Manhã", supervisor);
        Estoque estoque = new Estoque("0", 0, new ArrayList<>());


        System.out.println("Processo de Criar Roupa");
        Roupa roupa = estilista.projetaRoupa("Vestido Vermelho");
        Roupa roupaProduzida = costureira.criaRoupa(roupa);
        costureira.finalizarProducaoDaRoupa(roupaProduzida, estoque);
        costureira.gerarRelatorioDeRoupasProduzidas();

    }

    public static void emitirPedido() {
        Cliente cliente = new Cliente(1, "123456789", "João", "Rua 1", "123456789");
        Estilista estilista = new Estilista(1, "123456789", "35984114444", "Rua 1", "Joao");
        Supervisor supervisor = new Supervisor("1", "Manha", "123456789", "João", "Rua 1");
        MaquinaDeCostura maquinaDeCostura = new MaquinaDeCostura(1, List.of(new TipoDeTecido("1", "Algodão")), List.of(new TipoDeCostura("3", "Ponto zig-zag")), null, "Embrael", false, null);
        Costureira costureira = new Costureira("1", "Marcia", null, maquinaDeCostura, "Manhã", supervisor);
        Estoque estoque = new Estoque("0", 0, new ArrayList<>());

        System.out.println("Processo de emitir Pedido");
        Venda venda = cliente.solicitarRoupa("Vestido Vermelho", 2);
        Roupa roupa = estilista.projetaRoupa("Vestido Vermelho");
        Roupa roupaProduzida = costureira.criaRoupa(roupa);
        costureira.finalizarProducaoDaRoupa(roupaProduzida, estoque);
        Venda vendaFinal = supervisor.venderPecaAoCliente(estoque, roupaProduzida, venda);
    }

}