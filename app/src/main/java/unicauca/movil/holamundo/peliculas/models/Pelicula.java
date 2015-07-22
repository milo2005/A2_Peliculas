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
            p.setDescripcion("Una niña llamada Riley ha nacido en Minnesota y en su mente viven cinco de sus emociones (Alegría, Tristeza, Miedo, Asco e Ira en la versión española; y Alegría, Tristeza, Temor, Desagrado y Furia en la versión hispanoamericana). A medida que Riley crece, se van agregando emociones, siendo Alegría la primera y Furia/Ira la última emoción en unirse.");
            p.save();



            p = new Pelicula();
            p.setNombre("Minions");
            p.setDirector("Dario Chamorro");
            p.setDuracion("2 horas");
            p.setGenero("Comeida");
            p.setScore(4.8f);
            p.setUrlImg("http://goo.gl/o8WA83");
            p.setDescripcion("Los minions son pequeñas criaturas, con forma de píldora de color amarillo que han existido desde el principio del tiempo, como evolución de organismos unicelulares que tienen un solo propósito: servir al villano más despreciable de la historia");
            p.save();

        p = new Pelicula();
        p.setNombre("Antman");
        p.setDirector("Dario Chamorro");
        p.setDuracion("2 horas");
        p.setGenero("Accion");
        p.setScore(4.8f);
        p.setUrlImg("http://goo.gl/FJEpGm");
        p.setDescripcion("El ladrón Scott Lang debe ayudar a su mentor, el Dr. Hank Pym, a salvaguardar el misterio de la tecnología de Ant-Man –que permite a su usuario disminuir el tamaño, pero aumentar en fuerza– de varias amenazas.");
        p.save();

        p = new Pelicula();
        p.setNombre("Terminator");
        p.setDirector("Dario Chamorro");
        p.setDuracion("2 horas");
        p.setGenero("Accion");
        p.setScore(4.8f);
        p.setUrlImg("http://goo.gl/3EcZGC");
        p.setDescripcion("En el año 2029, John Connor , líder de la resistencia humana, conduce la guerra contra las máquinas. John es notificado por su unidad del ejército, Tech-Com , que Skynet le atacará desde dos frentes, el pasado y el futuro, y en última instancia va a cambiar la guerra para siempre.");
        p.save();

        p = new Pelicula();
        p.setNombre("Jurassic World");
        p.setDirector("Dario Chamorro");
        p.setDuracion("2 horas");
        p.setGenero("Accion");
        p.setScore(4.8f);
        p.setUrlImg("http://goo.gl/fAip90");
        p.setDescripcion("Han pasado veintidós años desde el fallido intento de abrir Jurassic Park y pese a que en un principio todo quedó abandonado y en el olvido, la compañía InGen lo ha reabierto bajo el nombre de Jurassic World en la Isla Nublar.  ");
        p.save();

        }

    }
}
