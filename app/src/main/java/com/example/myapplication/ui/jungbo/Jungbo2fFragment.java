package com.example.myapplication.ui.jungbo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class Jungbo2fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;
    private ConstraintLayout constraintLayout;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jungbo2f, container, false);

        constraintLayout = view.findViewById(R.id.constraintLayout);
        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.text_jungbo2f1);
        TextView textView2 = view.findViewById(R.id.text_jungbo2f2);
        TextView textView3 = view.findViewById(R.id.text_jungbo2f3);
        TextView textView4 = view.findViewById(R.id.text_jungbo2f4);
        TextView textView5 = view.findViewById(R.id.text_jungbo2f5);
        TextView textView6 = view.findViewById(R.id.text_jungbo2f6);
        TextView textView7 = view.findViewById(R.id.text_jungbo2f7);
        TextView textView8 = view.findViewById(R.id.text_jungbo2f8);
        TextView textView9 = view.findViewById(R.id.text_jungbo2f9);
        TextView textView10 = view.findViewById(R.id.text_jungbo2f10);
        TextView textView11 = view.findViewById(R.id.text_jungbo2f11);
        TextView textView12 = view.findViewById(R.id.text_jungbo2f12);

        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker));
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker));
        textView4.setOnClickListener(v -> handleTextViewClick(textView4, R.drawable.ic_maker));
        textView5.setOnClickListener(v -> handleTextViewClick(textView5, R.drawable.ic_maker));
        textView6.setOnClickListener(v -> handleTextViewClick(textView6, R.drawable.ic_maker));
        textView7.setOnClickListener(v -> handleTextViewClick(textView7, R.drawable.ic_maker));
        textView8.setOnClickListener(v -> handleTextViewClick(textView8, R.drawable.ic_maker));
        textView9.setOnClickListener(v -> handleTextViewClick(textView9, R.drawable.ic_maker));
        textView10.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));
        textView11.setOnClickListener(v -> handleTextViewClick(textView11, R.drawable.ic_maker));
        textView12.setOnClickListener(v -> handleTextViewClick(textView12, R.drawable.ic_maker));

        return view;
    }

    private void handleTextViewClick(TextView textView, int imageResId) {
        if (lastClickedTextView != null && lastClickedTextView == textView) {
            overlayImageView.setVisibility(View.GONE);
            lastClickedTextView = null;
        } else {
            // Set the image resource
            overlayImageView.setImageResource(imageResId);

            // Use ConstraintSet to modify constraints
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);

            if (textView.getId() == R.id.text_jungbo2f1) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 700);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            } else if (textView.getId() == R.id.text_jungbo2f2) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 340);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 1020);
            } else if (textView.getId() == R.id.text_jungbo2f3) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 1050);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 1020);
            } else if (textView.getId() == R.id.text_jungbo2f4) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 1210);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 1020);
            } else if (textView.getId() == R.id.text_jungbo2f5) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 250);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            } else if (textView.getId() == R.id.text_jungbo2f6) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 120);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 1020);
            } else if (textView.getId() == R.id.text_jungbo2f7) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 845);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            } else if (textView.getId() == R.id.text_jungbo2f8) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 980);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            } else if (textView.getId() == R.id.text_jungbo2f9) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 1100);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            }else if (textView.getId() == R.id.text_jungbo2f10) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 350);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            }
            else if (textView.getId() == R.id.text_jungbo2f11) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 120);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            }
            else if (textView.getId() == R.id.text_jungbo2f12) {
                constraintSet.connect(R.id.overlay_image, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 1210);
                constraintSet.connect(R.id.overlay_image, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 450);
            }
            // Add more conditions as needed for other TextViews

            // Apply the modified constraints
            constraintSet.applyTo(constraintLayout);

            // Make overlayImageView visible
            overlayImageView.setVisibility(View.VISIBLE);

            // Set the last clicked textView
            lastClickedTextView = textView;
        }
    }
}
