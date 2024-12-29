package com.example.sendnfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button btn;
    TextView txtView;
    CheckBox male,female;
    EditText firtsName,LastName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        btn = findViewById(R.id.btn);
        txtView = findViewById(R.id.txtView);
        male = findViewById(R.id.checkBoxMale);
        female = findViewById(R.id.checkBoxFemale);
        firtsName = findViewById(R.id.editTextFirstName);
        LastName = findViewById(R.id.editTextLastName);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //kullanıcıdan alınan değerleri oluşturduğum değişkene atadım
                String name = firtsName.getText().toString().trim();
                String surname = LastName.getText().toString().trim();
                String Gender = "";

                //kullanıcı checkbox'a bastığında olucak işlemleri yaptırdım
                if (male.isChecked())
                {
                    Gender = "Erkek";
                }
                else
                {
                    Gender = "Kadın";
                }

                //bütün değerleri tek bir değişkende tutarak textView'e atadım
                String allİnfo = "İsminiz :" + name + "\nSoyisminiz :" + surname + "\nCinsiyetiniz :" + Gender;
                txtView.setText(allİnfo);
            }
        });






    }
}