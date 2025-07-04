package ru.khtu.platform.statetransit.data.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.NotImplementedException;

import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum ResponseKey {
    STATES(
            new String("state") ),
    TRANSIT(
            new String("transit") ),
    SUBACTION(
            new String("subaction") ),
    INCLUSION(
            new String("inclusion") ),
    ATTRIBUTE(
            new String("attribute") ),
    MODULE_FORM(
            new String("moduleForm") )
    ;

    private final String string;


    private static final Map<String, ResponseKey> map = new HashMap<>();

    static {
        for (ResponseKey enumItem : ResponseKey.values()) {
            map.put(enumItem.getString(), enumItem);
        }
    }

    public static ResponseKey get(String string) {
        for (String stringKey : map.keySet()) {
            if (stringKey.equals(string)) {
                return map.get(stringKey);
            }
        }
        throw new NotImplementedException("NotImplementedException for string : " + string);
    }

}
