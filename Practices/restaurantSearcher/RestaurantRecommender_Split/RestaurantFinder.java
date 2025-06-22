// RestaurantFinder.java
import javax.swing.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class RestaurantFinder {
    public static void searchNearbyRestaurants(String keyword, JEditorPane webView) {
        double userLat = Main.userLat;
        double userLng = Main.userLng;
        String API_KEY = Main.API_KEY;
        String radius = "2000";

        try {
            String endpoint = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=" + userLat + "," + userLng +
                    "&radius=" + radius + "&type=restaurant&keyword=" + keyword + "&key=" + API_KEY;
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            Scanner scanner = new Scanner(conn.getInputStream());
            StringBuilder json = new StringBuilder();
            while (scanner.hasNext()) {
                json.append(scanner.nextLine());
            }
            scanner.close();

            JSONObject response = new JSONObject(json.toString());
            JSONArray results = response.getJSONArray("results");
            Main.restaurantList.clear();
            for (int i = 0; i < results.length(); i++) {
                Main.restaurantList.add(results.getJSONObject(i));
            }

            webView.setText("<h2 style='color:white;'>Found " + Main.restaurantList.size() + " restaurants near you.</h2>");

        } catch (IOException ex) {
            webView.setText("<h2 style='color:red;'>Error: " + ex.getMessage() + "</h2>");
        }
    }
}
