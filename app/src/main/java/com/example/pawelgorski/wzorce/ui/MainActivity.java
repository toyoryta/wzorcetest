package com.example.pawelgorski.wzorce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

import domain.RecipeView;
import entity.Recipe;
import presentation.RecipePresenter;

public class MainActivity extends AppCompatActivity implements RecipeView {
    RecipePresenter recipePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        recipePresenter = new RecipePresenter();
        recipePresenter.onAttach(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView)  findViewById(R.id.textView);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
                        public void onClick(View v) {
                            boolean isWithMeat = false;
                            CheckBox chk = findViewById(R.id.checkBox);
                            if (chk.isChecked())  isWithMeat=true;
                            //  t.setText("ddd");
                            recipePresenter.show(isWithMeat);
                           // TextView t = (TextView)  findViewById(R.id.textView);
                          //  t.setText("ddd");

                        }
                                  }

        );

        t.setText("test");
        ///nnnn
    }

    @Override
    protected void onDestroy() {
        recipePresenter.onDetach();
        super.onDestroy();
    }

    @Override
    public void show(List<Recipe> lista) {
        TextView t = (TextView)  findViewById(R.id.textView);
        String finalStr="";
        for (int i=0;i<lista.size();i++)
        {
            Recipe r = lista.get(i);
            finalStr+=r.descripton+"  ";
        }
        t.setText(finalStr);
    }
}
