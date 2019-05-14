import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.simple.parser.ParseException;

class App {
  public static void main(String[] args) throws IOException, ParseException {
    InputStream inputStream = App.class.getResourceAsStream("config.json");
    JSONParser jsonParser = new JSONParser();
    JSONArray jsonArray = (JSONArray)jsonParser.parse(new InputStreamReader(inputStream, "UTF-8"));
    for (int i = 0; i < jsonArray.size(); i++) {
      JSONObject setting = (JSONObject)jsonArray.get(i);
      System.out.println(setting.get("name").toString() + ": " + setting.get("expirationPeriod").toString());
    }
  }
}


