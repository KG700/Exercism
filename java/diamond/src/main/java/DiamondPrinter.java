import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        final String letters = "ABCD";
        int dimension = letters.indexOf(a) * 2 + 1;
        int middle = dimension / 2;

        ArrayList<String> diamond = new ArrayList<>();

        String row = "";
        while (row.length() < dimension) row += " ";
        while (diamond.size() < dimension) diamond.add(row);

        for (int i = 0; i < middle + 1;  i++) {
            StringBuilder newRow = new StringBuilder(row);
            newRow.setCharAt(middle + i, letters.charAt(i));
            newRow.setCharAt(middle - i, letters.charAt(i));
            diamond.set(i, newRow.toString());
            diamond.set(dimension - i - 1, newRow.toString());
        }
        return diamond;
    }
}

