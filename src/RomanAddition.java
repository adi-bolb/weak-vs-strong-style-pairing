public class RomanAddition {
    public String add(String term, String secondTerm){
        String expandFirst = expand(term);
        String expandSecond = expand(secondTerm);
        String total = combine(expandFirst, expandSecond);

        return reduce(total);
    }

    private String combine(String expandFirst, String expandSecond) {
        String[] symbols = {"V", "I"};

        String result = "";
        for (String symbol:symbols) {
            String withEmpty = "";
            String anythingBut = "[^" + symbol + "]";
            result += expandFirst.replaceAll(anythingBut, withEmpty);
            result += expandSecond.replaceAll(anythingBut, withEmpty);
        }
        return result;
    }

    private String expand(String term) {
        return term.replaceAll("IV", "IIII");
    }

    private String reduce(String total) {
        return total.replaceAll("IIIII", "V").replaceAll("IIII", "IV");
    }
}
