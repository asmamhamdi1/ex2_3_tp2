public class testpoint {
    public static void main(String[] args) {
        point p=new point();
        System.out.println("p : ");
        p.affiche();
        point p1=new point(2,3);
        System.out.println(" p1 : ");
        p1.affiche();
        p.setCoordonnePoint(3,1);
        System.out.println("les nouveaux cord de p sont : ");
        p.affiche();
        System.out.println("Est que le point p est égal à p1 ?? " +p.egale(p,p1));
        System.out.println("Est que le point p est a l origine ?? " +p.origine());
        System.out.println("Est que le point p est a l origine ?? " +p1.origine());
        point p2=p1.symetrie();
        System.out.println("les ordonnes de point p2 : ");
        p2.affiche();
        System.out.println("Nombre de point crees est : " +point.nombre);

    }
}
