import java.util.ArrayList;

public class HealthProfessional {
    private int ID;
    private String Name;
    private String description;

    public HealthProfessional() {
    }

    public HealthProfessional(int ID, String Name, String description) {
        this.ID = ID;
        this.Name = Name;
        this.description = description;
    }

    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("Description: " + description);
    }

}
public class GeneralPractitioner extends HealthProfessional {
    private String specialization; // 全科医生特有的描述信息

    // 默认构造函数
    public GeneralPractitioner() {
        super();
    }

    // 初始化所有实例变量的构造函数
    public GeneralPractitioner(int id, String name, String description, String specialization) {
        super(id, name, description);
        this.specialization = specialization;
    }

    // 打印健康专业人员详细信息的方法
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Specialization: " + specialization);
    }

    // Getter 和 Setter 方法
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
public class OtherHealthProfessional extends HealthProfessional {
    private String specialty; // 其他健康专业人员特有的描述信息

    // 默认构造函数
    public OtherHealthProfessional() {
        super();
    }

    // 初始化所有实例变量的构造函数
    public OtherHealthProfessional(int ID, String Name, String description, String specialty) {
        super(ID, Name, description);
        this.specialty = specialty;
    }

    // 打印健康专业人员详细信息的方法
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: Other Health Professional");
        System.out.println("Specialty: " + specialty);
    }

}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 第 3 部分 - 使用类和对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Practitioner", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General Practitioner", "Internal Medicine");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Brown", "General Practitioner", "Pediatrics");
        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Nurse Davis", "Nurse", "Critical Care");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Therapist Lee", "Therapist", "Physical Therapy");

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        ohp1.printDetails();
        ohp2.printDetails();

        System.out.println("------------------------------");

        // 第 5 部分 - 预约的收集
        ArrayList<Appointment> appointments = new ArrayList<>();
        createAppointment(appointments, gp1, "John Doe", "1234567890", "08:00");
        createAppointment(appointments, gp2, "Jane Smith", "0987654321", "10:00");
        createAppointment(appointments, ohp1, "Alice Johnson", "5555555555", "14:30");
        createAppointment(appointments, ohp2, "Bob Brown", "6666666666", "16:00");

        printExistingAppointments(appointments);

        cancelBooking(appointments, "1234567890");

        printExistingAppointments(appointments);
    }

    // 创建新的预约并将其添加到 ArrayList 中
    public static void createAppointment(ArrayList<Appointment> appointments, HealthProfessional professional, String patientName, String patientPhone, String preferredTime) {
        Appointment appointment = new Appointment(patientName, patientPhone, preferredTime, professional);
        appointments.add(appointment);
    }

    // 显示 ArrayList 中现有的预约
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println();
            }
        }
    }

    // 使用患者的手机取消预约
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientPhone) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientPhone().equals(patientPhone)) {
                appointments.remove(appointment);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found for the given phone number.");
        }
    }
}
public class Appointment {
    private String patientName;
    private String patientPhone;
    private String preferredTime;
    private HealthProfessional healthProfessional;

    // 默认构造函数
    public Appointment() {
    }

    // 初始化所有实例变量的构造函数
    public Appointment(String patientName, String patientPhone, String preferredTime, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTime = preferredTime;
        this.healthProfessional = healthProfessional;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Preferred Time: " + preferredTime);
        System.out.println("Health Professional:");
        healthProfessional.printDetails();
    }

    // Getter 和 Setter 方法
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(String preferredTime) {
        this.preferredTime = preferredTime;
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }

    public void setHealthProfessional(HealthProfessional healthProfessional) {
        this.healthProfessional = healthProfessional;
    }
}