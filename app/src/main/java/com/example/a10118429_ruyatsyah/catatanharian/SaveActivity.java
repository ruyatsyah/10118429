package com.example.a10118429_ruyatsyah.catatanharian;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a10118429_ruyatsyah.R;
import com.example.a10118429_ruyatsyah.base.DBHelper;

//05 Juni 2021-10118429-Ruyatsyah-IF10
public class SaveActivity extends AppCompatActivity {

    private EditText titleInput;
    private EditText contentInput;
    private Button btn_simpan, btn_kembali;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        dbHelper = new DBHelper(this);
        titleInput = findViewById(R.id.input_title);
        contentInput = findViewById(R.id.input_content);
        btn_simpan = findViewById(R.id.button_submit);
        btn_kembali = findViewById(R.id.button_back);

        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into kategori(kategori) values('" + titleInput.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), "Kategori Berhasil Dibuat", Toast.LENGTH_LONG).show();
                KategoriActivity.ma.RefreshList();
                finish();
            }
        });

        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish();
            }
        });
    }
}