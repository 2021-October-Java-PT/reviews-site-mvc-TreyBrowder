package org.wecancoeit.reviews;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.NOT_FOUND, reason="Bad Request, Review Not Found!")
public class ReviewNotFoundFoundException extends Exception {
}
