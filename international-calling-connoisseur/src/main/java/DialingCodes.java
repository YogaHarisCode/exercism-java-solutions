import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(codes);
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!codes.containsKey(code) && !codes.containsValue(country)){
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        Integer dialingCode = 0;
        if (!codes.containsValue(country)){
            return null;
        } else {
            for (var key : codes.keySet()){
                if (codes.get(key).equals(country)){
                    dialingCode = key;
                }
            }
            return dialingCode;
        }
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer dialingCode = findDialingCode(country);

        if (dialingCode != null){
            codes.remove(dialingCode);
            addNewDialingCode(code, country);
        }
    }
}
