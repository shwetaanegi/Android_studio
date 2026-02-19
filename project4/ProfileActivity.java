package com.example.linkedinusingconstraintlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private ImageView profileImage, coverPhoto;
    private TextView profileName, profileHeadline, connectionsCount;
    private Button btnOpenTo, btnAddSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        initializeViews();
        setupProfileData();
        setupClickListeners();
    }

    private void initializeViews() {
        profileImage = findViewById(R.id.profile_image);
        coverPhoto = findViewById(R.id.cover_photo);
        profileName = findViewById(R.id.profile_name);
        profileHeadline = findViewById(R.id.profile_headline);
        connectionsCount = findViewById(R.id.tv_connections);
        btnOpenTo = findViewById(R.id.btn_open_to);
        btnAddSection = findViewById(R.id.btn_add_section);
    }

    private void setupProfileData() {
        profileName.setText("Vansh Madaan");
        profileHeadline.setText("MCA Student | Python & AI Enthusiast | Aspiring AI Engineer");
        connectionsCount.setText("500+ connections");
    }

    private void setupClickListeners() {

        btnOpenTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this,
                        "Opening status options...",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnAddSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this,
                        "Add Education, Skills, or Projects",
                        Toast.LENGTH_SHORT).show();
            }
        });

        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this,
                        "Profile image clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
