package ubbcluj.icookedthis.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class ReviewDto {
    private UUID reviewId;
    private UUID userId;
    private UUID recipeId;
    private Timestamp timestamp;
    private String comment;
    private int score;

    public ReviewDto(UUID reviewId, UUID userId, UUID recipeId, Timestamp timestamp, String comment, int score) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.recipeId = recipeId;
        this.timestamp = timestamp;
        this.comment = comment;
        this.score = score;
    }

    public UUID getReviewId() {
        return reviewId;
    }

    public void setReviewId(UUID reviewId) {
        this.reviewId = reviewId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(UUID recipeId) {
        this.recipeId = recipeId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
