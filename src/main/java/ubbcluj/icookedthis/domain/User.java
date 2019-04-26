package ubbcluj.icookedthis.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity()
@Table(name = "\"User\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String password;
    private String cookingExperience;
    @OneToMany(mappedBy = "user",  cascade = CascadeType.ALL)
    private List<Recipe> recipes;
    @OneToMany(mappedBy = "user")
    private List<Review> reviews;
}
