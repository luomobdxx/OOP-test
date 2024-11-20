public class GeneralPractitioners extends HealthProfessionals{
    String Department;

    //default
    public GeneralPractitioners() {
    }

    public GeneralPractitioners(int ID, String Name, String BasicInfo, String Department) {
        this.ID = ID;
        this.Name = Name;
        this.BasicInfo = BasicInfo;
        this.Department = Department;
    }

    public void getProf() {
        System.out.println("The health professional details are:");
        System.out.println("ID of this Professionals is: " + ID);
        System.out.println("Name of this Professionals is: " + Name);
        System.out.println("Basic information of this Professionals is: " + BasicInfo);
        System.out.println("Department of this Professionals is: " + Department);
        System.out.println("health professional type is General Practitioners");
    }
}
