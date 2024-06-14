package com.example.myapplication.ui.hongji;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHongjiBinding;

public class HongjiFragment extends Fragment {

    private FragmentHongjiBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HongjiViewModel hongjiViewModel =
                new ViewModelProvider(this).get(HongjiViewModel.class);

        binding = FragmentHongjiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHongji;
        hongjiViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.hongjib1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hongji_to_nav_hongjib1f));
        binding.hongji1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hongji_to_nav_hongji1f));
        binding.hongji2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hongji_to_nav_hongji2f));
        binding.hongji3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hongji_to_nav_hongji3f));
        binding.hongji4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hongji_to_nav_hongji4f));
        binding.hongji5f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hongji_to_nav_hongji5f));
        binding.hongji6f.setOnClickListener(v -> navController.navigate(R.id.action_nav_hongji_to_nav_hongji6f));
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        FragmentTransaction fragmentTransaction1 = fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}