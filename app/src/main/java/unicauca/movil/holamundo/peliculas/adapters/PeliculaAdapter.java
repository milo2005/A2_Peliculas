package unicauca.movil.holamundo.peliculas.adapters;

import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by DarioFernando on 21/07/2015.
 */
public class PeliculaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public class PeliculaSpanViewHolder extends RecyclerView.ViewHolder{


        public PeliculaSpanViewHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
