package unicauca.movil.holamundo.peliculas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import unicauca.movil.holamundo.peliculas.models.Usuario;
import unicauca.movil.holamundo.peliculas.util.AppUtil;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextInputLayout usr, pass;
    Button btnRegistro, btnEntrar;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(AppUtil.PREFERENCE_NAME
                , MODE_PRIVATE);

        editor = preferences.edit();

        usr = (TextInputLayout) findViewById(R.id.input_user);
        pass = (TextInputLayout) findViewById(R.id.input_pass);

        btnRegistro = (Button) findViewById(R.id.btn_registro);
        btnEntrar = (Button) findViewById(R.id.btn_entrar);

        btnRegistro.setOnClickListener(this);
        btnEntrar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_entrar:

                String usrText = usr.getEditText().getText().toString();
                String passText = pass.getEditText().getText().toString();

                Usuario u = Usuario.findUsuarioByUserAndPass(this,usrText,passText);

                if(u == null){
                    pass.setError("El usuario y/o contraseña no coinciden");
                    pass.setErrorEnabled(true);
                }else{

                    editor.putString(AppUtil.USER_NAME, u.getNombre());
                    editor.putString(AppUtil.USER_IMG, u.getUrlImg());
                    editor.putBoolean(AppUtil.USER_LOGIN, true);
                    editor.commit();

                    Intent intent = new Intent(this, CarteleraActivity.class);
                    startActivity(intent);
                }


                break;
            case R.id.btn_registro:

                View table = findViewById(R.id.table);
                Snackbar.make(table,"Conexion no disponible",Snackbar.LENGTH_SHORT)
                        .setAction("Reintentar",this)
                        .show();

                break;
        }

    }
}
