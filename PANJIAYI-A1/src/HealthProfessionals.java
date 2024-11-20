public class HealthProfessionals {
    int ID;
    String Name;
    String BasicInfo;

    //default
    public HealthProfessionals() {
    }

    //users input
    public HealthProfessionals(int ID, String Name, String BasicInfo) {
        this.ID = ID;
        this.Name = Name;
        this.BasicInfo = BasicInfo;
    }

    public void getProf() {
        System.out.println("The health professional details are:");
        System.out.println("ID of this Professionals is: " + ID);
        System.out.println("Name of this Professionals is: " + Name);
        System.out.println("Basic information of this Professionals is: " + BasicInfo);
    }
}
