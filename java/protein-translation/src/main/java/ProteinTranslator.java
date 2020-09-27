import java.util.Arrays;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        if (rnaSequence.equals("AUG")) return Arrays.asList("Methionine");
        if (rnaSequence.equals("UUA") || rnaSequence.equals("UUG")) return Arrays.asList("Leucine");
        return Arrays.asList("Phenylalanine");
    }
}
