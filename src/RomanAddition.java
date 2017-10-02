public class RomanAddition {
    public String add(String term, String secondTerm){
        String total = expand(term) + expand(secondTerm);

        return reduce(total);
    }

    private String expand(String term) {
        return term.replaceAll("IV", "IIII");
    }

    private String reduce(String total) {
        return total.replaceAll("IIIII", "V").replaceAll("IIII", "IV");
    }
}
