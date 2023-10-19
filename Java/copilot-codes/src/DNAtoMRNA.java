public class DNAtoMRNA {
    // Prompt: Write a java class named DNAtoMRNA that  satisfies this requirement:
    // Transcribe the given DNA strand into corresponding mRNA
    // a type of RNA, that will be formed from DNA after transcription.
    // DNA has the bases A, T, G and C, while RNA converts to U, A, C and G respectively.
    // Example: Input: "ATCG" Output: "AUCG"
    public static String transcribe(String s) {
        StringBuilder mRNA = new StringBuilder();

        for (char base : s.toCharArray()) {
            switch (base) {
                case 'A':
                    mRNA.append('U');
                    break;
                case 'T':
                    mRNA.append('A');
                    break;
                case 'G':
                    mRNA.append('C');
                    break;
                case 'C':
                    mRNA.append('G');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid DNA base: " + base);
            }
        }
        return mRNA.toString();
    }

}
/*soluzione sbalgiata
* public class DNAtoMRNA {
// Prompt : Write a java class named DNAtoMRNA that
satisfies this requirement :
// Transcribe the given DNA strand into corresponding
mRNA
// a type of RNA , that will be formed from DNA after
transcription .
// DNA has the bases A , T , G and C , while RNA converts
to U , A , C and G respectively .
// Example : Input : " ATCG " Output : " AUCG "
public static String transcribe ( String dna ) {
String rna = dna . replace ( ’T ’ , ’U ’) ;
return rna ;
}
}*/

