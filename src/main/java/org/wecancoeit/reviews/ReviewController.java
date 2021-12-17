package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/reviews")
    public String findAllReviews(Model model){
        model.addAttribute("reviewsModel", reviewRepo.findAllReviews());
        return "reviewsTemplate";
    }

    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value="id") Long id, Model model) throws ReviewNotFoundFoundException {

        if(reviewRepo.findOneReview(id) == null){
            throw new ReviewNotFoundFoundException();
        }

        model.addAttribute("reviewModel", reviewRepo.findOneReview(id));
        return "reviewTemplate";
    }
}

