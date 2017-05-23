package sharetips.test.venkatkishore.sharetips;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by venkat kishore on 23-05-2017.
 */

public class SharetipAdapter extends RecyclerView.Adapter<SharetipAdapter.MyViewHolder> {
    private List<Sharetipsinfolist> drivingList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_script, tv_entrytime, tv_exittime, tv_longshort,tv_entryprice, tv_exitprice, tv_gainloss;

        public MyViewHolder(View view) {
            super(view);
            tv_script = (TextView) view.findViewById(R.id.txtscript);
            tv_entrytime = (TextView) view.findViewById(R.id.txtentrytime);
            tv_exittime = (TextView) view.findViewById(R.id.txtexittime);
            tv_longshort = (TextView) view.findViewById(R.id.txtlongshort);
            tv_entryprice = (TextView) view.findViewById(R.id.txtentryprice);
            tv_exitprice = (TextView) view.findViewById(R.id.txtexitprice);
            tv_gainloss = (TextView) view.findViewById(R.id.txtlossgain);
        }
    }


    public SharetipAdapter(List<Sharetipsinfolist> driveingList) {
        this.drivingList = driveingList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sharetips_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Sharetipsinfolist shareinfo = drivingList.get(position);
        holder.tv_script.setText(shareinfo.getScript());
        holder.tv_entrytime.setText(shareinfo.getEntrytime());
        holder.tv_exittime.setText(shareinfo.getExittime());
        holder.tv_longshort.setText(shareinfo.getLongshort());
        holder.tv_entryprice.setText(shareinfo.getEntryprice());
        holder.tv_exitprice.setText(shareinfo.getExitprice());
        holder.tv_gainloss.setText(shareinfo.getGainloss());
    }

    @Override
    public int getItemCount() {
        return drivingList.size();
    }
}