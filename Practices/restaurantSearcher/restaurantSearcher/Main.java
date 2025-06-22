// Main.java
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    static final String API_KEY = "YOUR_API_KEY_HERE";
    static ArrayList<JSONObject> restaurantList = new ArrayList<>();
    static double userLat = 51.5074;
    static double userLng = -0.1278;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Restaurant Recommender");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.getContentPane().setBackground(Color.DARK_GRAY);
            frame.setLayout(new BorderLayout());

            JTextField inputField = new JTextField();
            JButton searchButton = new JButton("Search");
            JButton randomButton = new JButton("Random Pick");
            JButton locationButton = new JButton("Set Location");
            JButton historyButton = new JButton("View History");

            JPanel topPanel = new JPanel();
            topPanel.setLayout(new GridLayout(1, 5));
            topPanel.add(inputField);
            topPanel.add(searchButton);
            topPanel.add(randomButton);
            topPanel.add(locationButton);
            topPanel.add(historyButton);
            frame.add(topPanel, BorderLayout.NORTH);

            JEditorPane webView = new JEditorPane();
            webView.setEditable(false);
            webView.setContentType("text/html");
            JScrollPane scrollPane = new JScrollPane(webView);
            frame.add(scrollPane, BorderLayout.CENTER);

            searchButton.addActionListener(e -> {
                String keyword = inputField.getText();
                webView.setText("<h2 style='color:white;'>Searching for: " + keyword + "</h2>");
                RestaurantFinder.searchNearbyRestaurants(keyword, webView);
            });

            randomButton.addActionListener(e -> {
                if (!restaurantList.isEmpty()) {
                    JSONObject randomRestaurant = RandomSelector.getRandomRestaurant(restaurantList);
                    DisplayManager.displayRestaurant(randomRestaurant, webView, API_KEY);
                } else {
                    webView.setText("<h2 style='color:white;'>Please search first before picking.</h2>");
                }
            });

            locationButton.addActionListener(e -> {
                JTextField latField = new JTextField();
                JTextField lngField = new JTextField();
                Object[] message = {
                    "Latitude:", latField,
                    "Longitude:", lngField
                };
                int option = JOptionPane.showConfirmDialog(frame, message, "Enter GPS Coordinates", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    try {
                        userLat = Double.parseDouble(latField.getText());
                        userLng = Double.parseDouble(lngField.getText());
                        JOptionPane.showMessageDialog(frame, "Location updated to: " + userLat + ", " + userLng);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid coordinates.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            historyButton.addActionListener(e -> {
                try {
                    java.util.List<String> history = java.nio.file.Files.readAllLines(java.nio.file.Paths.get("history.txt"));
                    StringBuilder html = new StringBuilder("<html style='color:white; background:#222;'><h2>History</h2><ul>");
                    for (String item : history) {
                        html.append("<li>🍽️ ").append(item).append("</li>");
                    }
                    html.append("</ul></html>");
                    webView.setText(html.toString());
                } catch (IOException ex) {
                    webView.setText("<h2 style='color:red;'>No history found.</h2>");
                }
            });

            frame.setVisible(true);
        });
    }
}
