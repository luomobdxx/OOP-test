public class Appointment {
    String Name;
    String MobilePhone;
    String TimeSlot;
    HealthProfessionals hp;

    //default
    public Appointment() {
    }

    public Appointment(String Name, String MobilePhone, String TimeSlot, HealthProfessionals hp) {
        this.Name = Name;
        this.MobilePhone = MobilePhone;
        this.TimeSlot = TimeSlot;
        this.hp = hp;
    }

    public void getAppointment() {
        System.out.println("The appointment details are:");
        System.out.println("The name of the appointment is: " + Name);
        System.out.println("The mobile phone of the appointment is: "  + MobilePhone);
        System.out.println("The time slot of the appointment is: " + TimeSlot);
        hp.getProf();
    }
}
