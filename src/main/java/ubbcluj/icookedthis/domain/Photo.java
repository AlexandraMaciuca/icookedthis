package ubbcluj.icookedthis.domain;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "photo")
public class Photo {
    @Id
    private UUID id;
    private String path;


    private UUID recipeId;
}
