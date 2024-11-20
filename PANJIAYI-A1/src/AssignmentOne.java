import java.util.ArrayList;

public class AssignmentOne {


    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        GeneralPractitioners gp1 = new GeneralPractitioners(202401, "Dr.Kelvin", "from China", "dentist");
        GeneralPractitioners gp2 = new GeneralPractitioners(202402, "Dr.Eddie", "from Japan", "dentist");
        GeneralPractitioners gp3 = new GeneralPractitioners(202403, "Dr.Cathy", "from Korea", "dentist");
        NutritionProfessionals s1 = new NutritionProfessionals(202404, "Dr.Johnny", "married", "Daily diet");
        NutritionProfessionals s2 = new NutritionProfessionals(202405, "Dr.Oliver", "internship", "Rehabilitation diet");
        gp1.getProf();
        gp2.getProf();
        gp3.getProf();
        s1.getProf();
        s2.getProf();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();
        createAppointment(appointments, "xiaoming", "13807661234", "08:30", gp1);
        createAppointment(appointments, "xiaobai", "13807661235", "09:30", gp2);
        createAppointment(appointments, "xiaozhang", "13807661236", "10:30", s1);
        createAppointment(appointments, "xiaochen", "13807661237", "11:30", s2);

        printExistingAppointments(appointments);

        cancelBooking(appointments, "13807661238");

        cancelBooking(appointments, "13807661234");

        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    public static void createAppointment(ArrayList<Appointment> appointments, String name, String mobilePhone, String timeSlot, HealthProfessionals hp) {
        Appointment current = new Appointment(name, mobilePhone, timeSlot, hp);
        appointments.add(current);
    }

    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if(appointments.isEmpty()) {
            System.out.println("there is not appointment so far..");
            return;
        }
        for(Appointment each : appointments) {
            each.getAppointment();
        }
    }

    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        for(int i = 0; i < appointments.size(); i++) {
            if(mobilePhone.equals(appointments.get(i).MobilePhone)) {
                appointments.remove(i);
                return;
            }
        }
        System.out.println("can not find out this appointment..");
    }
}
