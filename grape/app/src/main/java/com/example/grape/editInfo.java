package com.example.grape;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class editInfo extends Fragment {
    Spinner spin;
    ImageButton back;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);

        View v= inflater.inflate(R.layout.edit_info,container,false);

        //뒤로가기
        back=v.findViewById(R.id.back_info);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).toMyPage();
            }
        });
/*
        // 스피너
        spin = v.findViewById(R.id.info_spin);
        String[] category={ "덕성여대", "성신여대" };

        ArrayAdapter adapter= new ArrayAdapter(getContext(),R.layout.spinner_item,category);
        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: break;
                    case 1: break;
                    case 2:  break;
                    case 3: break;
                    case 4:  break;
                    default: break;
                }
            }

            // 기본 - 선택된 것이 없을 때
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spin.setSelection(0);

            }

        });
*/
        return v;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
