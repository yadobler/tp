package seedu.address.model.person;

import java.util.Optional;
import java.util.function.Predicate;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.model.appointment.Appointment;

/**
 * Tests that a {@code Person} has a valid {@code Appointment} given the date and time period.
 */
public class AppointmentExistsPredicate implements Predicate<Person> {


    private final String date;
    private final String timePeriod;
    private Optional<Appointment> apptMatch;

    /**
     * Creates a NricMatchesPredicate to test if a person's NRIC matches the given NRIC.
     *
     * @param date date of the appointment to find.
     * @param timePeriod time period of the appointment to find.
     */
    public AppointmentExistsPredicate(String date, String timePeriod) {
        this.date = date;
        this.timePeriod = timePeriod;
        this.apptMatch = Optional.empty();
    }

    @Override
    public boolean test(Person person) {
        apptMatch = person.getAppointments()
                          .stream()
                          .filter(x -> x.getAppointmentDate().equals(date))
                          .filter(x -> x.getAppointmentTimePeriod().equals(timePeriod))
                          .findFirst();
        return apptMatch.isPresent();
    }

    public Optional<Appointment> getApptMatch(Person personToSearch) {
        if (apptMatch.isEmpty()) {
            test(personToSearch);
        }
        return apptMatch;
    }


    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof AppointmentExistsPredicate predicate)) {
            return false;
        }

        return date.equals(predicate.date) && timePeriod.equals(predicate.timePeriod);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).add("date", this.date).add("time period", this.timePeriod).toString();
    }
}