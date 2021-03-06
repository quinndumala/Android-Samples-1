package com.weaverprojects.localstorageapp.View;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.weaverprojects.localstorageapp.Controller.C;
import com.weaverprojects.localstorageapp.Controller.LocalDB;
import com.weaverprojects.localstorageapp.R;

public class MainActivity extends Activity {
    LocalDB mLocalDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocalDB = new LocalDB(this, C.DB_NAME, null, 1);

        //perform actions on table
        mLocalDB.insertRow("Test F1", "Test L1", "POSt 1");

        for(String m : mLocalDB.getAllFullNames()){
            Log.v("LocalDB_", m);
        }
    }
}
