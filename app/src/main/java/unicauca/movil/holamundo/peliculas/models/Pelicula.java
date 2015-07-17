package unicauca.movil.holamundo.peliculas.models;

import com.orm.SugarRecord;

/**
 * Created by DarioFernando on 16/07/2015.
 */
public class Pelicula extends SugarRecord{

    String nombre, director, genero, descripcion, duracion, urlImg;
    float score;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public static void init(){
        if(count(Pelicula.class)<1){

            Pelicula p = new Pelicula();
            p.setNombre("Vengadores");
            p.setDirector("Dario Chamorro");
            p.setDuracion("2 horas");
            p.setGenero("Accion");
            p.setScore(4.7f);
            p.setUrlImg("http://goo.gl/ThLpnB");
            p.setDescripcion("Pelicula de los Super Heroes de Marvel");
            p.save();



            p = new Pelicula();
            p.setNombre("Batman v Superman");
            p.setDirector("Dario Chamorro");
            p.setDuracion("2 horas");
            p.setGenero("Accion");
            p.setScore(4.8f);
            p.setUrlImg("http://goo.gl/J4YfqA");
            p.setDescripcion("Pelicula de los Super Heroes de DC");
            p.save();

        }

    }
}
