package br.edu.up;
import br.edu.up.Carro.Tipo;

public class Programa {

    public static void main(String[] args){

        //PROGRAMAÇÃO ESTRUTURADA

        //String modelo1 = "Mille";
        //String modelo2 = "California";
        String[] modelos = {"Mille", "California"};

        //int velocidade1 = 80;
        //int velocidade2 = 300;
        int[] velocidades = {80, 300};

        //String nome1 = "Pedro";
        //String nome2 = "James";
        //String nome3 = "Rafael";
        String[] nomes = {"Pedro", "James", "Rafael"};

        //int altura1 = 175;
        //int altura2 = 175;
        //int altura3 = 180;
        int[] alturas = {175 , 175, 180};

        //PROGRAMAÇÃO ORIENTADA A OBJETOS
        
        Carro uno = new Carro(Carro.Tipo.UNO, "Mille");
        //uno.modelo = "Mille";
        //uno.velocidade = 80;
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        System.out.println("Velocidade UNO: " + uno.getVelocidade());

        Carro ferrari = new Carro(Carro.Tipo.FERRARI);
        //ferrari.modelo = "California";
        ferrari.setModelo("California");
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();
        System.out.println("Velocidade FERRARI: " + ferrari.getVelocidade());

        Pessoa pedro = new Pessoa();
        pedro.nome = "Pedro";
        pedro.altura = 175;

        Pessoa james = new Pessoa();
        james.nome = "James";
        james.altura = 175;

        Pessoa rafael = new Pessoa();
        rafael.nome = "Rafael";
        rafael.altura = 180;
        
    }
}