package org.princetoninnovation;

import java.util.ArrayList;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Article> articles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        articles.add(new Article(null, "The Search Engine Race", "", "", "", null, ""));
        articles.add(new Article(null, "Article Number Two", "", "", "", null, ""));
        articles.add(new Article(null, "This Works Right?", "", "", "", null, ""));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.main_layout);
        TextView title = new TextView(this);
        title.setText("Category");
        title.setTextAppearance(this, android.R.style.TextAppearance_Large);
        layout.addView(title);
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams)title.getLayoutParams();
        params.setMargins(10, 10, 10, 10);
        title.setLayoutParams(params);
        HorizontalScrollView scroller = new HorizontalScrollView(this);
        scroller.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        scroller.setHorizontalScrollBarEnabled(false);
        LinearLayout layoutArticles = new LinearLayout(this);
        layoutArticles.setOrientation(LinearLayout.HORIZONTAL);
        layoutArticles.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        for (Article article : articles) {
            final Article artLink = article;
            LinearLayout layoutLink = new LinearLayout(this);
            layoutLink.setOrientation(LinearLayout.VERTICAL);
            layoutLink.setClickable(true);
            layoutLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, ArticleActivity.class);
                    startActivity(intent);
                }
            });
            ImageView artImage = new ImageView(this);
            artImage.setImageResource(R.drawable.headimage);
            layoutLink.addView(artImage);
            artImage.getLayoutParams().width = 400;
            artImage.getLayoutParams().height = 200;
            TextView artTitle = new TextView(this);
            artTitle.setText(article.getTitle());
            artTitle.setGravity(Gravity.CENTER);
            layoutLink.addView(artTitle);
            layoutArticles.addView(layoutLink);
        }
        scroller.addView(layoutArticles);
        layout.addView(scroller);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
