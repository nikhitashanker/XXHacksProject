package nikhi.xxhacks;

/**
 * Created by nikhi on 2/18/17.
 */
public class Petition {
    String globalPetitionName;
    Integer globalPetitionImage;
    String globalUrl;

    public Petition(String petitionName, Integer petitionImage)
    {
        globalPetitionName = petitionName;
        globalPetitionImage = petitionImage;
        globalUrl = null;
    }
    public Petition(String petitionName, Integer petitionImage, String url)
    {
        globalPetitionName = petitionName;
        globalPetitionImage = petitionImage;
        globalUrl = url;
    }
    public String getName() {
        return globalPetitionName;
    }
    public Integer getImage() {
        return globalPetitionImage;
    }
    public String getUrl(){
        return globalUrl;
    }
}
