import java.time.*;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, DateTimeFormatter.ofPattern("M/dd/yyyy HH:mm:ss"));
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now(Clock.systemDefaultZone()));
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.isAfter(appointmentDate.withHour(11).withMinute(59)) &&
                appointmentDate.isBefore(appointmentDate.withHour(18).withMinute(0));
    }

    public String getDescription(LocalDateTime appointmentDate) {
        LocalDate localDate = appointmentDate.toLocalDate();
        LocalTime localTime = appointmentDate.toLocalTime();

        String date = localDate.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy,"));
        String time = localTime.format(DateTimeFormatter.ofPattern("h:mm a."));

        return "You have an appointment on " + date + " at " + time;
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(Year.now(Clock.systemDefaultZone()).getValue(), Month.SEPTEMBER, 15);
    }
}
