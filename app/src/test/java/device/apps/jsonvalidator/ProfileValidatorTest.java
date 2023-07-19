package device.apps.jsonvalidator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import device.apps.jsonvalidator.entity.ConfigResult;
import device.apps.jsonvalidator.entity.Scan2StageEntity;
import device.apps.jsonvalidator.validator.ProfileValidator;

public class ProfileValidatorTest {

    private ProfileValidator validator;
    private File json;

    @Before
    public void init() {
        validator = ProfileValidator.getInstance();
        validator.setIsLogging(true);
    }

    @Test
    public void validateContainerNode_key_fail_in_array_test() {
        List<ConfigResult> expected = new ArrayList<>();
        json = new File("/storage/emulated/0/1.json");

        //{result : "Fail", name : "Json Key Validation", errors : ["invalid input : {잘못된 입력값}", "{기타 메세지}"]}
        ConfigResult con = new ConfigResult("Json Key Validation");
        con.addError("invalid input : /eminstall_config/JobList/jobType2");
        con.addError("invalid input : /eminstall_config/JobList/3downloadUrl");
        expected.add(con);

        List<ConfigResult> actual = validator.validateContainerNode(json, Scan2StageEntity.class);
        Assert.assertArrayEquals(actual.toArray(), expected.toArray());
    }

    @Test
    public void validateValueNode_test() {
        List<ConfigResult> results = validator.validateValueNode(json, Scan2StageEntity.class);
    }

    @Test
    public void findConstraints_test() {
        validator.findConstraints(Scan2StageEntity.class);
    }
}
