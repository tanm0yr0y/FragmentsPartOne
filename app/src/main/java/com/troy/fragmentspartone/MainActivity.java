package com.troy.fragmentspartone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("ROYs", "activity onCreate called");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        FragmentA fragmentA = new FragmentA();
        FragmentB fragmentB = new FragmentB();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.constraintLayout, fragmentA, "MyFragmentA");
        fragmentTransaction.add(R.id.constraintLayout, fragmentB, "MyFragmentB");
        fragmentTransaction.commit();
        */
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e("ROYs", "activity onAttachFragment called");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("ROYs", "activity onStart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ROYs", "activity onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("ROYs", "activity onDestroy called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("ROYs", "activity onSaveInstanceState called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ROYs", "activity onPause called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ROYs", "activity onResume called");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("ROYs", "activity onRestoreInstanceState called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ROYs", "activity onRestart called");
    }

    @Override
    public void respond(String data) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentById(R.id.fragment3);
        fragmentB.changeText(data);

    }

}
