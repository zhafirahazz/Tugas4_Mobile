package com.example.recyclerfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PreviewPahlawan extends AppCompatActivity {
    ImageView ivPahlawan;
    TextView tvName, tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_pahlawan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ivPahlawan = findViewById(R.id.iv_pahlawan);
        tvDesc = findViewById(R.id.tv_desc);
        tvName = findViewById(R.id.tv_name);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int getImg = bundle.getInt("img_url");
            String getName = bundle.getString("title");
            String getDesc = bundle.getString("detail");

            tvName.setText(getName);
            tvDesc.setText(getDesc);
            ivPahlawan.setImageResource(getImg);
        } else {
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
