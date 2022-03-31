package com.example.raspisaniepar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        TextView textView = findViewById(R.id.textView);
        Button Chislinel = findViewById(R.id.Chislinel);

        Chislinel.setOnClickListener(view -> {

            textView.setText("Числитель");
            List<Para> paras = new ArrayList<Para>();

            paras.add(new Para("Понедельник","1: Инструментальные средства разработки ПО ", "2: ____________________",
                    "3: Разработка программных модулей", "4: Технология разработки и защиты баз данных",
                    "5: Физическая культура"));

            paras.add(new Para("Вторник", "1: ПРАКТИКА", "2: ПРАКТИКА", "3: ПРАКТИКА", "4: ПРАКТИКА", "5: ПРАКТИКА"));

            paras.add(new Para("Среда", "1: ПРАКТИКА", "2: ПРАКТИКА", "3: ПРАКТИКА", "4: ПРАКТИКА", "5: ПРАКТИКА"));

            paras.add(new Para("Четверг", "1: ____________________", "2: Иностранный язык в профессиональной деятельности",
                    "3: Разработка мобильных приложений", "4: Технология разработки программного обеспечения", "5: Системное программирование"));
            paras.add(new Para("Пятница", "1: Физическая культура", "2: Разработка программных модулей",
                    "3: Технология разработки программного обеспечения", "4: Технология разработки и защиты баз данных",
                    "5: ____________________"));

            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new Adapter(getApplicationContext(),paras));

        });

        Button Znamenatel = findViewById(R.id.Znamenatel);
        Znamenatel.setOnClickListener(view -> {

            textView.setText("Знаменатель");
            List<Para> items = new ArrayList<Para>();

            items.add(new Para("Понедельник",
                    "1: ____________________", "2: Разработка программных модулей", "3: Разработка программных модулей",
                    "4: Системное программирование", "5: Инструментальные средства разработки ПО"
            ));

            items.add(new Para("Вторник", "1: ПРАКТИКА", "2: ПРАКТИКА", "3: ПРАКТИКА", "4: ПРАКТИКА", "5: ПРАКТИКА"));

            items.add(new Para("Среда", "1: ПРАКТИКА", "2: ПРАКТИКА", "3: ПРАКТИКА", "4: ПРАКТИКА", "5: ПРАКТИКА"));

            items.add(new Para("Четверг", "1: ____________________", "2: Иностранный язык в профессиональной деятельности",
                    "3: Разработка мобильных приложений", "4: Технология разработки программного обеспечения", "5: Системное программирование"));

            items.add(new Para("Пятница", "1: Физическая культура", "2: Разработка программных модулей",
                    "3: Инструментальные средства разработки ПО", "4: Технология разработки и защиты баз данных",
                    "5: ____________________"
            ));

            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new Adapter(getApplicationContext(),items));
        });
    }
}