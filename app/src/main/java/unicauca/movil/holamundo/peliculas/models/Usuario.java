package unicauca.movil.holamundo.peliculas.models;

import android.content.Context;

import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by DarioFernando on 16/07/2015.
 */
public class Usuario extends SugarRecord {

    String nombre, usr, pass, urlImg;

    //region Getter Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
    //endregion

    //region DataBase

    static public void init(Context context){

        SugarContext.init(context);

        if(count(Usuario.class)<1){
            Usuario usr = new Usuario();
            usr.setNombre("Dario Chamorro");
            usr.setUsr("dario");
            usr.setPass("123");
            usr.setUrlImg("https://goo.gl/QCNj5w");
            usr.save();
        }
    }

    static public Usuario findUsuarioByUserAndPass(Context context,String usr, String pass){

        SugarContext.init(context);

        Usuario u = null;

        List<Usuario> data
                = find(Usuario.class, "usr = ? AND pass = ?", usr, pass);

        if(data.size()>0)
            u = data.get(0);

        return u;
    }
    //endregion

}
