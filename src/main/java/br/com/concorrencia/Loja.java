package br.com.concorrencia;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Loja {
    private final Random rnd = new Random();
    private final String nome;

    public Loja(final String nome){
        this.nome = nome;
    }

    /**
     *
     * @param produto
     * @return o preço do produto
     */
    public double getPreco(final String produto) {
        return calculaPreco(produto);
    }
    /**
     *
     * @return o nome da Loja
     */
    public String getNome() {
        return nome;
    }
    /**
     *
     * @param produto
     * @return
     */
    public Future<Double> getPrecoAssinc(final String produto) {
//Vai guardar o resultado da computação
        final CompletableFuture<Double> precoFuturo = new CompletableFuture<>();
        new Thread ( () -> {
            //Executa a computação assíncronamente noutra Thread
            double preco = calculaPreco(produto);
            //Faz o set do valor computado no Future quando este ficar
            //disponível
            precoFuturo.complete(preco);
        }).start();
//retorna o Future sem ter de esperar pelo fim da computação
        return precoFuturo;
    }

    /**
     * simula um preço aleatório
     *
     * @param produto
     * @return
     */
    private double calculaPreco(final String produto) {
        delay();
        return rnd.nextDouble();
    }

    /**
     * Simula 2 seg. de atraso, como se a aplicação fosse a uma base de dados,
     * contactasse outros fornecedores para verificar o stock, etc
     */
    private void delay() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
        }
    }
}
