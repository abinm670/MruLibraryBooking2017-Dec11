package mru.booking;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * link below for reference
 * http://www.vogella.com/tutorials/AndroidRecyclerView/article.html#create-layout-files
 */

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView RoomID, RoomDescription;
        public View layout;


        public ViewHolder(View itemView) {
            super(itemView);
            layout = itemView;
            RoomID = itemView.findViewById(R.id.room_number);
            RoomDescription = itemView.findViewById(R.id.room_description);
        }
    }

    public void add(int position, String item){
        //TODO firebase thing possibly
    }

    public void remove(int position, String item){
        //TODO firebase thing possibly
    }

    public RoomAdapter(){
        //TODO firebase get list thing
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.room_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //TODO firebase thing
    }

    @Override
    public int getItemCount() {
        //TODO firebase thing
        return 0;
    }
}
