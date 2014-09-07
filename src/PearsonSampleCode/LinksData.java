/*
package PearsonSampleCode;

import com.pearson.qa.assessments.ziggyfw.datastructures.common.JSONDataObject;
import com.pearson.qa.common.ziggyfw.datastructures.IValidatable;
import com.pearson.qa.common.ziggyfw.datastructures.Validatable;
import com.pearson.qa.common.ziggyfw.exceptions.ValidationException;
import org.json.simple.JSONObject;

public class LinksData extends Validatable implements JSONDataObject {

    private SelfData self;

    public LinksData() {

    }

    public static LinksData GetDefaultLinksData()
    {
        LinksData linksDefaultData = new LinksData();

        SelfData selfDefaultData = new SelfData();
        JSONObject selfDefaults = (selfDefaultData.GetDefaultSelfData().toJSON());
        selfDefaultData.fromJSON(selfDefaults);
        linksDefaultData.setSelf(selfDefaultData);

        return  linksDefaultData;
    }

    public  JSONObject toJSON()
    {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("self", getSelf().toJSON());

        return jsonObject;
    }

    @Override
    public void fromJSON(JSONObject jsonObject) {
        //For self link
        SelfData selfData = new SelfData();
        selfData.fromJSON((JSONObject) jsonObject.get("self"));
        setSelf(selfData);
    }


    public SelfData getSelf() {
        return self;
    }

    public void setSelf(SelfData self) {
        this.self = self;
    }

    @Override
    public String toJSONString()
    {
        return toJSON().toJSONString();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void validateEquals(IValidatable obj, boolean validateFieldsThatAreNullOnThis) throws ValidationException {
        LinksData response = (LinksData) obj;

        if(validateFieldsThatAreNullOnThis || getSelf() != null)
        {
           this.self.validateEquals((response).getSelf(), validateFieldsThatAreNullOnThis);
        }
    }

    @Override
    public void validateState() throws ValidationException {

    }
}
*/
