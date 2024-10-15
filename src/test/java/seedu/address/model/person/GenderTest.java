package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.testutil.TestValues;


public class GenderTest {
    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Gender(null));
    }

    @Test
    public void constructor_invalidGender_throwsIllegalArgumentException() {
        String invalidGender = "";
        assertThrows(IllegalArgumentException.class, () -> new Gender(invalidGender));
    }

    @Test
    public void isValidGender() {
        //null Gender
        assertThrows(NullPointerException.class, () -> Gender.isValidGender(null));

        //invalid Gender
        assertFalse(Gender.isValidGender("")); // empty string
        assertFalse(Gender.isValidGender(" ")); // spaces only
        assertFalse(Gender.isValidGender("T")); // only invalid characters

        //valid Gender
        assertTrue(Gender.isValidGender("M")); // for Male
        assertTrue(Gender.isValidGender("F")); //for Female
        assertTrue(Gender.isValidGender("m")); //for lowercase representation
        assertTrue(Gender.isValidGender("f")); //for lowercase representation
    }

    @Test
    public void equals() {
        Gender gender = new Gender("M");

        // same values -> returns true
        assertTrue(gender.equals(new Gender("M")));

        // same values but lowercase -> returns true
        assertTrue(gender.equals(new Gender("m")));

        // same object -> returns true
        assertTrue(gender.equals(gender));

        // null -> returns false
        assertFalse(gender.equals(null));

        // different types -> returns false
        assertFalse(gender.equals(5.0f));

        // different values -> returns false
        assertFalse(gender.equals(new Gender("F")));
    }

    @Test
    public void parseGender_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Gender.parseGender((String) null));
    }

    @Test
    public void parseGender_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> Gender.parseGender(TestValues.INVALID_GENDER));
    }

    @Test
    public void parseGender_validValueWithoutWhitespace_returnsGender() throws Exception {
        Gender expectedGender = new Gender(TestValues.VALID_GENDER);
        assertEquals(expectedGender, Gender.parseGender(TestValues.VALID_GENDER));
    }

    @Test
    public void parseGender_validValueWithWhitespace_returnsTrimmedGender() throws Exception {
        String genderWithWhitespace = TestValues.WHITESPACE + TestValues.VALID_GENDER + TestValues.WHITESPACE;
        Gender expectedGender = new Gender(TestValues.VALID_GENDER);
        assertEquals(expectedGender, Gender.parseGender(genderWithWhitespace));
    }
}
