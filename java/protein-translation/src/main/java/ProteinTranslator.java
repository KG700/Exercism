import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        Hashtable<String, String> proteinMap = new Hashtable<String, String>();
        proteinMap.put("UGU", "Cysteine");
        proteinMap.put("UGC", "Cysteine");
        proteinMap.put("UUA", "Leucine");
        proteinMap.put("UUG", "Leucine");
        proteinMap.put("AUG", "Methionine");
        proteinMap.put("UUU", "Phenylalanine");
        proteinMap.put("UUC", "Phenylalanine");
        proteinMap.put("UCU", "Serine");
        proteinMap.put("UCC", "Serine");
        proteinMap.put("UCA", "Serine");
        proteinMap.put("UCG", "Serine");
        proteinMap.put("UAU", "Tyrosine");
        proteinMap.put("UAC", "Tyrosine");
        proteinMap.put("UGG", "Tryptophan");

        if (proteinMap.containsKey(rnaSequence)) return Arrays.asList(proteinMap.get(rnaSequence));
        return Arrays.asList();
    }
}
