import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        if (rnaSequence.equals("AUG")) return Arrays.asList("Methionine");
        if (rnaSequence.equals("UUA") || rnaSequence.equals("UUG")) return Arrays.asList("Leucine");
        if (rnaSequence.equals("UCU") || rnaSequence.equals("UCC") || rnaSequence.equals("UCA") || rnaSequence.equals("UCG")) return Arrays.asList("Serine");
        if (rnaSequence.equals("UAU") || rnaSequence.equals("UAC")) return Arrays.asList("Tyrosine");
        if (rnaSequence.equals("UGU") || rnaSequence.equals("UGC")) return Arrays.asList("Cysteine");
        return Arrays.asList("Phenylalanine");
    }
}
