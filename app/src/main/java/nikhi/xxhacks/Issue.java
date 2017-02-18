package nikhi.xxhacks;

/**
 * Created by nikhi on 2/18/17.
 */
public class Issue {
    int globalRating;
    String globalName;
    public Issue(String name, int rating)
    {
        globalRating = rating;
        globalName = name;
    }
    public int getRating()
    {
        return globalRating;
    }
    public String getName()
    {
        return globalName;
    }

}
