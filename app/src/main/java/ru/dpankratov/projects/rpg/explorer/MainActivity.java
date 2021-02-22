package ru.dpankratov.projects.rpg.explorer;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}