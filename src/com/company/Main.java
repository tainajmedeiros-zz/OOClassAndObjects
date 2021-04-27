package com.company;

public class Main {

    public static void main(String[] args) {
        //Instanciando um objeto Carro
        Carro meuPrimeiroCarro = new Carro();

        //Instanciando um objeto Pessoa
        Pessoa pessoa = new Pessoa("Taina", 33, "123456789");

        //Atribuindo valores aos atributos do carro
        meuPrimeiroCarro.setCor("Laranja");
        meuPrimeiroCarro.setNumPortas(4);
        meuPrimeiroCarro.setPlaca("ABC1234");
        meuPrimeiroCarro.setTipo("Conversível");
        meuPrimeiroCarro.setDona(pessoa);

        //Acessando os valores dos atributos do carro
        System.out.println("A cor é: " + meuPrimeiroCarro.getCor());
        System.out.println("A quantidade de portas é: " + meuPrimeiroCarro.getNumPortas());
        System.out.println("A placa é: " + meuPrimeiroCarro.placa);
        System.out.println("O tipo é: " + meuPrimeiroCarro.getTipo());
        System.out.println("A dona desse carro é: " + meuPrimeiroCarro.getDona().getNome());

        //Acessando os metodos especificos do objeto carro
        meuPrimeiroCarro.ligar();
        meuPrimeiroCarro.desligar();
        System.out.println(meuPrimeiroCarro.dobroPortas());
    }
}
