package unicauca.movil.holamundo.peliculas.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import unicauca.movil.holamundo.peliculas.R;
import unicauca.movil.holamundo.peliculas.models.Pelicula;

/**
 * Created by DarioFernando on 21/07/2015.
 */
public class PeliculaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    static final int VIEW_SPAN = 0;
    static final int VIEW_NOSPAN = 1;

    Context context;
    List<Pelicula> data;


    public PeliculaAdapter(Context context, List<Pelicula> data) {
        this.context = context;
        this.data = data;
    }

    //region ViewHolders
    public class PeliculaSpanViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView titulo, duracion, calificacion;

        public PeliculaSpanViewHolder(View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.template_img);
            titulo = (TextView) itemView.findViewById(R.id.template_title);
            duracion = (TextView) itemView.findViewById(R.id.template_txt_time);
            calificacion = (TextView) itemView.findViewById(R.id.template_txt_score);

        }
    }

    public class PeliculaViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView titulo, calificacion;

        public PeliculaViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.template_img);
            titulo = (TextView) itemView.findViewById(R.id.template_title);
            calificacion = (TextView) itemView.findViewById(R.id.template_txt_score);

        }
    }
    //endregion

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder viewHolder = null;

        if(viewType == VIEW_SPAN){
            View v = View.inflate(context, R.layout.template_pelicula_span, null);
            viewHolder =  new PeliculaSpanViewHolder(v);
        }else {
            View v = View.inflate(context, R.layout.template_pelicula, null);
            viewHolder =  new PeliculaViewHolder(v);
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Pelicula p = data.get(position);

        if(holder instanceof PeliculaSpanViewHolder ){
            PeliculaSpanViewHolder spanHolder = (PeliculaSpanViewHolder) holder;
            spanHolder.titulo.setText(p.getNombre());
            spanHolder.duracion.setText(p.getDuracion());
            spanHolder.calificacion.setText(""+p.getScore());
            Picasso.with(context).load(Uri.parse(p.getUrlImg())).into(spanHolder.img);

        }else {
            PeliculaViewHolder pHolder = (PeliculaViewHolder) holder;
            pHolder.titulo.setText(p.getNombre());
            pHolder.calificacion.setText(""+p.getScore());
            Picasso.with(context).load(Uri.parse(p.getUrlImg())).into(pHolder.img);

        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(position%3 == 0)
            return VIEW_SPAN;
        else
            return VIEW_NOSPAN;
    }
}
