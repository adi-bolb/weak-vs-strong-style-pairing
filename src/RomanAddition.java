public class RomanAddition {
    public String add(String term, String secondTerm){
        String total = term + secondTerm;
        return total.replaceAll("IIII", "IV");
    }
}
