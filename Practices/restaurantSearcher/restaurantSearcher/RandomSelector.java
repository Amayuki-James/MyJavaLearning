// RandomSelector.java
import java.util.ArrayList;
import java.util.Random;
import org.json.JSONObject;

public class RandomSelector {
    public static JSONObject getRandomRestaurant(ArrayList<JSONObject> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
