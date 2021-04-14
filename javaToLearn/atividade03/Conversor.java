import java.util.Random;

public class Conversor {
    static int pegarMaxDivisorBinario(int numero) {
        int divisorMax = 1;

        while (divisorMax <= numero) {
            divisorMax *= 2;
        }

        return divisorMax / 2;
    }

    static String converterInteiroBinario(int numero) {
        String repBooleana = "";
        int divisorMax = pegarMaxDivisorBinario(numero);

        int dividendo = numero;
        for (int divisor = divisorMax; divisor > 1; divisor = divisor / 2) {
            String bitParceal = (dividendo / divisor >= 1) ? "1" : "0";
            repBooleana += bitParceal;

            dividendo = dividendo % divisor;
        }

        if (dividendo == 1) {
            repBooleana += 1;
        } else {
            repBooleana += 0;
        }

        return repBooleana;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int numSorteado = rand.nextInt(10000);
        System.out.println("Número Sorteado: " + numSorteado);

        String convertido = converterInteiroBinario(numSorteado);
        System.out.println("Número convertido para binário: " + convertido);
    }
}
