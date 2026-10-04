package corejava.part3.objectClass.lab1;

import java.util.Scanner;

public class SocialMediaContentManagement {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        String country = sc.nextLine();
        String postId = sc.nextLine();
        String contentType = sc.nextLine();
        int likes = Integer.parseInt(sc.nextLine());
        int comments = Integer.parseInt(sc.nextLine());
        int shares = Integer.parseInt(sc.nextLine());

        if(likes < 0 || comments < 0 || shares < 0) {
            System.out.println("Error: Engagement values must be non-negative");
            return;
        }

        EngagementPost engagementPost = new EngagementPost(username, country, postId, contentType,
                likes, comments, shares);

        System.out.println(engagementPost.toString());


    }
}

class UserProfile {
    String username;
    String country;

    public UserProfile(String username, String country) {
        this.username = username;
        this.country = country;
    }

    public String toString() {
        return "User[username=" + this.username + ", country=" + this.country + "],";
    }
}

class Post extends UserProfile {

    String postId;
    String contentType;

    public Post(String username, String country, String postId, String contentType) {
        super(username, country);
        this.postId = postId;
        this.contentType = contentType;
    }

    public String toString() {
        return super.toString() + "Post[id=" + this.postId + ", type=" + this.contentType + "],";
    }
}

class EngagementPost extends Post {
    int likes;
    int comments;
    int shares;


    public EngagementPost(String username, String country, String postId, String contentType,
                          int likes, int comments, int shares) {
        super(username, country, postId, contentType);
        this.likes = likes;
        this.comments = comments;
        this.shares = shares;
    }

    public String toString() {
        return super.toString() + "Engagement[likes=" + this.likes +
                ", comments=" + this.comments + ", shares=" + this.shares + "]";
    }
}
