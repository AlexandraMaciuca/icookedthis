package ubbcluj.icookedthis.dto;

import java.util.UUID;

public class UserDto {
    private UUID userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UUID profileImageId;
    private String cookingExperience;

    public UserDto(UUID userId, String firstName, String lastName, String email, String password, UUID profileImageId, String cookingExperience) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profileImageId = profileImageId;
        this.cookingExperience = cookingExperience;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getProfileImageId() {
        return profileImageId;
    }

    public void setProfileImageId(UUID profileImageId) {
        this.profileImageId = profileImageId;
    }

    public String getCookingExperience() {
        return cookingExperience;
    }

    public void setCookingExperience(String cookingExperience) {
        this.cookingExperience = cookingExperience;
    }
}
