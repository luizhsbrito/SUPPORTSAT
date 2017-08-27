package com.example.i9centertechnology.supportsat1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickLink1(View v){
        String url = "http://r.supportsat.com.br/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void OnClickLink2(View v){
        String url = "http://186.202.64.4/supportsat/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void OnClickContato(View v){
        String url = "http://www.supportsat.com.br/contato";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


    public void OnClickDiscar(View v) {
        Uri uri = Uri.parse("tel:" + 987512110);
        Intent i = new Intent(Intent.ACTION_CALL, uri);
        if (PackageManager.PERMISSION_GRANTED != ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)) {
            return;
        }
        startActivity(i);

    }

}
