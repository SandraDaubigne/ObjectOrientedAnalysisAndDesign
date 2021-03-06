package yogaSystem;

import java.util.HashMap;
import java.util.Map;

public class YogaStudio {

    private Map<YogaProperties, Object> yogaProperties = new HashMap<YogaProperties, Object>();

    public YogaStudio(String name, String address, String webaddress,
                      String thumbnail, String text, YogaClass yogaClass, int phone) {

    yogaProperties.put(YogaProperties.NAME, name);
    yogaProperties.put(YogaProperties.ADDRESS, address);
    yogaProperties.put(YogaProperties.WEBADDRESS, webaddress);
    yogaProperties.put(YogaProperties.THUMBNAIL, thumbnail);
    yogaProperties.put(YogaProperties.TEXT, text);
    yogaProperties.put(YogaProperties.YOGACLASS, yogaClass);
    yogaProperties.put(YogaProperties.PHONE, phone);
    }

    public Object GetYogaProperties(YogaProperties name){
        return yogaProperties.get(name);
    }

    @Override
    public String toString() {
        String yogastudio = "Yogastudio: " + yogaProperties.get(YogaProperties.NAME) +
                "\nAdress: " + yogaProperties.get(YogaProperties.ADDRESS) +
                "\nWebbadress: " + yogaProperties.get(YogaProperties.WEBADDRESS) +
                "\nBild: " + yogaProperties.get(YogaProperties.THUMBNAIL) +
                "\nBeskrivning: " + yogaProperties.get(YogaProperties.TEXT) +
                "\nValda klasser: " + yogaProperties.get(YogaProperties.YOGACLASS) +
                "\nTelefonnummer: " + yogaProperties.get(YogaProperties.PHONE);
        return yogastudio;
    }
}
