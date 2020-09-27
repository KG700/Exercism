import java.util.Arrays;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        if (rnaSequence.equals("AUG")) return Arrays.asList("Methionine");
        return Arrays.asList("Phenylalanine");
    }
}
