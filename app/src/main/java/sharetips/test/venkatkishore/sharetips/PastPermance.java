package sharetips.test.venkatkishore.sharetips;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PastPermance extends AppCompatActivity {
    private List<Sharetipsinfolist> drivingList = new ArrayList<>();
    private RecyclerView recyclerView;
    private SharetipAdapter mAdapter;
    TextView tvdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.past_permance);
        recyclerView = (RecyclerView)findViewById(R.id.listv);

        mAdapter = new SharetipAdapter(drivingList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareSharetipsData();
    }
    private void prepareSharetipsData() {


        Sharetipsinfolist drivinginfo = new Sharetipsinfolist("Nifty", "11:00 4-11-17", "13:00 4-11-17","Buy","9300","9340","5400/-");
        drivingList.add(drivinginfo);

        drivinginfo = new Sharetipsinfolist("Nifty", "11:00 4-11-17", "13:00 4-11-17","Buy","9300","9340","5400/-");
        drivingList.add(drivinginfo);

        drivinginfo = new Sharetipsinfolist("Nifty", "11:00 4-11-17", "13:00 4-11-17","Buy","9300","9340","5400/-");
        drivingList.add(drivinginfo);

        drivinginfo = new Sharetipsinfolist("BankNifty", "11:00 4-11-17", "13:00 4-11-17","Buy","9300","9340","5400/-");
        drivingList.add(drivinginfo);

        drivinginfo = new Sharetipsinfolist("Crude", "13:00 5-11-17", "18:00 4-11-17","Sell","2500","5200","9200/-");
        drivingList.add(drivinginfo);

        drivinginfo = new Sharetipsinfolist("Nifty", "11:00 4-11-17", "13:00 4-11-17","Buy","9300","9340","5400/-");
        drivingList.add(drivinginfo);

        drivinginfo = new Sharetipsinfolist("Nifty", "11:00 4-11-17", "13:00 4-11-17","Buy","9300","9340","5400/-");
        drivingList.add(drivinginfo);

        drivinginfo = new Sharetipsinfolist("Nifty", "11:00 4-11-17", "13:00 4-11-17","Buy","9300","9340","5400/-");
        drivingList.add(drivinginfo);
    }
}
