package com.example.awar;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.view.Window;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.awar.databinding.ActivityMainBinding;

/*import net.pagala.JShikiApi.Core.Animes;
import net.pagala.JShikiApi.Core.ApiCall;
import net.pagala.JShikiApi.Core.ApiResponse;
import net.pagala.JShikiApi.Filters.SearchFilter.AnimeSearchFilter;
import net.pagala.JShikiApi.Filters.SearchFilter.Season;
import net.pagala.JShikiApi.Filters.SearchFilter.SeasonYear;
import net.pagala.JShikiApi.Items.Anime;
import net.pagala.JShikiApi.Items.AnimeFull;*/

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_library, R.id.navigation_home, R.id.navigation_userprofile, R.id.navigation_settings)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        //Night Theme Defualt
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        //Night Theme Defualt

        //Disable bottom navigation bar
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        //Disable bottom navigation bar





      /*  int animeId = 41467;
        try(
                ApiResponse<AnimeFull> animeResponse = Animes.get(animeId).execute()) {
            if (animeResponse.isSuccessful()) {
                AnimeFull animeFull = animeResponse.body();
                System.out.println(animeFull.getName());
            } else {
                System.out.println(animeResponse.code() + ": " + animeResponse.message());
                System.out.println("Body: " + animeResponse.prettyRawBody());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        AnimeSearchFilter animeSearchFilter = new AnimeSearchFilter();
        animeSearchFilter.setLimit(20);
        animeSearchFilter.getSeasons().getYes().add(new SeasonYear(Season.SUMMER, 2007));
        ApiCall<Anime[]> animeList = Animes.getList(animeSearchFilter);

        System.out.println(animeSearchFilter);

       */
    }

}