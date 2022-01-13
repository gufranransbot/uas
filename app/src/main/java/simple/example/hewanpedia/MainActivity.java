package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKupukupu,btnJerapah,btnKelinci;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKupukupu = findViewById(R.id.btn_buka_ras_kupukupu);
        btnJerapah = findViewById(R.id.btn_buka_ras_jerapah);
        btnKelinci = findViewById(R.id.btn_buka_ras_kelinci);
        btnKupukupu.setOnClickListener(view -> bukaGaleri("kupukupu"));
        btnJerapah.setOnClickListener(view -> bukaGaleri("jerapah"));
        btnKelinci.setOnClickListener(view -> bukaGaleri("kelinci"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity kupukupu");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void btn_profil(View view) {
        Intent intent = new Intent(MainActivity.this, Myprofil.class);
        startActivity(intent);
    }
}