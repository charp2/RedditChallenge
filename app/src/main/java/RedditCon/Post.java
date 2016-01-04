package RedditCon;

/**
 * Created by Yahya on 1/4/2016.
 */
/**
 * This is a class that holds the data of the JSON objects
 * returned by the Reddit API.
 *
 * @author Hathy
 */
public class Post {

    String subreddit;
    public String title;
    String author;
    int points;
    int numComments;
    String permalink;
    String url;
    String domain;
    String id;

    String getDetails(){
        String details=author
                +" posted this and got "
                +numComments
                +" replies";
        return details;
    }

    String getTitle(){
        return title;
    }

    String getScore(){
        return Integer.toString(points);
    }
}
