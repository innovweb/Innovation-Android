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
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDatePublished() {
		return datePublished;
	}
	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}
	public String getMagazine() {
		return magazine;
	}
	public void setMagazine(String magazine) {
		this.magazine = magazine;
	}
	
}
