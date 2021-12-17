package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    //constructor for database
    public ReviewRepository(){
        Review callOfDuty = new Review(1l, "Call Of Duty","imageUrl", "reviewCategory", "content", "date");
        Review haloInfinite = new Review(2l, "Halo Infinite","imageUrl", "reviewCategory", "content", "date");
        Review apexLegends = new Review(3l, "Apex Legends","imageUrl", "reviewCategory", "content", "date");
        Review fortnite = new Review(4l, "Fortnite","imageUrl", "reviewCategory", "content", "date");

        reviewsList.put(callOfDuty.getId(), callOfDuty);
        reviewsList.put(haloInfinite.getId(), haloInfinite);
        reviewsList.put(apexLegends.getId(), apexLegends);
        reviewsList.put(fortnite.getId(), fortnite);
    }

    //uses varargs to add none or as many reviews as you want (for testing only)
    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOneReview(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAllReviews() {
        return reviewsList.values();
    }
}
