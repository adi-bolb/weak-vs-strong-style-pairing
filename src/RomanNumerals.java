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

    @Test
    public void addingIAndIShouldResultInII(){
        assertRomanAddition("I", "I", "II");
    }

    @Test
    public void addingIAndIIShouldResultInIII(){
        assertRomanAddition("I", "II", "III");
    }

    private void assertRomanAddition(String first, String plus, String equals) {
        String actual = new RomanAddition().add(first, plus);

        assertEquals(equals, actual);
    }

}
