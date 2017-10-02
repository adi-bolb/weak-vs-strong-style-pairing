public class RomanAddition {
    public String add(String term, String secondTerm){
        String expandFirst = expand(term);
        String expandSecond = expand(secondTerm);
        String total = combine(expandFirst, expandSecond);

        return reduce(total);
    }

    private String combine(String expandFirst, String expandSecond) {
        // Add the V's
        // Add the I's

        String result = "";
        result += expandFirst.replaceAll("[^V]", "");
        result += expandSecond.replaceAll("[^V]", "");
        result += expandFirst.replaceAll("[^I]", "");
        result += expandSecond.replaceAll("[^I]", "");
        return result;
    }

    private String expand(String term) {
        return term.replaceAll("IV", "IIII");
    }

    private String reduce(String total) {
        return total.replaceAll("IIIII", "V").replaceAll("IIII", "IV");
    }
}
