public class RNACodifier {
    static char convertBase(char base) {
        switch (base) {
        case 'A':
            return 'U';
        case 'T':
            return 'A';
        case 'G':
            return 'C';
        case 'C':
            return 'G';
        default:
            System.out.println("Atenção você forneceu uma Base errada: " + base);
            return base;
        }
    }

    static String generateRNAFromDNA(String dna) {
        String rna = "";

        for (int i = 0; i < dna.length(); i++) {
            char base = dna.charAt(i);
            rna += convertBase(base);
        }

        return rna;
    }

    public static void main(String[] args) {
        String dna = "TCAAGT";

        String rna = generateRNAFromDNA(dna);

        System.out.println("O DNA " + dna + " produz o RNA " + rna);
    }
}
