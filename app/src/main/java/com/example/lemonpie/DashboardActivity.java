package com.example.lemonpie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class DashboardActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        mAuth = FirebaseAuth.getInstance();

        // Initialize views
        TextView userEmail = findViewById(R.id.userEmail);
        ImageView logoutIcon = findViewById(R.id.logoutIcon);

        // Dashboard cards
        /*CardView analyticsCard = findViewById(R.id.analyticsCard);
        CardView settingsCard = findViewById(R.id.settingsCard);
        CardView reportsCard = findViewById(R.id.reportsCard);
        CardView profileCard = findViewById(R.id.profileCard);*/

        // Display current user's information
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            String displayName = user.getDisplayName();
            String email = user.getEmail();

            if (displayName != null && !displayName.isEmpty()) {
                userEmail.setText("Welcome, " + displayName);
            } else if (email != null) {
                userEmail.setText("Welcome, " + email);
            } else {
                userEmail.setText("Welcome, User");
            }
        }

        // Handle logout
        logoutIcon.setOnClickListener(v -> {
            mAuth.signOut();
            Intent intent = new Intent(DashboardActivity.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });

        // Dashboard card click handlers
        //setupDashboardCardClicks(analyticsCard, settingsCard, reportsCard, profileCard);
    }

    private void setupDashboardCardClicks(CardView analyticsCard, CardView settingsCard,
                                          CardView reportsCard, CardView profileCard) {

        // Analytics card click
        if (analyticsCard != null) {
            analyticsCard.setOnClickListener(v -> {
                // TODO: Navigate to Analytics Activity
                // Intent intent = new Intent(this, AnalyticsActivity.class);
                // startActivity(intent);
            });
        }

        // Settings card click
        if (settingsCard != null) {
            settingsCard.setOnClickListener(v -> {
                // TODO: Navigate to Settings Activity
                // Intent intent = new Intent(this, SettingsActivity.class);
                // startActivity(intent);
            });
        }

        // Reports card click
        if (reportsCard != null) {
            reportsCard.setOnClickListener(v -> {
                // TODO: Navigate to Reports Activity
                // Intent intent = new Intent(this, ReportsActivity.class);
                // startActivity(intent);
            });
        }

        // Profile card click
        if (profileCard != null) {
            profileCard.setOnClickListener(v -> {
                // TODO: Navigate to Profile Activity
                // Intent intent = new Intent(this, ProfileActivity.class);
                // startActivity(intent);
            });
        }
    }
}