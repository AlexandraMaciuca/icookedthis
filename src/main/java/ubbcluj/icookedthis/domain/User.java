package ubbcluj.icookedthis.domain;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

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
@Table(name="\"User\"")
public class User {
    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String password;
    private UUID profileImageId;
    private String cookingExperience;
    @OneToMany(mappedBy = "user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Recipe> recipes;
    @OneToMany(mappedBy = "user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Review> reviews;
}
