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
        Review callOfDuty = new Review(1l, "Call Of Duty","images/CodVanguard.jpg", "Video games", "This games is absolutely garbage they should just go ahead and let this game series die already!! It's the same stuff every year!", "10/05/21");
        Review haloInfinite = new Review(2l, "Halo Infinite","images/HaloInfinite.jpg", "Video games", "Halo Inifinite is a great! I love it so much! It makes me feel like I'm playing the old school Halo games! 10 0ut of 10!", "12/12/21");
        Review apexLegends = new Review(3l, "Apex Legends","images/ApexLegends.jpg", "Video games", "I'm addicted to this game! I might need AA LOL!", "05/15/21");
        Review fortnite = new Review(4l, "Fortnite","images/fortnite.jpg", "Video Games", "The games is flat out for children, its terrible...nothing else needed to be said!", "02/24/21");

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
