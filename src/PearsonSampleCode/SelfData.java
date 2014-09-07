/*
package PearsonSampleCode;

import com.pearson.qa.assessments.ziggyfw.datastructures.common.JSONDataObject;
import com.pearson.qa.common.ziggyfw.datastructures.IValidatable;
import com.pearson.qa.common.ziggyfw.datastructures.Validatable;
import com.pearson.qa.common.ziggyfw.exceptions.ValidationException;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.json.simple.JSONObject;

public class SelfData extends Validatable implements JSONDataObject{

    private String href;

    public SelfData ()
    {

    }

    public  JSONObject toJSON()
    {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("href", getHref().toString());

        return jsonObject;
    }

    @Override
    public void fromJSON(JSONObject jsonObject) {
        setHref(jsonObject.get("href").toString());
    }

    */
/**
     * Method is called at the time of request body creation in the data provider
     * This is used to set the expected Response Data for the self link
     * It should be generic so it can handle questions, exams, exam sections
     * The only thing that is needed is the host.
     * The rest of the path (questionId, examId, sectionId) is appended in the Executor
     * @return
     *//*

    public SelfData GetDefaultSelfData()
    {
        SelfData selfDefaultData = new SelfData();

        //Create a blank href which gets set in the Executor for expected response data verification
        selfDefaultData.setHref("");

        return selfDefaultData;
    }

    @Override
    public String toJSONString() {
       return toJSON().toJSONString();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void validateEquals(IValidatable obj, boolean validateFieldsThatAreNullOnThis) throws ValidationException {
        SelfData response = (SelfData) obj;
        EqualsBuilder eb = new EqualsBuilder();

        if(validateFieldsThatAreNullOnThis || getHref() != null)
        {
            eb.append(getHref(), response.getHref());
            if (!eb.isEquals())
                throw new ValidationException("href from the self does not match the response", this.getHref(), response.getHref());
        }
    }

    @Override
    public void validateState() throws ValidationException {

    }
}
*/
