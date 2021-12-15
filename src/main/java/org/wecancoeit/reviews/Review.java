package org.wecancoeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String imageURL;
    private String reviewCategory;
    private String content;
    private String date;

    public Review(){}

    public Review(long id, String title, String imageURL, String reviewCategory, String content, String date){
        this.id = id;
        this.title = title;
        this.imageURL = imageURL;
        this.reviewCategory = reviewCategory;
        this.content = content;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }
}
