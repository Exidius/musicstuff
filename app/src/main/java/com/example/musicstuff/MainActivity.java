package com.example.musicstuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        //tv.setText(stringFromJNI());
    }


    //public native String stringFromJNI();
    private native void CrossExample(int samplerate, int buffersize, String apkPath, int fileAoffset, int fileAlength, int fileBoffset, int fileBlength);
}
