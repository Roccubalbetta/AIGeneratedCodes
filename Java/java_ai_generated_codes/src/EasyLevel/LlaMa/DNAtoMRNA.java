package EasyLevel.LlaMa;

public class DNAtoMRNA {
    public static String transcribe(String dna) {
        String rna = dna.replace('T', 'U');
        return rna;
    }
}

/*SBAGLIATA*/

/*CORETTA
* StringBuilder mRNA = new StringBuilder();

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
 * */
