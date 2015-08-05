package unicauca.movil.holamundo.peliculas;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.orm.SugarContext;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import unicauca.movil.holamundo.peliculas.models.Pelicula;


public class DetailActivity extends ActionBarActivity implements Callback {

    public static final String KEY_ID="keyid";

    Toolbar toolBar;
    CollapsingToolbarLayout collapsingToolbarLayout;

    TextView txtScore, txtDescripcion, txtDuracion;

    ImageView img;

    long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();
        id = extras.getLong(KEY_ID);

        SugarContext.init(this);
        Pelicula p = Pelicula.findById(Pelicula.class, id);

        txtScore = (TextView) findViewById(R.id.template_txt_score);
        txtDescripcion = (TextView) findViewById(R.id.txt_descripcion);
        txtDuracion = (TextView) findViewById(R.id.template_txt_time);

        txtScore.setText(""+p.getScore());
        txtDescripcion.setText(p.getDescripcion());
        txtDuracion.setText(p.getDuracion());

        toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolBar);
        collapsingToolbarLayout.setTitle(p.getNombre());

        img = (ImageView) findViewById(R.id.img_pelicula);
        Picasso.with(this).load(Uri.parse(p.getUrlImg())).into(img, this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    //region PICASSO Callback
    @Override
    public void onSuccess() {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) img.getDrawable();
        Bitmap bitmap = bitmapDrawable.getBitmap();

        Palette palette = Palette.from(bitmap).generate();

        int colorDefault = getResources().getColor(R.color.primary);

        int primaryColor = palette.getVibrantColor(colorDefault);

        collapsingToolbarLayout
                .setContentScrimColor(primaryColor);

        if(Build.VERSION.SDK_INT >20) {
            Window window = getWindow();

            window.setStatusBarColor(getDarkColor(primaryColor));
        }

    }

    @Override
    public void onError() {

    }
    //endregion

    public int getDarkColor(int color){
        int b = Color.blue(color);
        int r = Color.red(color);
        int g = Color.green(color);

        b = (int) (b*0.8);
        r = (int) (r*0.8);
        g = (int) (g*0.8);

        return Color.argb(255,r,g,b);
    }
}
