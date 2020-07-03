package tdc.edu.vn.quanly_dathang_xemay.AdapterCustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import tdc.edu.vn.quanly_dathang_xemay.MainActivity;
import tdc.edu.vn.quanly_dathang_xemay.R;
import tdc.edu.vn.quanly_dathang_xemay.model.CtyXe;

public class CustomRecyclerView extends RecyclerView.Adapter<CustomRecyclerView.hoder> {
    Context context;
    ArrayList<CtyXe> ctyXes;


    public CustomRecyclerView(ArrayList<CtyXe> ctyXes, Context context) {
        this.ctyXes = ctyXes;
        this.context = context;
    }

    @NonNull
    @Override
    public hoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_recycler, parent, false);
        hoder hoder = new hoder(view);
        return hoder;

    }

    @Override
    public void onBindViewHolder(@NonNull hoder holder, int position) {
        CtyXe ctyXe = ctyXes.get(position);
        holder.imgLogo.setImageResource(MainActivity.getImageId(context.getApplicationContext(), ctyXe.getImage()));
        holder.tvMaLoai.setText(ctyXe.getMaLoai());
        holder.tvTenLoai.setText(ctyXe.getTenLoai());
        holder.tvXuatXu.setText(ctyXe.getXuatXu());

    }

    @Override
    public int getItemCount() {
        return ctyXes.size();
    }

/*

            if (hoder.imgLogo.getDrawable() != null) {

            } else {
                hoder.imgLogo.setImageResource(MainActivity.getImageId(context, ctyXe.getImage()));
            }
            2131165328
            */


    public class hoder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView tvMaLoai;
        TextView tvTenLoai;
        TextView tvXuatXu;

        public hoder(@NonNull View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.logo_ctyxe);
            tvMaLoai = itemView.findViewById(R.id.maLoai);
            tvTenLoai = itemView.findViewById(R.id.tenLoai);
            tvXuatXu = itemView.findViewById(R.id.xuatXu);
        }
    }
}
