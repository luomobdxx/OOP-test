public class NutritionProfessionals extends HealthProfessionals{
    String ResponsibleAspects;

    //default
    public NutritionProfessionals() {
    }

    public NutritionProfessionals(int ID, String Name, String BasicInfo, String ResponsibleAspects) {
        this.ResponsibleAspects = ResponsibleAspects;
        this.ID = ID;
        this.Name = Name;
        this.BasicInfo = BasicInfo;
    }

    public void getProf() {
        System.out.println("The health professional details are:");
        System.out.println("ID of this Professionals is: " + ID);
        System.out.println("Name of this Professionals is: " + Name);
        System.out.println("Basic information of this Professionals is: " + BasicInfo);
        System.out.println("aspect of responsible of this Professional is: " + ResponsibleAspects);
        System.out.println("health professional type is NutritionProfessionals");
    }
}