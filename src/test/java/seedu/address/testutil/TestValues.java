package seedu.address.testutil;

import static seedu.address.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ALLERGY;
import static seedu.address.logic.parser.CliSyntax.PREFIX_DATE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_DOB;
import static seedu.address.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.address.logic.parser.CliSyntax.PREFIX_GENDER;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MEDCON;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NRIC;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PRIORITY;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TIMEPERIOD;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import seedu.address.model.person.Person;
import seedu.address.storage.JsonAdaptedAllergy;
import seedu.address.storage.JsonAdaptedAppointment;
import seedu.address.storage.JsonAdaptedMedCon;

/**
 * Contains all the constant values used across the unit tests, to ensure consistency and prevent duplicate constants.
 */
public class TestValues {

    private static final String INVALID_MEDCON_EMPTY = "";
    private static final String INVALID_MEDCON_SPECIAL_CHARS = "@Diabetes";
    public static final String INVALID_ADDRESS = " ";
    public static final String INVALID_ALLERGY = "#friend";
    public static final String INVALID_APPOINTMENT_NAME = " ";

    public static final String INVALID_APPOINTMENTS = "yolo:today:0420";
    public static final String INVALID_APPOINTMENT_DATE_FORMAT = "2024/12/25";
    public static final String INVALID_APPOINTMENT_DATE_NONEXISTANT = "2024-15-32";
    public static final String INVALID_APPOINTMENT_TIMEPERIOD_FORMAT = "10:00-12:00";
    public static final String INVALID_APPOINTMENT_TIMEPERIOD_ORDER = "1500-1200";

    public static final String INVALID_DATE_OF_BIRTH_FORMAT = "2000-01-0";
    public static final String INVALID_DATE_OF_BIRTH_FUTURE_DATE = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    public static final String INVALID_DATE_OF_BIRTH_VALUE = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    public static final String INVALID_EMAIL = "example.com";
    public static final String INVALID_FILE_PATH = "UiPartTest/invalidFile.fxml";
    public static final String INVALID_GENDER = "X";
    public static final String INVALID_MEDCON = "Pneumonoultramicroscopicsilicovolcanoconiosisdeeznutz";
    public static final String INVALID_MEDCON_TOO_LONG = "ThisMedicalConditionNameIsWayTooLongAndExceedsThirtyCharacters";
    public static final String INVALID_NAME = "R@chel";
    public static final String INVALID_NRIC = "S123456";
    public static final String INVALID_PHONE = "+651234";
    public static final String INVALID_PRIORITY = "invalidPriority";

    public static final String VALID_ADDRESS = "123 Main Street #0505";
    public static final String VALID_ALLERGY_1 = "friend";
    public static final String VALID_ALLERGY_2 = "neighbour";
    public static final String VALID_ALLERGY_MILK = "milk";
    public static final String VALID_ALLERGY_SOYBEANS = "soybeans";
    public static final String VALID_APPOINTMENT_DATE_DENTAL = "2024-12-25";
    public static final String VALID_APPOINTMENT_DATE_PHYSIO = "2024-01-01";
    public static final String VALID_DOB = "2020-11-11";
    public static final String VALID_EMAIL = "rachel@example.com";
    public static final String VALID_FILE_PATH = "UiPartTest/validFile.fxml";
    public static final String VALID_FILE_WITH_FX_ROOT_PATH = "UiPartTest/validFileWithFxRoot.fxml";
    public static final String VALID_GENDER = "f";
    public static final String VALID_MEDCON = "Diabetes";
    public static final String VALID_NAME = "Rachel Walker";
    public static final String VALID_NRIC = "T0123456A";
    public static final String VALID_PHONE = "123456";
    public static final String VALID_PRIORITY = "HIGH";
    public static final String VALID_APPOINTMENT_NAME_DENTAL = "Dental";
    public static final String VALID_APPOINTMENT_NAME_PHYSIO = "Physio";
    public static final String VALID_APPOINTMENT_TIMEPERIOD_DENTAL = "1000-1200";
    public static final String VALID_APPOINTMENT_TIMEPERIOD_PHYSIO = "1235-1500";
    public static final String VALID_DATE_OF_BIRTH = "2000-12-23";
    public static final String ALLERGY_EMPTY = " " + PREFIX_ALLERGY;

    public static final String VALID_ADDRESS_AMY = "123 Main Street #0505";
    public static final String VALID_DOB_AMY = "2000-01-01";
    public static final String VALID_EMAIL_AMY = "amy@example.com";
    public static final String VALID_GENDER_AMY = "F";
    public static final String VALID_MEDCON_AMY = "Diabetes";
    public static final String VALID_NAME_AMY = "Amy Bee";
    public static final String VALID_NRIC_AMY = "S1234567A";
    public static final String VALID_PHONE_AMY = "11111111";
    public static final String VALID_PRIORITY_AMY = "HIGH";
    public static final String VALID_APPOINTMENT_DATE_AMY = VALID_APPOINTMENT_DATE_DENTAL;
    public static final String VALID_APPOINTMENT_NAME_AMY = VALID_APPOINTMENT_NAME_DENTAL;
    public static final String VALID_APPOINTMENT_TIMEPERIOD_AMY = VALID_APPOINTMENT_TIMEPERIOD_DENTAL;
    public static final String VALID_APPOINTMENT_AMY_SERIALISED = VALID_APPOINTMENT_NAME_AMY + ":"+ VALID_APPOINTMENT_DATE_AMY + ":"+ VALID_APPOINTMENT_TIMEPERIOD_AMY;
    public static final String VALID_DEL_APPT_AMY_DESC = " " + PREFIX_DATE + VALID_APPOINTMENT_DATE_AMY + " "+ PREFIX_TIMEPERIOD + VALID_APPOINTMENT_TIMEPERIOD_AMY;

    public static final String VALID_ADDRESS_BOB = "Block 123, Bobby Street 3";
    public static final String VALID_DOB_BOB = "2002-01-01";
    public static final String VALID_EMAIL_BOB = "bob@example.com";
    public static final String VALID_GENDER_BOB = "M";
    public static final String VALID_MEDCON_BOB = "Rabbies";
    public static final String VALID_NAME_BOB = "Bob Choo";
    public static final String VALID_NRIC_BOB = "T0234567A";
    public static final String VALID_PHONE_BOB = "22222222";
    public static final String VALID_PRIORITY_BOB = "LOW";
    public static final String VALID_APPOINTMENT_NAME_BOB = VALID_APPOINTMENT_NAME_PHYSIO;
    public static final String VALID_APPOINTMENT_DATE_BOB = VALID_APPOINTMENT_DATE_PHYSIO;
    public static final String VALID_APPOINTMENT_TIMEPERIOD_BOB = VALID_APPOINTMENT_TIMEPERIOD_PHYSIO;
    public static final String VALID_APPOINTMENT_BOB_SERIALISED = VALID_APPOINTMENT_NAME_BOB + ":"+ VALID_APPOINTMENT_DATE_BOB + ":"+ VALID_APPOINTMENT_TIMEPERIOD_BOB;

    public static final String ADDRESS_DESC_AMY = " " + PREFIX_ADDRESS + VALID_ADDRESS;
    public static final String ALLERGY_DESC_MILK = " " + PREFIX_ALLERGY + VALID_ALLERGY_MILK;
    public static final String ALLERGY_DESC_SOYBEANS = " " + PREFIX_ALLERGY + VALID_ALLERGY_SOYBEANS;
    public static final String APPOINTMENT_DESC_AMY = " " + VALID_APPOINTMENT_NAME_DENTAL + " " + PREFIX_DATE+ VALID_APPOINTMENT_DATE_DENTAL + " " + PREFIX_TIMEPERIOD+ VALID_APPOINTMENT_TIMEPERIOD_DENTAL;
    public static final String DOB_DESC_AMY = " " + PREFIX_DOB + VALID_DOB_AMY;
    public static final String EMAIL_DESC_AMY = " " + PREFIX_EMAIL + VALID_EMAIL_AMY;
    public static final String GENDER_DESC_AMY = " " + PREFIX_GENDER + VALID_GENDER_AMY;
    public static final String MEDCON_DESC_AMY = " " + PREFIX_MEDCON + VALID_MEDCON_AMY;
    public static final String NAME_DESC_AMY = " " + PREFIX_NAME + VALID_NAME_AMY;
    public static final String NRIC_DESC_AMY = " " + PREFIX_NRIC + VALID_NRIC_AMY;
    public static final String PHONE_DESC_AMY = " " + PREFIX_PHONE + VALID_PHONE_AMY;
    public static final String PRIORITY_DESC_AMY = " " + PREFIX_PRIORITY + VALID_PRIORITY_AMY;

    public static final String NRIC_DESC_BOB = " " + PREFIX_NRIC + VALID_NRIC_BOB;
    public static final String NAME_DESC_BOB = " " + PREFIX_NAME + VALID_NAME_BOB;
    public static final String ADDRESS_DESC_BOB = " " + PREFIX_ADDRESS + VALID_ADDRESS_BOB;
    public static final String APPOINTMENT_DESC_BOB = " " + VALID_APPOINTMENT_NAME_PHYSIO + " " + PREFIX_DATE+ VALID_APPOINTMENT_DATE_PHYSIO + " " + PREFIX_TIMEPERIOD+ VALID_APPOINTMENT_TIMEPERIOD_PHYSIO;
    public static final String DOB_DESC_BOB = " " + PREFIX_DOB + VALID_DOB_BOB;
    public static final String EMAIL_DESC_BOB = " " + PREFIX_EMAIL + VALID_EMAIL_BOB;
    public static final String GENDER_DESC_BOB = " " + PREFIX_GENDER + VALID_GENDER_BOB;
    public static final String MEDCON_DESC_BOB = " " + PREFIX_MEDCON + VALID_MEDCON_BOB;
    public static final String PHONE_DESC_BOB = " " + PREFIX_PHONE + VALID_PHONE_BOB;
    public static final String PRIORITY_DESC_BOB = " " + PREFIX_PRIORITY + VALID_PRIORITY_BOB;
    public static final String VALID_DEL_APPT_BOB_DESC = " " + PREFIX_DATE + VALID_APPOINTMENT_DATE_BOB + " "+ PREFIX_TIMEPERIOD + VALID_APPOINTMENT_TIMEPERIOD_BOB;

    public static final String INVALID_APPOINTMENT_TIMEPERIOD_ORDER_DESC = " " + VALID_APPOINTMENT_NAME_PHYSIO + " "+ PREFIX_DATE+ VALID_APPOINTMENT_DATE_PHYSIO + " "+ PREFIX_TIMEPERIOD+ INVALID_APPOINTMENT_TIMEPERIOD_ORDER;
    public static final String INVALID_APPOINTMENT_TIMEPERIOD_FORMAT_DESC = " " + VALID_APPOINTMENT_NAME_PHYSIO + " "+ PREFIX_DATE+ VALID_APPOINTMENT_DATE_PHYSIO + " "+ PREFIX_TIMEPERIOD+ INVALID_APPOINTMENT_TIMEPERIOD_FORMAT;
    public static final String INVALID_APPOINTMENT_NAME_DESC = " " + INVALID_APPOINTMENT_NAME + " " + PREFIX_DATE+ VALID_APPOINTMENT_DATE_PHYSIO + " "+ PREFIX_TIMEPERIOD+ VALID_APPOINTMENT_TIMEPERIOD_PHYSIO;
    public static final String INVALID_APPOINTMENT_DATE_NONEXISTANT_DESC = " " + VALID_APPOINTMENT_NAME_PHYSIO + " "+ PREFIX_DATE+ INVALID_APPOINTMENT_DATE_NONEXISTANT+ PREFIX_TIMEPERIOD+ VALID_APPOINTMENT_TIMEPERIOD_PHYSIO;
    public static final String INVALID_APPOINTMENT_DATE_FORMAT_DESC = " " + VALID_APPOINTMENT_NAME_PHYSIO + " "+ PREFIX_DATE + INVALID_APPOINTMENT_DATE_FORMAT+ PREFIX_TIMEPERIOD+ VALID_APPOINTMENT_TIMEPERIOD_PHYSIO;
    public static final String INVALID_ALLERGY_DESC = " " + PREFIX_ALLERGY + "shellfish*"; // '*' not allowed in tags
    public static final String INVALID_ADDRESS_DESC = " " + PREFIX_ADDRESS;// empty string not allowed for addresses
    public static final String INVALID_DEL_APPT_DATE_FORMAT_DESC = " " + PREFIX_DATE + INVALID_APPOINTMENT_DATE_FORMAT+ PREFIX_TIMEPERIOD+ VALID_APPOINTMENT_TIMEPERIOD_PHYSIO;
    public static final String INVALID_DEL_APPT_DATE_NONEXISTANT_DESC = " " + PREFIX_DATE+ INVALID_APPOINTMENT_DATE_NONEXISTANT + " "+ PREFIX_TIMEPERIOD+ VALID_APPOINTMENT_TIMEPERIOD_PHYSIO;
    public static final String INVALID_DEL_APPT_TIMEPERIOD_FORMAT_DESC = " " + PREFIX_DATE+ VALID_APPOINTMENT_DATE_PHYSIO + " "+ PREFIX_TIMEPERIOD+ INVALID_APPOINTMENT_TIMEPERIOD_FORMAT;
    public static final String INVALID_DEL_APPT_TIMEPERIOD_ORDER_DESC = " " + PREFIX_DATE+ VALID_APPOINTMENT_DATE_PHYSIO + " "+ PREFIX_TIMEPERIOD+ INVALID_APPOINTMENT_TIMEPERIOD_ORDER;
    public static final String INVALID_MEDCON_DESC = " " + PREFIX_MEDCON+ "Pneumonoultramicroscopicsilicovolcanoconiosisdeeznutz";// longer than 45 characters
    public static final String INVALID_DOB_FORMAT_DESC = " " + PREFIX_DOB + "2000/02/02"; // '/' not allowed in DOB
    public static final String INVALID_DOB_VALUE_DESC = " " + PREFIX_DOB+ LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));// DOB in future
    public static final String INVALID_EMAIL_DESC = " " + PREFIX_EMAIL + "bob!yahoo"; // missing '@' symbol
    public static final String INVALID_GENDER_DESC = " " + PREFIX_GENDER + "X"; // 'X' not allowed for gender
    public static final String INVALID_NAME_DESC = " " + PREFIX_NAME + "James&"; // '&' not allowed in names
    public static final String INVALID_NRIC_DESC = " " + PREFIX_NRIC + "S1234567"; // missing last character
    public static final String INVALID_PHONE_DESC = " " + PREFIX_PHONE + "911a"; // 'a' not allowed in phones
    public static final String INVALID_PRIORITY_DESC = " " + PREFIX_PRIORITY + "invalidPriority";// Only "NONE", "LOW", "MEDIUM" or "HIGH" is allowed for Priority

    public static final String INVALID_APPOINTMENT_DATE_FORMAT_SERIALISED = VALID_APPOINTMENT_NAME_PHYSIO + ":"+ INVALID_APPOINTMENT_DATE_FORMAT + ":"+ VALID_APPOINTMENT_TIMEPERIOD_PHYSIO;
    public static final String INVALID_APPOINTMENT_DATE_NONEXISTANT_SERIALISED = VALID_APPOINTMENT_NAME_PHYSIO + ":"+ INVALID_APPOINTMENT_DATE_NONEXISTANT + ":"+ VALID_APPOINTMENT_TIMEPERIOD_PHYSIO;
    public static final String INVALID_APPOINTMENT_NAME_SERIALISED = INVALID_APPOINTMENT_NAME + ":"+ VALID_APPOINTMENT_DATE_PHYSIO + ":"+ VALID_APPOINTMENT_TIMEPERIOD_PHYSIO;
    public static final String INVALID_APPOINTMENT_TIMEPERIOD_FORMAT_SERIALISED = VALID_APPOINTMENT_NAME_PHYSIO + ":"+ VALID_APPOINTMENT_DATE_PHYSIO + ":"+ INVALID_APPOINTMENT_TIMEPERIOD_FORMAT;
    public static final String INVALID_APPOINTMENT_TIMEPERIOD_ORDER_SERIALISED = VALID_APPOINTMENT_NAME_PHYSIO + ":"+ VALID_APPOINTMENT_DATE_PHYSIO + ":"+ INVALID_APPOINTMENT_TIMEPERIOD_ORDER;

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline").withNric("S1234567A").withDateOfBirth("2000-01-01").withGender("F").withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com").withPhone("94351253").withPriority("HIGH").withAppointments("Physio:2024-12-01:1500-1600", "Orthopedic:2024-12-01:1200-1300").withAllergies("Peanuts").build();
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY).withNric(VALID_NRIC_AMY).withDateOfBirth(VALID_DOB_AMY).withGender(VALID_GENDER_AMY).withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS).withPriority(VALID_PRIORITY_AMY).withMedCons(VALID_MEDCON).build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier").withNric("T0234547A").withDateOfBirth("2002-01-01").withGender("M").withAddress("311, Clementi Ave 2, #02-25").withEmail("johnd@example.com").withPhone("98765432").withPriority("HIGH").withAllergies("Peanuts", "Soybeans").withMedCons("Lung Cancer", "Diabetes").build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB).withNric(VALID_NRIC_BOB).withDateOfBirth(VALID_DOB_BOB).withGender(VALID_GENDER_BOB).withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withPriority(VALID_PRIORITY_BOB).build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563").withNric("S1234167F").withDateOfBirth("2000-01-05").withGender("M").withEmail("heinz@example.com").withAddress("wall street").withPriority("LOW").withMedCons("Arthritis", "Scoliosis", "Myopia").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533").withNric("T0234567B").withDateOfBirth("2005-01-01").withGender("M").withEmail("cornelia@example.com").withAddress("10th street").withAllergies("Peanuts").withPriority("LOW").withMedCons("Skin Cancer", "Diabetes").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224").withNric("T0234567F").withDateOfBirth("2001-01-01").withGender("F").withEmail("werner@example.com").withAddress("michegan ave").withPriority("MEDIUM").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427").withNric("S1234561A").withDateOfBirth("2000-01-01").withGender("F").withEmail("lydia@example.com").withAddress("little tokyo").withPriority("MEDIUM").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442").withNric("S1234565A").withDateOfBirth("2000-01-01").withGender("M").withEmail("anna@example.com").withAddress("4th street").withPriority("NONE").build();
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424").withNric("S1234568A").withDateOfBirth("2000-01-01").withGender("F").withEmail("stefan@example.com").withAddress("little india").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131").withNric("S1234567Z").withDateOfBirth("2000-01-01").withGender("F").withEmail("hans@example.com").withAddress("chicago ave").build();

    public static final List<JsonAdaptedAppointment> VALID_APPOINTMENTS = BENSON.getAppointments().stream().map(JsonAdaptedAppointment::new).collect(Collectors.toList());
    public static final List<JsonAdaptedMedCon> VALID_MEDCONS = AMY.getMedCons().stream().map(JsonAdaptedMedCon::new).collect(Collectors.toList());
    public static final List<JsonAdaptedAllergy> VALID_ALLERGIES = AMY.getAllergies().stream().map(JsonAdaptedAllergy::new).collect(Collectors.toList());


    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER
    public static final String WHITESPACE = " \t\r\n";
    public static final String JSON_STRING_REPRESENTATION = String.format("{%n"+ "  \"name\" : \"This is a test class\",%n"+ "  \"listOfLocalDateTimes\" : "+ "[ \"-999999999-01-01T00:00:00\", \"+999999999-12-31T23:59:59.999999999\", "+ "\"0001-01-01T01:01:00\" ],%n"+ "  \"mapOfIntegerToString\" : {%n"+ "    \"1\" : \"One\",%n"+ "    \"2\" : \"Two\",%n"+ "    \"3\" : \"Three\"%n"+ "  }%n" + "}");
    public static final String MISSING_FILE_PATH = "UiPartTest/missingFile.fxml";
    public static final String NAME_TEST_VALUE = "This is a test class";
    public static final String PREAMBLE_NON_EMPTY = "NonEmptyPreamble";
    public static final String PREAMBLE_WHITESPACE = "\t  \r  \n";
}
