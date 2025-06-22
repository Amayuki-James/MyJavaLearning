// DisplayManager.java
import javax.swing.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class DisplayManager {
    public static void displayRestaurant(JSONObject restaurant, JEditorPane webView, String apiKey) {
        String name = restaurant.optString("name");
        String address = restaurant.optString("vicinity");
        double rating = restaurant.optDouble("rating", 0);
        String photoRef = "";

        if (restaurant.has("photos")) {
            JSONArray photos = restaurant.getJSONArray("photos");
            if (photos.length() > 0) {
                photoRef = photos.getJSONObject(0).optString("photo_reference");
            }
        }

        String photoUrl = photoRef.isEmpty() ? "" :
                "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=" + photoRef +
                "&key=" + apiKey;

        String html = "<html style='color:white; background:#222;'>" +
                "<h2>🍴 " + name + "</h2>" +
                "<p>📍 " + address + "</p>" +
                "<p>⭐ 評價: " + rating + "</p>" +
                (!photoUrl.isEmpty() ? "<img src='" + photoUrl + "' width='300' /><br>" : "") +
                "</html>";

        webView.setText(html);
        HistoryManager.saveToHistory(name);
    }
}
