package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.allergy.Allergy;
import seedu.address.model.appointment.Appointment;
import seedu.address.model.person.Address;
import seedu.address.model.person.DateOfBirth;
import seedu.address.model.person.Email;
import seedu.address.model.person.Gender;
import seedu.address.model.person.MedCon;
import seedu.address.model.person.Name;
import seedu.address.model.person.Nric;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Priority;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Person objects.
 */
public class PersonBuilder {

    private Name name;
    private Nric nric;
    private DateOfBirth dob;
    private Gender gender;
    private Phone phone;
    private Email email;
    private Address address;
    private Set<Allergy> tags;
    private Priority priority;
    private Set<Appointment> appointments;
    private Set<MedCon> medCons;

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public PersonBuilder() {
        name = new Name(TestValues.VALID_NAME_AMY);
        nric = new Nric(TestValues.VALID_NRIC_AMY);
        dob = new DateOfBirth(TestValues.VALID_DOB_AMY);
        gender = new Gender(TestValues.VALID_GENDER_AMY);
        phone = new Phone(TestValues.VALID_PHONE_AMY);
        email = new Email(TestValues.VALID_EMAIL_AMY);
        address = new Address(TestValues.VALID_ADDRESS_AMY);
        tags = new HashSet<>();
        priority = new Priority(TestValues.VALID_PRIORITY_AMY);
        appointments = new HashSet<>();
        medCons = new HashSet<>();
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public PersonBuilder(Person personToCopy) {
        name = personToCopy.getName();
        nric = personToCopy.getNric();
        dob = personToCopy.getDateOfBirth();
        gender = personToCopy.getGender();
        phone = personToCopy.getPhone();
        email = personToCopy.getEmail();
        address = personToCopy.getAddress();
        tags = new HashSet<>(personToCopy.getAllergies());
        priority = personToCopy.getPriority();
        appointments = new HashSet<>(personToCopy.getAppointments());
        medCons = new HashSet<>(personToCopy.getMedCons());
    }

    /**
     * Resets the parameters of properties that cannot be added to {@code Person}.
     */
    public PersonBuilder withoutExtraProperties() {
        this.medCons = new HashSet<>();
        this.priority = new Priority();
        this.appointments = new HashSet<>();
        return this;
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public PersonBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code appointments} into a {@code Set<Appointment>} and set it to the {@code Person} that we are
     * building.
     */
    public PersonBuilder withAppointments(String ... appointments) {
        this.appointments = SampleDataUtil.getAppointmentSet(appointments);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Person} that we are building.
     */
    public PersonBuilder withAllergies(String ... tags) {
        this.tags = SampleDataUtil.getAllergiesSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Person} that we are building.
     */
    public PersonBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Person} that we are building.
     */
    public PersonBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Person} that we are building.
     */
    public PersonBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    /**
     * Sets the {@code Nric} of the {@code Person} that we are building.
     */
    public PersonBuilder withNric(String nric) {
        this.nric = new Nric(nric);
        return this;
    }

    /**
     * Sets the {@code DateOfBirth} of the {@code Person} that we are building.
     */
    public PersonBuilder withDateOfBirth(String dob) {
        this.dob = new DateOfBirth(dob);
        return this;
    }

    /**
     * Sets the {@code Gender} of the {@code Person} that we are building.
     */
    public PersonBuilder withGender(String gender) {
        this.gender = new Gender(gender);
        return this;
    }

    /**
     * Sets the {@code medCons} of the {@code Person} that we are building.
     */
    public PersonBuilder withMedCons(String ... medCons) {
        this.medCons = SampleDataUtil.getMedConSet(medCons);
        return this;
    }

    /**
     * Sets the {@code Priority} of the {@code Person} that we are building.
     */
    public PersonBuilder withPriority(String priority) {
        this.priority = new Priority(priority);
        return this;
    }

    /**
     * Builds and returns a {@code Person} object with the current attributes set in this builder.
     *
     * @return A {@code Person} object with the current state of this builder.
     */
    public Person build() {
        return new Person(name, phone, email, nric, address, dob, gender, tags, priority, appointments, medCons);
    }

}
