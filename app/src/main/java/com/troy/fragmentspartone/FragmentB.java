package com.troy.fragmentspartone;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    TextView textView;
    String data;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("ROYs", "fragment b onAttach called");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("ROYs", "fragment b onCreateView called");
        return inflater.inflate(R.layout.my_fragment_b, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ROYs", "fragment b onCreate called");
        if(savedInstanceState != null){
            data = savedInstanceState.getString("txt", null);
        }

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("ROYs", "fragment b onActivityCreated called");
        textView = getActivity().findViewById(R.id.text);
        textView.setText(data);

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("txt", data);

    }

    public void changeText(String data) {
        this.data = data;
        textView.setText(data);
    }

}
