package br.com.reinaldo.java8;

public class StringInSwitch_Complete {
    public static void main(String[] args) {
        String mes = "jan";

        switch (mes) {
            case "jan":
                System.out.println("Janeiro");
                break;
            case "fev":
                System.out.println("Fevereiro");
                break;
            case "mar":
                System.out.println("Março");
                break;
            default:
                break;
        }


    }
}
