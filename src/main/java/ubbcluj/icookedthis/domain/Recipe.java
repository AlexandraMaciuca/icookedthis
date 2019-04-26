package ubbcluj.icookedthis.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    @OneToMany(mappedBy = "recipe",  cascade = CascadeType.ALL)// @LazyCollection(LazyCollectionOption.FALSE)
    private List<Ingredient> ingredients;
    @OneToMany(mappedBy = "recipe")// @LazyCollection(LazyCollectionOption.FALSE)
    private List<Review> reviews;
    private String description;
    private String time;
    private String recommendedFor; // cooking experience
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    private Date date;
}
