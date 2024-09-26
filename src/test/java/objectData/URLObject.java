package objectData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class URLObject extends GeneralObject{
    private String currentURLLogin;
    private String currentURLProducts;

    public URLObject(String pathJson) {
        fromJsonToObject(pathJson);
    }
}
