package ubbcluj.icookedthis.dto;

import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {
    private UUID id;
    private UUID userId;
    private UUID recipeId;
    private Timestamp timestamp;
    private String comment;
    private int score;
}
