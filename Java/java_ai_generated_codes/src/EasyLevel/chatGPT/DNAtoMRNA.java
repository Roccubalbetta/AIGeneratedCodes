package EasyLevel.chatGPT;

public class DNAtoMRNA {
    // This method transcribes a DNA strand into mRNA.
    public static String transcribeToMRNA(String dnaStrand) {
        StringBuilder mRNA = new StringBuilder();

        for (char base : dnaStrand.toCharArray()) {
            switch (base) {
                case 'A' -> mRNA.append('U'); // Adenine in DNA becomes Uracil in RNA
                case 'T' -> mRNA.append('A'); // Thymine in DNA becomes Adenine in RNA
                case 'G' -> mRNA.append('C'); // Guanine in DNA becomes Cytosine in RNA
                case 'C' -> mRNA.append('G'); // Cytosine in DNA becomes Guanine in RNA
                default -> throw new IllegalArgumentException("Invalid DNA base: " + base);
            }
        }

        return mRNA.toString();
    }

    public static void main(String[] args) {
        String dnaStrand = "ATGC"; // Example DNA strand
        String mRNA = transcribeToMRNA(dnaStrand);
        System.out.println("mRNA: " + mRNA);
    }
}
