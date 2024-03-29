package cs2b01.utec.chat_mobile;

import android.content.Context;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.json.JSONArray;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {
    public JSONArray elements;
    private Context mContext;
    private int userFromId;

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView friendLine;
        TextView myLine;
        RelativeLayout container;

        public ViewHolder(View itemView){
            super(itemView);
            friendLine = itemView.findViewById(R.id.element_view_friend_line);
            myLine = itemView.findViewById(R.id.element_view_me_line);
            container = itemView.findViewById(R.id.element_view_container);
        }
    }
    public MessageAdapter(JSONArray elements, Context mContext, int userFromId){
        this.elements = elements;
        this.mContext = mContext;
        this.userFromId = userFromId;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(
                parent.getContext()).inflate(
                        R.layout.message_view, parent, false
        );
        return new MessageAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){

    }

    @Override
    public int getItemCount(){
        return 0;
    }
}