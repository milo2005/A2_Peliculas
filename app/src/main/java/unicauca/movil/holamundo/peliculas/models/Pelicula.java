package unicauca.movil.holamundo.peliculas.models;

import android.content.Context;

import com.orm.SugarContext;
import com.orm.SugarRecord;

import unicauca.movil.holamundo.peliculas.R;

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
            p.setNombre(context.getString(R.string.test_pelicula_1_nombre));
            p.setDirector(context.getString(R.string.test_pelicula_1_director));
            p.setDuracion(context.getString(R.string.test_pelicula_1_duracion));
            p.setGenero(context.getString(R.string.test_pelicula_1_genero));
            p.setScore(4.7f);
            p.setUrlImg(context.getString(R.string.test_pelicula_1_img));
            p.setDescripcion(context.getString(R.string.test_pelicula_1_descripcion));
            p.save();



            p = new Pelicula();
            p.setNombre(context.getString(R.string.test_pelicula_2_nombre));
            p.setDirector(context.getString(R.string.test_pelicula_2_direcotr));
            p.setDuracion(context.getString(R.string.test_pelicula_2_duracion));
            p.setGenero(context.getString(R.string.test_pelicula_2_genero));
            p.setScore(4.8f);
            p.setUrlImg(context.getString(R.string.test_pelicula_2_img));
            p.setDescripcion(context.getString(R.string.test_pelicula_2_descripcion));
            p.save();

        p = new Pelicula();
        p.setNombre(context.getString(R.string.test_pelicula_3_nombre));
        p.setDirector(context.getString(R.string.test_pelicula_3_director));
        p.setDuracion(context.getString(R.string.test_pelicula_3_duracion));
        p.setGenero(context.getString(R.string.test_pelicula_3_genero));
        p.setScore(4.8f);
        p.setUrlImg(context.getString(R.string.test_pelicula_3_img));
        p.setDescripcion(context.getString(R.string.test_pelicula_3_descripcion));
        p.save();

        p = new Pelicula();
        p.setNombre(context.getString(R.string.test_pelicula_4_nombre));
        p.setDirector(context.getString(R.string.test_pelicula_4_direcotr));
        p.setDuracion(context.getString(R.string.test_pelicula_4_duracion));
        p.setGenero(context.getString(R.string.test_pelicula_4_genero));
        p.setScore(4.8f);
        p.setUrlImg(context.getString(R.string.test_pelicula_4_img));
        p.setDescripcion(context.getString(R.string.test_pelicula_4_descripcion));
        p.save();

        p = new Pelicula();
        p.setNombre(context.getString(R.string.test_pelicula_5_nombre));
        p.setDirector(context.getString(R.string.test_pelicula_5_direcotr));
        p.setDuracion(context.getString(R.string.test_pelicula_5_duracion));
        p.setGenero(context.getString(R.string.test_pelicula_5_genero));
        p.setScore(4.8f);
        p.setUrlImg(context.getString(R.string.test_pelicula_5_img));
        p.setDescripcion(context.getString(R.string.test_pelicula_5_descripcion));
        p.save();

        }

    }
}
