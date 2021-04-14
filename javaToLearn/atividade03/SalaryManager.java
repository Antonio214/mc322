import java.util.Random;

public class SalaryManager {
    static int generateRandomInRange(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

    static int generateSalary() {
        int newSalary = generateRandomInRange(2500, 15000);

        return newSalary;
    }

    static int calculateMedia(int listOfSalaries[]) {
        int sum = 0;

        for (int i = 0; i < listOfSalaries.length; i++) {
            sum += listOfSalaries[i];
        }

        return sum / listOfSalaries.length;
    }

    static int countAboveMedia(int listOfSalaries[], int media) {
        int contador = 0;

        for (int i = 0; i < listOfSalaries.length; i++) {
            if (listOfSalaries[i] > media) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int listOfSalaries[];
        listOfSalaries = new int[50];

        for (int i = 0; i < 50; i++) {
            listOfSalaries[i] = SalaryManager.generateSalary();
        }

        int media = SalaryManager.calculateMedia(listOfSalaries);
        int aboveMedia = SalaryManager.countAboveMedia(listOfSalaries, media);

        System.out.println("Quantidade de salarios acima da média: " + aboveMedia);
    }
}
