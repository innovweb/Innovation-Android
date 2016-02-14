package org.princetoninnovation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        //following is test code
        ArrayList<String> tagTest = new ArrayList<String>();
        tagTest.add("Features");
        tagTest.add("Technology");
        Article article = new Article(tagTest, "The Search Engine Race", "n/a", "Diana Vasquez", "In 1998, Lawrence “Larry” Page and his colleague at Stanford, Sergey Brin, outlined the then-current status of search engines. Yahoo!, WebCrawler and Search Engine Watch were said to store between 2 and 100 million webpages. User searches took between 1 to 9 seconds. All of this, Page and Brin said, would be dull in comparison to what users would demand of the Internet in less than a decade’s time. They were correct. Today the largest search engine in the world labels and stores up to 20 billion websites per day and handles over 30 billion daily queries, returning responses in less than half a second. However, something odd happened along the way towards this huge progress. Somehow, a small startup that emerged from the Page and Brin paper in 1998 managed to obliterate all competing search engines. Google emerged, and Google remained. Google’s success can be partly attributed to two strategic advantages, both very different in nature. One of them involved efficient employment of material resources while the other focused on the adoption of new network theory. However, both led to a growth in Google’s capacity to store and manage its data. One core component of Google is its servers. In networks, a server is a computer that focuses only on receiving and managing data. So when any user accesses a certain website, the user’s device sends a request to access that specific website’s server. Once permission is granted, bits of data from this server are transported back to the user’s device. When it comes to Google, there is not just one server at the end of the line, but close to a million servers.",new Date(115,11,17), "Innovation");
        loadArticle(article);
    }

    public void loadArticle(Article article) {
        TextView txtTitle = (TextView)findViewById(R.id.article_title);
        txtTitle.setText(article.getTitle());
        TextView txtAuthor = (TextView)findViewById(R.id.article_author);
        txtAuthor.setText(article.getAuthor());
        TextView txtDate = (TextView)findViewById(R.id.article_date);
        DateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        txtDate.setText(sdf.format(article.getDatePublished()));
        TextView txtTags = (TextView)findViewById(R.id.article_tags);
        String tagString = "";
        ArrayList<String> tags = article.getTags();
        for(int i = 0; i < tags.size(); i++) {
            tagString += tags.get(i);
            if(i < tags.size() - 1) {
                tagString += ", ";
            }
        }
        txtTags.setText(tagString);
        TextView txtBody = (TextView)findViewById(R.id.article_body);
        txtBody.setText(article.getText());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_article, menu);
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
