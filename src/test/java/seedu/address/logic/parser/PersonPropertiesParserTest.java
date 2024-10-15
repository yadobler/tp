package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.Address;
import seedu.address.model.person.DateOfBirth;
import seedu.address.model.person.Email;
import seedu.address.model.person.Gender;
import seedu.address.model.person.Name;
import seedu.address.model.person.Nric;
import seedu.address.model.person.Phone;
import seedu.address.model.tag.Tag;
import seedu.address.testutil.TestValues;

public class PersonPropertiesParserTest {

    @Test
    public void parseName_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Name.parseName((String) null));
    }

    @Test
    public void parseName_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> Name.parseName(TestValues.INVALID_NAME));
    }

    @Test
    public void parseName_validValueWithoutWhitespace_returnsName() throws Exception {
        Name expectedName = new Name(TestValues.VALID_NAME);
        assertEquals(expectedName, Name.parseName(TestValues.VALID_NAME));
    }

    @Test
    public void parseName_validValueWithWhitespace_returnsTrimmedName() throws Exception {
        String nameWithWhitespace = TestValues.WHITESPACE + TestValues.VALID_NAME + TestValues.WHITESPACE;
        Name expectedName = new Name(TestValues.VALID_NAME);
        assertEquals(expectedName, Name.parseName(nameWithWhitespace));
    }

    @Test
    public void parsePhone_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Phone.parsePhone((String) null));
    }

    @Test
    public void parsePhone_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> Phone.parsePhone(TestValues.INVALID_PHONE));
    }

    @Test
    public void parsePhone_validValueWithoutWhitespace_returnsPhone() throws Exception {
        Phone expectedPhone = new Phone(TestValues.VALID_PHONE);
        assertEquals(expectedPhone, Phone.parsePhone(TestValues.VALID_PHONE));
    }

    @Test
    public void parsePhone_validValueWithWhitespace_returnsTrimmedPhone() throws Exception {
        String phoneWithWhitespace = TestValues.WHITESPACE + TestValues.VALID_PHONE + TestValues.WHITESPACE;
        Phone expectedPhone = new Phone(TestValues.VALID_PHONE);
        assertEquals(expectedPhone, Phone.parsePhone(phoneWithWhitespace));
    }

    @Test
    public void parseAddress_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Address.parseAddress((String) null));
    }

    @Test
    public void parseAddress_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> Address.parseAddress(TestValues.INVALID_ADDRESS));
    }

    @Test
    public void parseAddress_validValueWithoutWhitespace_returnsAddress() throws Exception {
        Address expectedAddress = new Address(TestValues.VALID_ADDRESS);
        assertEquals(expectedAddress, Address.parseAddress(TestValues.VALID_ADDRESS));
    }

    @Test
    public void parseAddress_validValueWithWhitespace_returnsTrimmedAddress() throws Exception {
        String addressWithWhitespace = TestValues.WHITESPACE + TestValues.VALID_ADDRESS + TestValues.WHITESPACE;
        Address expectedAddress = new Address(TestValues.VALID_ADDRESS);
        assertEquals(expectedAddress, Address.parseAddress(addressWithWhitespace));
    }

    @Test
    public void parseNric_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Nric.parseNric((String) null));
    }

    @Test
    public void parseNric_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> Nric.parseNric(TestValues.INVALID_NRIC));
    }

    @Test
    public void parseNric_validValueWithoutWhitespace_returnsNric() throws Exception {
        Nric expectedNric = new Nric(TestValues.VALID_NRIC);
        assertEquals(expectedNric, Nric.parseNric(TestValues.VALID_NRIC));
    }

    @Test
    public void parseNric_validValueWithWhitespace_returnsTrimmedNric() throws Exception {
        String nricWithWhitespace = TestValues.WHITESPACE + TestValues.VALID_NRIC + TestValues.WHITESPACE;
        Nric expectedNric = new Nric(TestValues.VALID_NRIC);
        assertEquals(expectedNric, Nric.parseNric(nricWithWhitespace));
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

    @Test
    public void parseDateOfBirth_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> DateOfBirth.parseDateOfBirth((String) null));
    }

    @Test
    public void parseDateOfBirth_invalidFormat_throwsParseException() {
        assertThrows(ParseException.class, () -> DateOfBirth.parseDateOfBirth(
                TestValues.INVALID_DATE_OF_BIRTH_FORMAT));
    }

    @Test
    public void parseDateOfBirth_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> DateOfBirth.parseDateOfBirth(TestValues.INVALID_DATE_OF_BIRTH_VALUE));
    }

    @Test
    public void parseDateOfBirth_validValueWithoutWhitespace_returnsDateOfBirth() throws Exception {
        DateOfBirth expectedDateOfBirth = new DateOfBirth(TestValues.VALID_DOB);
        assertEquals(expectedDateOfBirth, DateOfBirth.parseDateOfBirth(TestValues.VALID_DOB));
    }

    @Test
    public void parseDateOfBirth_validValueWithWhitespace_returnsTrimmedDateOfBirth() throws Exception {
        String dobWithWhitespace = TestValues.WHITESPACE + TestValues.VALID_DOB + TestValues.WHITESPACE;
        DateOfBirth expectedDateOfBirth = new DateOfBirth(TestValues.VALID_DOB);
        assertEquals(expectedDateOfBirth, DateOfBirth.parseDateOfBirth(dobWithWhitespace));
    }

    @Test
    public void parseEmail_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Email.parseEmail((String) null));
    }

    @Test
    public void parseEmail_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> Email.parseEmail(TestValues.INVALID_EMAIL));
    }

    @Test
    public void parseEmail_validValueWithoutWhitespace_returnsEmail() throws Exception {
        Email expectedEmail = new Email(TestValues.VALID_EMAIL);
        assertEquals(expectedEmail, Email.parseEmail(TestValues.VALID_EMAIL));
    }

    @Test
    public void parseEmail_validValueWithWhitespace_returnsTrimmedEmail() throws Exception {
        String emailWithWhitespace = TestValues.WHITESPACE + TestValues.VALID_EMAIL + TestValues.WHITESPACE;
        Email expectedEmail = new Email(TestValues.VALID_EMAIL);
        assertEquals(expectedEmail, Email.parseEmail(emailWithWhitespace));
    }

    @Test
    public void parseTag_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Tag.parseTag(null));
    }

    @Test
    public void parseTag_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> Tag.parseTag(TestValues.INVALID_TAG));
    }

    @Test
    public void parseTag_validValueWithoutWhitespace_returnsTag() throws Exception {
        Tag expectedTag = new Tag(TestValues.VALID_TAG_1);
        assertEquals(expectedTag, Tag.parseTag(TestValues.VALID_TAG_1));
    }

    @Test
    public void parseTag_validValueWithWhitespace_returnsTrimmedTag() throws Exception {
        String tagWithWhitespace = TestValues.WHITESPACE + TestValues.VALID_TAG_1 + TestValues.WHITESPACE;
        Tag expectedTag = new Tag(TestValues.VALID_TAG_1);
        assertEquals(expectedTag, Tag.parseTag(tagWithWhitespace));
    }

    @Test
    public void parseTags_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Tag.parseTags(null));
    }

    @Test
    public void parseTags_collectionWithInvalidTags_throwsParseException() {
        assertThrows(ParseException.class, () -> Tag.parseTags(Arrays.asList(TestValues.VALID_TAG_1,
                                                                             TestValues.INVALID_TAG)));
    }

    @Test
    public void parseTags_emptyCollection_returnsEmptySet() throws Exception {
        assertTrue(Tag.parseTags(Collections.emptyList()).isEmpty());
    }

    @Test
    public void parseTags_collectionWithValidTags_returnsTagSet() throws Exception {
        Set<Tag> actualTagSet = Tag.parseTags(Arrays.asList(TestValues.VALID_TAG_1, TestValues.VALID_TAG_2));
        Set<Tag> expectedTagSet = new HashSet<Tag>(Arrays.asList(new Tag(TestValues.VALID_TAG_1), new Tag(
                TestValues.VALID_TAG_2)));

        assertEquals(expectedTagSet, actualTagSet);
    }
}
