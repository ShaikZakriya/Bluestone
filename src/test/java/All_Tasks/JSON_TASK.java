package All_Tasks;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSON_TASK {

	public static void main(String[] args) {
		
		//JSON();
		//JSONWITH_OBJECT();
          JSON1();
	}

	private static void JSON1() {
		
		 String jsonData = "{"
	                + "\"products\": ["
	                + "    {"
	                + "        \"product_name\": \"Smartphone X10\","
	                + "        \"brand\": \"TechCorp\","
	                + "        \"price\": 45000,"
	                + "        \"currency\": \"PKR\""
	                + "    },"
	                + "    {"
	                + "        \"product_name\": \"Laptop Z15\","
	                + "        \"brand\": \"TechCorp\","
	                + "        \"price\": 85000,"
	                + "        \"currency\": \"PKR\""
	                + "    }"
	                + "]"
	                + "}";

	        // Parse JSON
	        JSONObject jsonObject = new JSONObject(jsonData);

	        // Extract "products" array
	        JSONArray productsArray = jsonObject.getJSONArray("products");

	        // Loop through each product in the array
	        for (int i = 0; i < productsArray.length(); i++) {
	            JSONObject product = productsArray.getJSONObject(i);

	            // Print the product details
	            System.out.println("Product " + (i + 1) + ":");
	            System.out.println("  Product Name: " + product.getString("product_name"));
	            System.out.println("  Brand: " + product.getString("brand"));
	            System.out.println("  Price: " + product.getInt("price"));
	            System.out.println("  Currency: " + product.getString("currency"));
	            System.out.println("--------------------");
	        }
	    }
	
	

	private static void JSONWITH_OBJECT() {
		
		 String jsonData = "{"
	                + "\"products\": ["
	                + "    {"
	                + "        \"product_name\": \"Smartphone X10\","
	                + "        \"brand\": \"TechCorp\","
	                + "        \"price\": 45000,"
	                + "        \"currency\": \"PKR\","
	                + "        \"stock\": 25,"
	                + "        \"features\": {"
	                + "            \"screen_size\": \"6.5 inches\","
	                + "            \"battery\": \"5000mAh\","
	                + "            \"camera\": \"48MP\","
	                + "            \"ram\": \"8GB\","
	                + "            \"storage\": \"128GB\""
	                + "        }"
	                + "    },"
	                + "    {"
	                + "        \"product_name\": \"Smartphone Y20\","
	                + "        \"brand\": \"TechCorp\","
	                + "        \"price\": 35000,"
	                + "        \"currency\": \"PKR\","
	                + "        \"stock\": 30,"
	                + "        \"features\": {"
	                + "            \"screen_size\": \"6.3 inches\","
	                + "            \"battery\": \"4000mAh\","
	                + "            \"camera\": \"32MP\","
	                + "            \"ram\": \"6GB\","
	                + "            \"storage\": \"64GB\""
	                + "        }"
	                + "    }"
	                + "]"
	                + "}";

	        // Parse JSON
	        JSONObject jsonObject = new JSONObject(jsonData);

	        // Extract "products" array
	        JSONArray productsArray = jsonObject.getJSONArray("products");

	        // Loop through each product in the array
	        for (int i = 0; i < productsArray.length(); i++) {
	            JSONObject product = productsArray.getJSONObject(i);

	            // Extract product details
	            String productName = product.getString("product_name");
	            String camera = product.getJSONObject("features").getString("camera");

	            // Print product name and camera details
	            System.out.println("Product: " + productName);
	            System.out.println("Camera: " + camera);
	            System.out.println(" ");
	        }
	    
	}	
		
	

	private static void JSON() {
		  String str = "Camera";
		  String jsonData = "{"
	                + "\"product_name\": \"Smartphone X10\","
	                + "\"brand\": \"TechCorp\","
	                + "\"price\": 45000,"
	                + "\"currency\": \"PKR\","
	                + "\"stock\": 25,"
	                + "\"features\": {"
	                + "    \"screen_size\": \"6.5 inches\","
	                + "    \"battery\": \"5000mAh\","
	                + "    \"camera\": \"48MP\","
	                + "    \"ram\": \"8GB\","
	                + "    \"storage\": \"128GB\""
	                + "}"
	                + "}";

	        
	        JSONObject jsonObject = new JSONObject(jsonData);
	        
	        
	        String name = jsonObject.getString("product_name");
	        String camera = jsonObject.getJSONObject("features").getString("camera");

	     System.out.println(name);
	        System.out.println("Camera: " + camera);
	    }
	
		
		
		
	}	



