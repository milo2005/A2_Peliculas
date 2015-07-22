package unicauca.movil.holamundo.peliculas.models;

import android.content.Context;

import com.orm.SugarContext;
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

    public static void init(Context context){
        SugarContext.init(context);
        if(count(Pelicula.class)<1){

            Pelicula p = new Pelicula();
            p.setNombre("Intensamente");
            p.setDirector("Dario Chamorro");
            p.setDuracion("2 horas");
            p.setGenero("Comedia");
            p.setScore(4.7f);
            p.setUrlImg("http://goo.gl/DXhFnq");
            p.setDescripcion("Una ni�a llamada Riley ha nacido en Minnesota y en su mente viven cinco de sus emociones (Alegr�a, Tristeza, Miedo, Asco e Ira en la versi�n espa�ola; y Alegr�a, Tristeza, Temor, Desagrado y Furia en la versi�n hispanoamericana). A medida que Riley crece, se van agregando emociones, siendo Alegr�a la primera y Furia/Ira la �ltima emoci�n en unirse.");
            p.save();



            p = new Pelicula();
            p.setNombre("Minions");
            p.setDirector("Dario Chamorro");
            p.setDuracion("2 horas");
            p.setGenero("Comeida");
            p.setScore(4.8f);
            p.setUrlImg("http://goo.gl/o8WA83");
            p.setDescripcion("Los minions son peque�as criaturas, con forma de p�ldora de color amarillo que han existido desde el principio del tiempo, como evoluci�n de organismos unicelulares que tienen un solo prop�sito: servir al villano m�s despreciable de la historia");
            p.save();

        p = new Pelicula();
        p.setNombre("Antman");
        p.setDirector("Dario Chamorro");
        p.setDuracion("2 horas");
        p.setGenero("Accion");
        p.setScore(4.8f);
        p.setUrlImg("http://goo.gl/FJEpGm");
        p.setDescripcion("El ladr�n Scott Lang debe ayudar a su mentor, el Dr. Hank Pym, a salvaguardar el misterio de la tecnolog�a de Ant-Man �que permite a su usuario disminuir el tama�o, pero aumentar en fuerza� de varias amenazas.");
        p.save();

        p = new Pelicula();
        p.setNombre("Terminator");
        p.setDirector("Dario Chamorro");
        p.setDuracion("2 horas");
        p.setGenero("Accion");
        p.setScore(4.8f);
        p.setUrlImg("http://goo.gl/3EcZGC");
        p.setDescripcion("En el a�o 2029, John Connor , l�der de la resistencia humana, conduce la guerra contra las m�quinas. John es notificado por su unidad del ej�rcito, Tech-Com , que Skynet le atacar� desde dos frentes, el pasado y el futuro, y en �ltima instancia va a cambiar la guerra para siempre.");
        p.save();

        p = new Pelicula();
        p.setNombre("Jurassic World");
        p.setDirector("Dario Chamorro");
        p.setDuracion("2 horas");
        p.setGenero("Accion");
        p.setScore(4.8f);
        p.setUrlImg("http://goo.gl/fAip90");
        p.setDescripcion("Han pasado veintid�s a�os desde el fallido intento de abrir Jurassic Park y pese a que en un principio todo qued� abandonado y en el olvido, la compa��a InGen lo ha reabierto bajo el nombre de Jurassic World en la Isla Nublar.  ");
        p.save();

        }

    }
}
