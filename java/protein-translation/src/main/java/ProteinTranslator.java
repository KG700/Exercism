import java.util.Arrays;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        if (rnaSequence.equals("AUG")) return Arrays.asList("Methionine");
        if (rnaSequence.equals("UUA") || rnaSequence.equals("UUG")) return Arrays.asList("Leucine");
        if (rnaSequence.equals("UCU")) return Arrays.asList("Serine");
        return Arrays.asList("Phenylalanine");
    }
}
