package unicauca.movil.holamundo.peliculas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedTransformationBuilder;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import unicauca.movil.holamundo.peliculas.util.AppUtil;


public class CarteleraActivity extends ActionBarActivity implements NavigationView.OnNavigationItemSelectedListener, DrawerLayout.DrawerListener {

    NavigationView nav;
    DrawerLayout drawer;
    SharedPreferences preferences;

    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartelera);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        preferences = getSharedPreferences(AppUtil.PREFERENCE_NAME
                , MODE_PRIVATE);

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.setDrawerListener(this);


        toggle =  new ActionBarDrawerToggle(this,drawer
                ,R.string.drawer_open, R.string.drawer_close);

        nav = (NavigationView) findViewById(R.id.nav);
        nav.setNavigationItemSelectedListener(this);

        ImageView userImage = (ImageView) nav.findViewById(R.id.img_user);
        TextView userName = (TextView) nav.findViewById(R.id.txt_usr);

        userName.setText(preferences.getString(AppUtil.USER_NAME,""));

        String urlImage = preferences.getString(AppUtil.USER_IMG,"");

        Transformation transformation = new RoundedTransformationBuilder()
                .oval(true)
                .build();

        Picasso.with(this).load(Uri.parse(urlImage))
                .transform(transformation)
                .into(userImage);



    }


    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {

        switch (menuItem.getItemId()){

            case R.id.nav_logout:

                SharedPreferences.Editor editor = getSharedPreferences(AppUtil.PREFERENCE_NAME,MODE_PRIVATE)
                        .edit();

                editor.putBoolean(AppUtil.USER_LOGIN, false);

                editor.commit();

                Intent intent =  new Intent(this, MainActivity.class);
                startActivity(intent);

                finish();

                break;

        }

        drawer.closeDrawers();
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(toggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }


    //region DrawerLayout & Toggle

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
        toggle.onDrawerSlide(drawerView,slideOffset);
    }


    @Override
    public void onDrawerOpened(View drawerView) {
        toggle.onDrawerOpened(drawerView);
    }

    @Override
    public void onDrawerClosed(View drawerView) {
        toggle.onDrawerClosed(drawerView);
    }

    @Override
    public void onDrawerStateChanged(int newState) {
        toggle.onDrawerStateChanged(newState);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    //endregion

}
