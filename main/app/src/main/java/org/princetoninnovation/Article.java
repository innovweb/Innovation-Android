package org.princetoninnovation;
import java.util.ArrayList;
import java.util.Date;
public class Article {
    private ArrayList<String> tags;
    private String title;
    private String imgurl;
    private String author;
    private String text;
    private Date datePublished;
    private String magazine; // magazine the article is actually from
    public Article(ArrayList<String> tags, String title, String imgurl, String author, String text, Date datePublished,
                   String magazine) {
        super();
        this.tags = tags;
        this.title = title;
        this.imgurl = imgurl;
        this.author = author;
        this.text = text;
        this.datePublished = datePublished;
        this.magazine = magazine;
    }
    public ArrayList<String> getTags() {
        return tags;
    }
    public String getTitle() {
        return title;
    }
    public String getImgurl() {
        return imgurl;
    }
    public String getAuthor() {
        return author;
    }
    public String getText() {
        return text;
    }
    public Date getDatePublished() {
        return datePublished;
    }
    public String getMagazine() {
        return magazine;
    }

}