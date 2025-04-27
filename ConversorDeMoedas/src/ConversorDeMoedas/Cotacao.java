package ConversorDeMoedas;

public class Cotacao {
    //valores das moedas
    public static void Real_troca(double qtd) {
        //Real para dólar
        System.out.println("1 Real(BRL) equivale a " + 0.18 + " dólares(USD)");
        System.out.println(qtd + " Reais(BRL) equivalem a " + 0.18*qtd + " dólares(USD)");
        System.out.println("-----------------------------------------------------");
        //Real para euro
        System.out.println("1 Real(BRL) equivale a " + 0.15 + " euros(EUR)");
        System.out.println(qtd + " Reais(BRL) equivalem a " + qtd*0.15 + " euros(EUR)");
        System.out.println("-----------------------------------------------------");
        //Real para libras
        System.out.println("1 Real(BRL) equivale a " + 0.13 + " libras esterlinas(GBP)");
        System.out.println(qtd + " Reais(BRL) equivalem a " + qtd*0.13 + " libras esterlinas(GBP)");
        System.out.println("-----------------------------------------------------");
        //Real para bitcoin
        System.out.println("1 Real(BRL) equivale a " + 0.00000187 + " bitcoins(BTC)");
        System.out.println(qtd + "Reais(BRL) equivalem a " + qtd*0.00000187 + " bitcoins(BTC)");
    }

    public static void Dolar_troca(double qtd) {
        //Dólar para real
        System.out.println("1 Dólar(USD) equivale a " + 5.69 + " reais(BRL)");
        System.out.println(qtd + " Dólares(USD) equivalem a " + qtd*5.69 + " reais(BRL)");
        System.out.println("-----------------------------------------------------");
        //Dólar para euro
        System.out.println("1 Dólar(USD) equivale a " + 0.88 + " euros(EUR)");
        System.out.println(qtd + " Dólares(USD) equivalem a " + qtd*0.88 + " euros(EUR)");
        System.out.println("-----------------------------------------------------");
        //Dólar para libras
        System.out.println("1 Dólar(USD) equivale a " + 0.75 + " libras esterlinas(GBP)");
        System.out.println(qtd + " Dólares(USD) equivalem a " + qtd*0.75 + " libras esterlinas(GBP)");
        System.out.println("-----------------------------------------------------");
        //Dólar para bitcoin
        System.out.println("1 Dólar(USD) equivale a " + 0.00001056 + " bitcoins(BTC)");
        System.out.println(qtd + " Dólares(USD) equivalem a " + qtd*0.00001056 + " bitcoins(BTC)");
    }

    public static void Euro_troca(double qtd) {
        //Euro para real
        System.out.println("1 Euro(EUR) equivale a " + 6.46 + " reais(BRL)");
        System.out.println(qtd + " Euros(EUR) equivalem a " + qtd*6.46 + " reais(BRL)");
        System.out.println("-----------------------------------------------------");
        //Euro para dólar
        System.out.println("1 Euro(EUR) equivale a " + 1.14 + " dólares(USD)");
        System.out.println(qtd + " Euros(EUR) equivalem a " + qtd*1.14 + " dólares(USD)");
        System.out.println("-----------------------------------------------------");
        //Euro para libras
        System.out.println("1 Euro(EUR) equivale a " + 0.85 + " libras esterlinas(GBP)");
        System.out.println(qtd + " Euros(EUR) equivalem a " + qtd*0.85 + " libras esterlinas(GBP)");
        System.out.println("-----------------------------------------------------");
        //Euro para bitcoin
        System.out.println("1 Euro(EUR) equivale a " + 0.000012 + " bitcoins(BTC)");
        System.out.println(qtd + " Euros(EUR) equivalem a " + qtd*0.000012 + " bitcoins(BTC)");
    }

    public static void Libra_troca(double qtd) {
        //Libras para real
        System.out.println("1 Libra esterlina(GBP equivale a " + 7.57 + " reais(BRL)");
        System.out.println(qtd + " Libras esterlinas(GBP) equivalem a " + qtd*7.57 + " reais(BRL)");
        System.out.println("-----------------------------------------------------");
        //Libras para dólar
        System.out.println("1 Libra esterlina(GBP) equivale a " + 1.33 + " dólares(USD)");
        System.out.println(qtd + " Libras esterlinas(GBP) equivalem a " + qtd*1.33 + " dólares(USD)");
        System.out.println("-----------------------------------------------------");
        //Libras para euro
        System.out.println("1 Libra esterlina(GBP) equivale a " + 1.17 + " euros(EUR)");
        System.out.println(qtd + " Libras esterlinas(GBP) equivalem a " + qtd*1.17 + " euros(EUR)");
        System.out.println("-----------------------------------------------------");
        //Libras para bitcoin
        System.out.println("1 Libra esterlina(GBP) equivale a " + 0.0000142 + " bitcoins(BTC)");
        System.out.println(qtd + " Libras esterlinas(GBP) equivalem a " + qtd*0.0000142 + " bitcoins(BTC)");
    }

    public static void Bitcoin_troca(double qtd) {
        //Bitcoin para real
        System.out.println("1 Bitcoin(BTC) equivale a " + 535903.0 + " reais(BRL)");
        System.out.println(qtd + " Bitcoins(BTC) equivalem a " + qtd*535903.0 + " reais(BRL)");
        System.out.println("-----------------------------------------------------");
        //Bitcoin para dólar
        System.out.println("1 Bitcoin(BTC) equivale a " + 94275.0 + " dólares(USD)");
        System.out.println(qtd + " Bitcoins(BTC) equivalem a " + qtd*94275.0 + " dólares(USD)");
        System.out.println("-----------------------------------------------------");
        //Bitcoin para euro
        System.out.println("1 Bitcoin(BTC) equivale a " + 82941.0 + " euros(EUR)");
        System.out.println(qtd + " Bitcoins(BTC) equivalem a " + qtd*82941.0 + " euros(EUR)");
        System.out.println("-----------------------------------------------------");
        //Bitcoin para libras
        System.out.println("1 Bitcoin(BTC) equivale a " + 70843.28 + " libras esterlinas(GBP)");
        System.out.println(qtd + " Bitcoins equivale a " + qtd*70843.28 + " libras esterlinas(GBP)");
    }
}
