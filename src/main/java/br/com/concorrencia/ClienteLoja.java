package br.com.concorrencia;

import java.util.concurrent.Future;

public class ClienteLoja {

    public static void main(String[] args) {
        final Loja loja = new Loja("Gadgets Inc.");
        final long start = System.nanoTime();
        //Query a loja para obter o preço de um produto
        final Future<Double> precoFuturo = loja.getPrecoAssinc("o meu produto");
        final long invocationTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("A invocação retornou depois de " + invocationTime + " msecs");
        //Executa outras tasks tais como aceder a outras lojas
        fazMaisCenas();
        //enquanto o preço do produto está a ser calculado
        try{
            //Lê o preço do Future
            final double preco = precoFuturo.get();
            System.out.printf("Preço: %.2f%n", preco);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        final long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Preço retornado depois de " + retrievalTime + " msecs");
    }

    public static void fazMaisCenas(){
        System.out.println("Estou a pesquisar noutras lojas");
    }
}
