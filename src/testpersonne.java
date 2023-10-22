public class testpersonne {
    public static void main(String[] args) {
        personne p=new personne();
        p.setFirstName("Seif");
        System.out.println("votre prenom est: "+p.firstName);
        p.setName("Bdiri");
        System.out.println("votre nom est: "+p.name);
        p.setDateNaiss(4,12,2001);
        System.out.println("votre age est "+p.ageEn2023());
    }
}
