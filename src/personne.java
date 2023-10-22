public class personne {
    String name,firstName;
    int dayNaiss,monthNaiss,yearNaiss;

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setDateNaiss(int jour,int mois,int anne){
        dayNaiss=jour;
        monthNaiss=mois;
        yearNaiss=anne;
    }
    public int ageEn2023(){
        return 2023-yearNaiss;
    }
}
