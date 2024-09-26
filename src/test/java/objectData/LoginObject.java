package objectData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginObject extends GeneralObject{
    private String usernameStandard;
    private String usernameLocked;
    private String usernameProblem;
    private String usernamePerformance;
    private String usernameError;
    private String usernameVisual;
    private String password;

    public LoginObject(String pathJson) {
        fromJsonToObject(pathJson);
    }
}
