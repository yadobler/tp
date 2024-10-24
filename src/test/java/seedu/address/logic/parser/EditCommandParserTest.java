package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.commands.CommandTestUtil.ADDRESS_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.ADDRESS_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.ALLERGY_DESC_MILK;
import static seedu.address.logic.commands.CommandTestUtil.ALLERGY_DESC_SOYBEANS;
import static seedu.address.logic.commands.CommandTestUtil.EMAIL_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.EMAIL_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_ADDRESS_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_ALLERGY_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_EMAIL_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_NAME_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_PHONE_DESC;
import static seedu.address.logic.commands.CommandTestUtil.NAME_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.PHONE_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.PHONE_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ALLERGY_MILK;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ALLERGY_SOYBEANS;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NRIC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ALLERGY;
import static seedu.address.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalPersons.ALICE;

import org.junit.jupiter.api.Test;

import seedu.address.logic.Messages;
import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.commands.EditCommand.EditPersonDescriptor;
import seedu.address.model.allergy.Allergy;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Nric;
import seedu.address.model.person.NricMatchesPredicate;
import seedu.address.model.person.Phone;
import seedu.address.testutil.EditPersonDescriptorBuilder;

public class EditCommandParserTest {

    private static final String ALLERGY_EMPTY = " " + PREFIX_ALLERGY;

    private static final String MESSAGE_INVALID_FORMAT =
            String.format(MESSAGE_INVALID_COMMAND_FORMAT, EditCommand.MESSAGE_USAGE);

    private static final Nric nric = new Nric("T1234567A");

    private static final EditCommandParser parser = new EditCommandParser();

    @Test
    public void parse_missingParts_failure() {

        String expectedMessage = String.format(MESSAGE_INVALID_COMMAND_FORMAT, EditCommand.MESSAGE_USAGE);
        // no field specified
        assertParseFailure(parser, VALID_NRIC_AMY , EditCommand.MESSAGE_NOT_EDITED);

        // no nric and no field specified
        assertParseFailure(parser, "", expectedMessage);
    }

    @Test
    public void parse_invalidPreamble_failure() {
        // negative index
        assertParseFailure(parser, "-5" + NAME_DESC_AMY, MESSAGE_INVALID_FORMAT);

        // zero index
        assertParseFailure(parser, "0" + NAME_DESC_AMY, MESSAGE_INVALID_FORMAT);

        // invalid arguments being parsed as preamble
        assertParseFailure(parser, "1 some random string", MESSAGE_INVALID_FORMAT);

        // invalid prefix being parsed as preamble
        assertParseFailure(parser, "1 l/ string", MESSAGE_INVALID_FORMAT);
    }

    @Test
    public void parse_invalidValue_failure() {
        // invalid name
        assertParseFailure(parser, VALID_NRIC_AMY + INVALID_NAME_DESC, Name.MESSAGE_CONSTRAINTS);
        // invalid phone
        assertParseFailure(parser, VALID_NRIC_AMY + INVALID_PHONE_DESC, Phone.MESSAGE_CONSTRAINTS);
        // invalid email
        assertParseFailure(parser, VALID_NRIC_AMY + INVALID_EMAIL_DESC, Email.MESSAGE_CONSTRAINTS);
        // invalid address
        assertParseFailure(parser, VALID_NRIC_AMY + INVALID_ADDRESS_DESC, Address.MESSAGE_CONSTRAINTS);
        // invalid allergy
        assertParseFailure(parser, VALID_NRIC_AMY + INVALID_ALLERGY_DESC, Allergy.MESSAGE_CONSTRAINTS);
        // invalid phone followed by valid email
        assertParseFailure(parser, VALID_NRIC_AMY + INVALID_PHONE_DESC
                + EMAIL_DESC_AMY, Phone.MESSAGE_CONSTRAINTS);

        // while parsing {@code PREFIX_ALLERGY} alone will reset the tags of the {@code Person} being edited,
        // parsing it together with a valid allergy results in error
        assertParseFailure(parser, VALID_NRIC_AMY + ALLERGY_DESC_MILK + ALLERGY_DESC_SOYBEANS
                + ALLERGY_EMPTY, Allergy.MESSAGE_CONSTRAINTS);
        assertParseFailure(parser, VALID_NRIC_AMY + ALLERGY_DESC_MILK + ALLERGY_EMPTY
                + ALLERGY_DESC_SOYBEANS, Allergy.MESSAGE_CONSTRAINTS);
        assertParseFailure(parser, VALID_NRIC_AMY + ALLERGY_EMPTY + ALLERGY_DESC_MILK
                + ALLERGY_DESC_SOYBEANS, Allergy.MESSAGE_CONSTRAINTS);

        // multiple invalid values, but only the first invalid value is captured
        assertParseFailure(parser, VALID_NRIC_AMY + INVALID_NAME_DESC + INVALID_EMAIL_DESC
                        + VALID_ADDRESS_AMY + VALID_PHONE_AMY, Name.MESSAGE_CONSTRAINTS);
    }

    @Test
    public void parse_allFieldsSpecified_success() {
        String userInput = VALID_NRIC_AMY + PHONE_DESC_BOB + ALLERGY_DESC_SOYBEANS
                + EMAIL_DESC_AMY + ADDRESS_DESC_AMY + NAME_DESC_AMY + ALLERGY_DESC_MILK;

        EditPersonDescriptor descriptor = new EditPersonDescriptorBuilder().withName(VALID_NAME_AMY)
                .withPhone(VALID_PHONE_BOB).withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY)
                .withTags(VALID_ALLERGY_SOYBEANS, VALID_ALLERGY_MILK).build();
        EditCommand expectedCommand = new EditCommand(new NricMatchesPredicate(new Nric(VALID_NRIC_AMY)), descriptor);

        assertParseSuccess(parser, userInput, expectedCommand);
    }

    @Test
    public void parse_someFieldsSpecified_success() {
        String userInput = VALID_NRIC_AMY + PHONE_DESC_BOB + EMAIL_DESC_BOB;

        EditPersonDescriptor descriptor = new EditPersonDescriptorBuilder().withPhone(VALID_PHONE_BOB)
                .withEmail(VALID_EMAIL_BOB).build();
        EditCommand expectedCommand = new EditCommand(new NricMatchesPredicate(new Nric(VALID_NRIC_AMY)), descriptor);

        assertParseSuccess(parser, userInput, expectedCommand);
    }

    @Test
    public void parse_oneFieldSpecified_success() {
        // name
        Nric nric = new Nric(ALICE.getNric().value);
        String userInput = nric + NAME_DESC_AMY;
        EditPersonDescriptor descriptor = new EditPersonDescriptorBuilder().withName(VALID_NAME_AMY).build();
        EditCommand expectedCommand = new EditCommand(new NricMatchesPredicate(nric), descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);

        // phone
        userInput = nric + PHONE_DESC_AMY;
        descriptor = new EditPersonDescriptorBuilder().withPhone(VALID_PHONE_AMY).build();
        expectedCommand = new EditCommand(new NricMatchesPredicate(nric), descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);

        // email
        userInput = nric + EMAIL_DESC_AMY;
        descriptor = new EditPersonDescriptorBuilder().withEmail(VALID_EMAIL_AMY).build();
        expectedCommand = new EditCommand(new NricMatchesPredicate(nric), descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);

        // address
        userInput = nric + ADDRESS_DESC_AMY;
        descriptor = new EditPersonDescriptorBuilder().withAddress(VALID_ADDRESS_AMY).build();
        expectedCommand = new EditCommand(new NricMatchesPredicate(nric), descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);

        // tags
        userInput = nric + ALLERGY_DESC_MILK;
        descriptor = new EditPersonDescriptorBuilder().withTags(VALID_ALLERGY_MILK).build();
        expectedCommand = new EditCommand(new NricMatchesPredicate(nric), descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);
    }

    @Test
    public void parse_multipleRepeatedFields_failure() {
        // More extensive testing of duplicate parameter detections is done in
        // AddCommandParserTest#parse_repeatedNonTagValue_failure()

        // valid followed by invalid
        Nric nric = new Nric(ALICE.getNric().value);
        String userInput = nric + INVALID_PHONE_DESC + PHONE_DESC_BOB;

        assertParseFailure(parser, userInput, Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE));

        // invalid followed by valid
        userInput = nric + PHONE_DESC_BOB + INVALID_PHONE_DESC;

        assertParseFailure(parser, userInput, Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE));

        // mulltiple valid fields repeated
        userInput = nric + PHONE_DESC_AMY + ADDRESS_DESC_AMY + EMAIL_DESC_AMY
                + ALLERGY_DESC_MILK + PHONE_DESC_AMY + ADDRESS_DESC_AMY + EMAIL_DESC_AMY + ALLERGY_DESC_MILK
                + PHONE_DESC_BOB + ADDRESS_DESC_BOB + EMAIL_DESC_BOB + ALLERGY_DESC_SOYBEANS;

        assertParseFailure(parser, userInput,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE, PREFIX_EMAIL, PREFIX_ADDRESS));

        // multiple invalid values
        userInput = nric + INVALID_PHONE_DESC + INVALID_ADDRESS_DESC + INVALID_EMAIL_DESC
                + INVALID_PHONE_DESC + INVALID_ADDRESS_DESC + INVALID_EMAIL_DESC;

        assertParseFailure(parser, userInput,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE, PREFIX_EMAIL, PREFIX_ADDRESS));
    }

    @Test
    public void parse_resetTags_success() {
        Nric nric = new Nric(ALICE.getNric().value);
        String userInput = nric + ALLERGY_EMPTY;

        EditPersonDescriptor descriptor = new EditPersonDescriptorBuilder().withTags().build();
        EditCommand expectedCommand = new EditCommand(new NricMatchesPredicate(nric), descriptor);

        assertParseSuccess(parser, userInput, expectedCommand);
    }
}
