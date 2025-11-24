package com.example.temidummyapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        RecyclerView chatList = findViewById(R.id.chat_list);
        chatList.setLayoutManager(new LinearLayoutManager(this));
        // 실제 메시지 어댑터는 추후 연결

        EditText input = findViewById(R.id.input_message);
        Button send = findViewById(R.id.btn_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = input.getText() != null ? input.getText().toString().trim() : "";
                if (text.isEmpty()) {
                    Toast.makeText(ChatActivity.this, "메시지를 입력해 주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }
                // TODO: 메시지를 리스트에 추가하고, GPT 응답을 요청하는 로직 연결
                Toast.makeText(ChatActivity.this, "전송: " + text, Toast.LENGTH_SHORT).show();
                input.setText("");
            }
        });
    }
}


