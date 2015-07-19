package unicauca.movil.holamundo.peliculas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import unicauca.movil.holamundo.peliculas.util.AppUtil;


public class RootActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences preferences = getSharedPreferences(AppUtil.PREFERENCE_NAME
                , MODE_PRIVATE);

        Intent intent = null;
        if(preferences.getBoolean(AppUtil.USER_LOGIN, false)){
            intent = new Intent(this, CarteleraActivity.class);
        }else{
            intent = new Intent(this, MainActivity.class);
        }
        startActivity(intent);
        finish();

    }


}
