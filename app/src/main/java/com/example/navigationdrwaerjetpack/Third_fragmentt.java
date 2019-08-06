package com.example.navigationdrwaerjetpack;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class Third_fragmentt extends Fragment {


        @Override
        public void onAttach(@NonNull Context context) {
            super.onAttach(context);
        }




        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_third_fragmentt,container,false);
        }


    }
