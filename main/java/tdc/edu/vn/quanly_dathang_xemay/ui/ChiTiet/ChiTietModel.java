package tdc.edu.vn.quanly_dathang_xemay.ui.ChiTiet;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import tdc.edu.vn.quanly_dathang_xemay.EditCtyXe;
import tdc.edu.vn.quanly_dathang_xemay.R;

public class ChiTietModel extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.edit_ctyxe, container, false);


        return view;
    }


}