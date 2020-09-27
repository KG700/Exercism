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

        String codon;
        List<String> proteins = new ArrayList<String>();
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            codon = rnaSequence.substring(i, i + 3);
            if (codon.equals("UAG")) break;
            if (proteinMap.containsKey(codon)) {
                proteins.add(proteinMap.get(codon));
            };
        }

        return proteins;
    }
}
