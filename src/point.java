public class point {
    int abs,ords;
    public static int nombre;
    int numero=nombre;
    public point() {
        this.abs = 0;
        this.ords = 0;
        nombre++;
    }

    void setCoordonnePoint(int u, int v){
        abs=u;
        ords=v;

    }
    void translate(int u, int v){
        abs=abs+u;
        ords=ords+v;
    }
    void affiche(){
        System.out.println("abscisse : "+abs+" \nordonee : "+ords);
    }
    public boolean origine(){
        return abs==0 && ords==0 ;
    }
    public boolean egale(point p,point q){
        return p.abs==q.abs && p.ords==q.ords;
    }
    public point(int abs, int ords) {
        this.abs = abs;
        this.ords = ords;
        nombre++;
    }
    public void setcoordonne(point p) {
        abs = p.abs;
        ords = p.ords;
    }
    public point symetrie(){
        return new point(-abs,-ords);
    }



}
