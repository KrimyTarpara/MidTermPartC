/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String userID = scanner.nextLine();

        System.out.println("Enter favourite genre:");
        String genre = scanner.nextLine();

        UserProfile userProfile = new UserProfile(userID, genre);
        System.out.println("Your user profile has been created!");
        System.out.println("User ID: " + userProfile.getUserID());
        System.out.println("Favourite Genre: " + userProfile.getGenre());
    }
}
