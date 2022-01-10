package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "title", "imageURL", "category", "content", "date");
    private Review reviewTwo = new Review(2L, "title", "imageURL", "category", "content", "date");

    @Test
    public void shouldBeAbleToFindOneReview(){
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOneReview(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldBeAbleToFindReviewOneAndReviewTwo(){
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAllReviews();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }
}
