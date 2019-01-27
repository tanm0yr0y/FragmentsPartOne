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
import android.widget.Button;

public class FragmentA extends Fragment implements View.OnClickListener {

    Button button;
    int count = 0;
    Communicator communicator;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("ROYs", "fragment onAttach called");
    }

    /*
    The onCreate() method in a Fragment is called after the Activity's onAttachFragment() but before that Fragment's onCreateView().
In this method, you can assign variables, get Intent extras, and anything else that doesn't
involve the View hierarchy (i.e. non-graphical initialisations).This is because this method can be called when the
Activity's onCreate() is not finished, and so trying to access the View hierarchy here may result in a crash.
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState != null) {
            count = savedInstanceState.getInt("count", 0);
        }

        Log.d("ROYs", "fragment onCreate called");
    }

    /*
    onCreateView():
After the onCreate() is called (in the Fragment), the Fragment's onCreateView() is called.
You can assign your View variables and do any graphical initialisations. You are expected to
return a View from this method, and this is the main UI view, but if your Fragment does not use
any layouts or graphics, you can return null (happens by default if you don't override).
     */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("ROYs", "fragment onCreateView called");
        return inflater.inflate(R.layout.my_fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        communicator = (Communicator) getActivity();
        button = getActivity().findViewById(R.id.clickMeBtn);
        button.setOnClickListener(this);

        Log.d("ROYs", "fragment onActivityCreated called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("ROYs", "fragment onStart called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("ROYs", "fragment onResume called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("ROYs", "fragment onPause called");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("count", count);
        Log.d("ROYs", "fragment onSaveInstanceState called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("ROYs", "fragment onStop called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("ROYs", "fragment onDestroyView called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("ROYs", "fragment onDestroy called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("ROYs", "fragment onDetach called");
    }

    @Override
    public void onClick(View v) {

        count++;

        communicator.respond("Button clicked: "+count+" times");
    }
}
