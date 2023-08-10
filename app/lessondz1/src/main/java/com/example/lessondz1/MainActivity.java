package com.example.lessondz1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final int INT_GET_PICTURE = 123;
    private Button btnSend;
    private EditText et_mail_ru;
    private EditText et_theme;
    private EditText et_massage;

    // private ImageView imgResultFoto;
    // private EditText edEt_press_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
//        initListener();

    }

    private void initView() {
        et_mail_ru = findViewById(R.id.et_mail);
        et_theme = findViewById(R.id.et_theme);
        et_massage = findViewById(R.id.et_message);
        btnSend = findViewById(R.id.btn_send);


        btnSend.setOnClickListener(v -> {
            String email;
            String theme;
            String message;
            email = et_mail_ru.getText().toString();
            theme = et_theme.getText().toString();
            message = et_massage.getText().toString();
            setBtnSend(email, theme, message);
        });
    }

    private void setBtnSend(String email, String theme, String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, email);
        intent.putExtra(Intent.EXTRA_SUBJECT, theme);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Send"));
    }

}


//        btnSend.setOnClickListener(view -> {
//            Intent intent = new Intent();
//            intent.setType("img/*");
//            intent.setAction(Intent.ACTION_GET_CONTENT);
//            startActivityForResult(intent, INT_GET_PICTURE);
        //startActivities(intent); // Ошибка!

        //startActivities(intent);
        //  Toast.makeText(this,edEt_press_password.getText().toString(),Toast.LENGTH_SHORT).show();
        //});
//    });
//}

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode == INT_GET_PICTURE && resultCode == RESULT_OK && data != null );
//        Uri imageResult = data.getData();
//        Log.d("RayBanan", imageResult.toString());
//        imgResultFoto.setImageURI(imageResult);
//
//    }

//    private void initView() {
//        btnSend = findViewById(R.id.btn_Send);
//        //edEt_press_password = findViewById(R.id.et_press_password);
//
//        imgResultFoto = findViewById(R.id.img_result_foto);
//
//    }
//}