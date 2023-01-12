package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("1", "123456789", "João", "Rua 1", "123456789", new ArrayList<>()));
        clientes.add(new Cliente("2", "987654321", "Maria", "Rua 2", "987654321", new ArrayList<>()));
        clientes.add(new Cliente("3", "123987456", "José", "Rua 3", "123987456", new ArrayList<>()));
        clientes.add(new Cliente("4", "456789123", "Ana", "Rua 4", "456789123", new ArrayList<>()));
        clientes.add(new Cliente("5", "789123456", "Pedro", "Rua 5", "789123456", new ArrayList<>()));

        //Create four Vendas
        ArrayList<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda("1", clientes.get(0),null, 100));
        vendas.add(new Venda("2", clientes.get(0),null,  200));
        vendas.add(new Venda("3", clientes.get(0),null,  300));
        vendas.add(new Venda("4", clientes.get(0),null,  400));

        //Create Estilistas
        ArrayList<Estilista> estilistas = new ArrayList<>();
        estilistas.add(new Estilista("1", "123456789", "João", "Rua 1", "123456789", new ArrayList<>()));
        estilistas.add(new Estilista("2", "987654321", "Maria", "Rua 2", "987654321", new ArrayList<>()));
        estilistas.add(new Estilista("3", "123987456", "José", "Rua 3", "123987456", new ArrayList<>()));
        estilistas.add(new Estilista("4", "456789123", "Ana", "Rua 4", "456789123", new ArrayList<>()));
        estilistas.add(new Estilista("5", "789123456", "Pedro", "Rua 5", "789123456", new ArrayList<>()));

        //Create TipoDeTecido
        ArrayList<TipoDeTecido> tiposDeTecido = new ArrayList<>();
        tiposDeTecido.add(new TipoDeTecido("1", "Algodão"));
        tiposDeTecido.add(new TipoDeTecido("2", "Lã"));
        tiposDeTecido.add(new TipoDeTecido("3", "Seda"));
        tiposDeTecido.add(new TipoDeTecido("4", "Linho"));
        tiposDeTecido.add(new TipoDeTecido("5", "Couro"));

        //Create Estoque
        Estoque estoque = new Estoque("0", 0, new ArrayList<>());

        //Create Manutencao
        Manutencao manutencao = new Manutencao("0",new Date(),new Date(), new ArrayList<>());

        //Create TipoDeCostura
        ArrayList<TipoDeCostura> tiposDeCostura = new ArrayList<>();
        tiposDeCostura.add(new TipoDeCostura("1", "Overlock"));
        tiposDeCostura.add(new TipoDeCostura("2", "Ponto reto"));
        tiposDeCostura.add(new TipoDeCostura("3", "Ponto zig-zag"));
        tiposDeCostura.add(new TipoDeCostura("4", "Ponto de alinhavo"));
        tiposDeCostura.add(new TipoDeCostura("5", "Ponto de barra"));

        //Create MaquinaDeCostura
        ArrayList<MaquinaDeCostura> maquinasDeCostura = new ArrayList<>();
        maquinasDeCostura.add(new MaquinaDeCostura("1",tiposDeTecido.stream().toList(), tiposDeCostura.stream().toList(),null, "Embrael",  false,null));
        maquinasDeCostura.add(new MaquinaDeCostura("2",tiposDeTecido.stream().toList(), tiposDeCostura.stream().toList(),null, "Amazon",  false,null));
        maquinasDeCostura.add(new MaquinaDeCostura("3",tiposDeTecido.stream().toList(), tiposDeCostura.stream().toList(),null, "Google",  false,null));
        maquinasDeCostura.add(new MaquinaDeCostura("4",tiposDeTecido.stream().toList(), tiposDeCostura.stream().toList(),null, "Microsoft",  false,null));
        maquinasDeCostura.add(new MaquinaDeCostura("5",tiposDeTecido.stream().toList(), tiposDeCostura.stream().toList(),null, "Apple",  false,null));

        //Create Supervisor
        ArrayList<Supervisor> supervisores = new ArrayList<>();
        supervisores.add(new Supervisor("1", "Manha", "123456789", "João", "Rua 1", new ArrayList<>(),new ArrayList<>()));
        supervisores.add(new Supervisor("2", "Tarde", "987654321", "Maria", "Rua 2", new ArrayList<>(),new ArrayList<>()));
        supervisores.add(new Supervisor("3", "Noite", "123987456", "José", "Rua 3", new ArrayList<>(),new ArrayList<>()));

        //Create Costureiras
        ArrayList<Costureira> costureiras = new ArrayList<>();
        costureiras.add(new Costureira("1","Marcia",null, maquinasDeCostura.get(0), new ArrayList<>(), "Manhã", supervisores.get(0), new ArrayList<>()));
        costureiras.add(new Costureira("2","Maria",null, maquinasDeCostura.get(1), new ArrayList<>(), "Manhã", supervisores.get(0), new ArrayList<>()));
        costureiras.add(new Costureira("3","Joana",null, maquinasDeCostura.get(2), new ArrayList<>(), "Manhã", supervisores.get(0), new ArrayList<>()));

        //Create Roupas
        ArrayList<Roupa> roupas = new ArrayList<>();
        roupas.add(new Roupa("1",tiposDeTecido.get(0), costureiras.get(0), estilistas.get(0), estoque,vendas.get(0)));
        roupas.add(new Roupa("2",tiposDeTecido.get(1), costureiras.get(1), estilistas.get(1), estoque,vendas.get(1)));
        roupas.add(new Roupa("3",tiposDeTecido.get(2), costureiras.get(2), estilistas.get(2), estoque,vendas.get(2)));
        roupas.add(new Roupa("4",tiposDeTecido.get(3), costureiras.get(0), estilistas.get(3), estoque,vendas.get(3)));
        roupas.add(new Roupa("5",tiposDeTecido.get(4), costureiras.get(1), estilistas.get(3), estoque,vendas.get(3)));

        //Relacionar Estilista com Roupa
        estilistas.get(0).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(0))));
        estilistas.get(1).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(1))));
        estilistas.get(2).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(2))));
        estilistas.get(3).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(3))));
        estilistas.get(4).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(4))));

        //Relacionar Supervisor com Costureira
        supervisores.get(0).setCostureiras(new ArrayList<>(Arrays.asList(costureiras.get(0),costureiras.get(1))));
        supervisores.get(1).setCostureiras(new ArrayList<>(Arrays.asList(costureiras.get(3),costureiras.get(2))));

        //Relacionar Costureira com Roupa
        costureiras.get(0).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(0),roupas.get(3))));
        costureiras.get(1).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(1),roupas.get(4))));
        costureiras.get(2).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(2),roupas.get(5))));

        //Relacionar Roupa com Venda
        roupas.get(0).setVenda(vendas.get(0));
        roupas.get(1).setVenda(vendas.get(1));
        roupas.get(2).setVenda(vendas.get(2));
        roupas.get(3).setVenda(vendas.get(3));
        roupas.get(4).setVenda(vendas.get(4));

        //Relacionar Estoque com Roupa
        estoque.setRoupas(new ArrayList<>(Arrays.asList(roupas.get(0),roupas.get(1),roupas.get(2),roupas.get(3),roupas.get(4))));

        //Relacionar Venda com Roupa
        vendas.get(0).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(0))));
        vendas.get(1).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(1))));
        vendas.get(2).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(2))));
        vendas.get(3).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(3))));
        vendas.get(4).setRoupas(new ArrayList<>(Arrays.asList(roupas.get(4))));

        //Relacionar Venda com Cliente
        vendas.get(0).setCliente(clientes.get(0));
        vendas.get(1).setCliente(clientes.get(1));
        vendas.get(2).setCliente(clientes.get(2));
        vendas.get(3).setCliente(clientes.get(3));

        //Relacionar Cliente com Venda
        clientes.get(0).setCompras(new ArrayList<>(Arrays.asList(vendas.get(0))));
        clientes.get(1).setCompras(new ArrayList<>(Arrays.asList(vendas.get(1))));
        clientes.get(2).setCompras(new ArrayList<>(Arrays.asList(vendas.get(2))));
        clientes.get(3).setCompras(new ArrayList<>(Arrays.asList(vendas.get(3))));

        System.out.println();








    }
}