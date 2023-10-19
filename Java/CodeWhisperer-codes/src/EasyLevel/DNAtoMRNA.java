package EasyLevel;

public class DNAtoMRNA {
    // Prompt: Write a java class named DNAtoMRNA that  satisfies this requirement:
    // Transcribe the given DNA strand into corresponding mRNA
    // a type of RNA, that will be formed from DNA after transcription.
    // DNA has the bases A, T, G and C, while RNA converts to U, A, C and G respectively.
    // Example: Input: "ATCG" Output: "AUCG"
    public static String transcribeToMRNA(String dnaStrand) {
        StringBuilder mRNA = new StringBuilder();

        for (char base : dnaStrand.toCharArray()) {
            switch (base) {
                case 'A':
                    mRNA.append('U'); // Adenine in DNA becomes Uracil in RNA
                    break;
                case 'T':
                    mRNA.append('A'); // Thymine in DNA becomes Adenine in RNA
                    break;
                case 'G':
                    mRNA.append('C'); // Guanine in DNA becomes Cytosine in RNA
                    break;
                case 'C':
                    mRNA.append('G'); // Cytosine in DNA becomes Guanine in RNA
                    break;
                default:
                    throw new IllegalArgumentException("Invalid DNA base: " + base);
            }
        }

        return mRNA.toString();
    }

}

/*soluzione sbagliata
* public class DNAtoMRNA {
    // Prompt: Write a java class named DNAtoMRNA that  satisfies this requirement:
    // Transcribe the given DNA strand into corresponding mRNA
    // a type of RNA, that will be formed from DNA after transcription.
    // DNA has the bases A, T, G and C, while RNA converts to U, A, C and G respectively.
    // Example: Input: "ATCG" Output: "AUCG"

    public static void main(String[] args) {
        String dna = "ATCG";
        String mrna = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'T') {
                mrna += 'U';
            } else {
                mrna += dna.charAt(i);
            }
        }
        System.out.println(mrna);
    }

}*/
