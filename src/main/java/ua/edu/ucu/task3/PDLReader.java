package ua.edu.ucu.task3;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class PDLReader {

    public Company fetch(String companyName) throws IOException{
        String API_KEY = "......";
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=ucu.edu.ua");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(text);
        String name = jsonObject.optString("name", "Unknown");
        String description = jsonObject.optString("description", "No description available");
        Company company = new Company();
        company.setName(name);
        company.setDescription(description);
        return company;
    }
}