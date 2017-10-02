import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumerals {

    // Traditional Style Pairing
    // The person at the keyboard will take decisions
    // The navigator will watch over


    // Kata
    // Program roman numeral addition, without allowing to
    // convert to numbers in between.

    // Observations about Traditional Pairing
    //
    // Navigator helps when:
    // * Driver makes mistake
    // * Driver can make things simpler
    //
    // It is quiet
    // It gets louder when we're stuck
    //
    // With remote paring is difficult to stay engaged
    // Changing typing is a good option, but it's harder to change
    //
    // The driver needs to explain what they are doing


    // Strong Style Pairing
    //
    // Talk in intention, then location, then details
    // Navigator will use the time while the Driver is doing something to
    // understand what to do next.
    // It's impossible for one of us not to be talking
    // Have the dialogue curtosey
    // The navigator can program much better in a pair than alone, because
    // not crashing between the low and the high level
    // Two situations: when the driver knows what to do, and when driver doesn't know what to do
    // You can always learn things while pairing
    // The navigator can learn a lot from the driver
    // It's OK to go down the wrong path
    // Confidence increased with often commits and good unit tests
    // Use comments when the intent is more complicated
    // Always have the intent clearly in your head, in "English"
    // The readability of the code is important
    // Ask for "trust" on short term when you are navigator and you are doing
    // weird things
    // When someone doesn't trust you, it doesn't matter how many logic you use
    // As a navigator in strong style time goes faster, because you are in a flow
    // The navigator is more engaged in strong style pairing
    // Domain knowledge increases dramatically when doing pairing



    @Test
    public void addingIAndIShouldResultInII(){
        assertRomanAddition("I", "I", "II");
    }

    @Test
    public void addingIAndIIShouldResultInIII(){
        assertRomanAddition("I", "II", "III");
    }

    @Test
    public void addingIIAndIIShouldResultInIV(){
        assertRomanAddition("II", "II", "IV");
    }

    @Test
    public void addingIIAndIIIShouldResultInV(){
        assertRomanAddition("II", "III", "V");
    }

    @Test
    public void addingIAndIVShouldResultInV(){
        assertRomanAddition("I", "IV", "V");
    }

    @Test
    public void addingIVAndIVShouldResultInVIII(){
        assertRomanAddition("IV", "IV", "VIII");
    }

    @Test
    public void addingVAndIIShouldResultInVII(){
        assertRomanAddition("V", "II", "VII");
    }




    private void assertRomanAddition(String first, String plus, String equals) {
        assertSingleAddition(first, plus, equals);

        assertSingleAddition(plus, first, equals);
    }

    private void assertSingleAddition(String first, String plus, String equals) {
        String actual = new RomanAddition().add(first, plus);
        String message = String.format("%s + %s = %s", first, plus, equals);
        assertEquals(message, equals, actual);
    }

}
