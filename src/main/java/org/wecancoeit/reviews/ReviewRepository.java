package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    //uses varargs to add none or as many reviews as you want
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
