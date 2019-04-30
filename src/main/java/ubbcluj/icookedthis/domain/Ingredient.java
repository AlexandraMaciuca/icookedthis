package ubbcluj.icookedthis.domain;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private double quantity;
    private String unit; // unit of measurement
    private String temperature;

    @ManyToOne(optional = false)
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    private Recipe recipe;
}
