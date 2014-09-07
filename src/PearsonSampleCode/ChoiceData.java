/*
package PearsonSampleCode;

import com.pearson.qa.assessments.ziggyfw.datastructures.common.JSONDataObject;
import com.pearson.qa.common.ziggyfw.datastructures.IValidatable;
import com.pearson.qa.common.ziggyfw.datastructures.Validatable;
import com.pearson.qa.common.ziggyfw.exceptions.ValidationException;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.json.simple.JSONObject;

public class ChoiceData extends Validatable implements JSONDataObject {

    private Boolean isCorrect;
    private Long questionId;
    private Long displayOrder;
    private String choiceDescription;
    private String choiceText;

    public ChoiceData(){

    }

    public static ChoiceData GetDefaultChoiceData()
    {
        ChoiceData choiceOneData = new ChoiceData();
        //Boolean
        choiceOneData.setIsCorrect(false);
        //Long
        choiceOneData.setDisplayOrder(1L);
        //String
        choiceOneData.setChoiceDescription("QTST-Yeti-Description One");
        choiceOneData.setChoiceText("QTST-Yeti-Text One");

        return  choiceOneData;
    }

    public static ChoiceData GetChoiceTwoData()
    {
        ChoiceData choiceTwoData = new ChoiceData();
        //Boolean
        choiceTwoData.setIsCorrect(true);
        //Long
        choiceTwoData.setDisplayOrder(2L);
        //String
        choiceTwoData.setChoiceDescription("QTST-Yeti-Description-Two");
        choiceTwoData.setChoiceText("QTST-Yeti-Text-Two");

        return  choiceTwoData;
    }

    public void fromJSON(JSONObject jsonObject) {

        setQuestionId((Long) jsonObject.get("questionId"));
        setChoiceDescription((String) jsonObject.get("choiceDescription"));
        setChoiceText((String) jsonObject.get("choiceText"));
        setDisplayOrder((Long) jsonObject.get("displayOrder"));
        setIsCorrect((Boolean) jsonObject.get("isCorrect"));
    }

    public JSONObject toJSON() {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("questionId", getQuestionId());
        jsonObject.put("choiceDescription", getChoiceDescription());
        jsonObject.put("choiceText", getChoiceText());
        jsonObject.put("displayOrder", getDisplayOrder());
        jsonObject.put("isCorrect", getIsCorrect());

        return jsonObject;
    }

    @Override
    public void validateEquals(IValidatable obj, boolean validateFieldsThatAreNullOnThis) throws ValidationException {

        ChoiceData response = (ChoiceData) obj;
        EqualsBuilder eb = new EqualsBuilder();

        if (validateFieldsThatAreNullOnThis || this.getQuestionId() != null)
        {
            eb.append(getQuestionId(), response.getQuestionId());
            if (!eb.isEquals())
                throw new ValidationException("questionId from the CHOICES does not match the response", Long.toString(this.getQuestionId()), Long.toString(response.getQuestionId()));
        }

        if (validateFieldsThatAreNullOnThis || this.getChoiceDescription() != null)
        {
            eb.append(getChoiceDescription(), response.getChoiceDescription());
            if (!eb.isEquals())
                throw new ValidationException("choiceDescription from the CHOICES does not match the response", this.getChoiceDescription(), response.getChoiceDescription());
        }

        if (validateFieldsThatAreNullOnThis || this.getChoiceText() != null)
        {
            eb.append(getChoiceText(), response.getChoiceText());
            if (!eb.isEquals())
                throw new ValidationException("choiceText from the CHOICES does not match the response", this.getChoiceText(), response.getChoiceText());
        }

        if (validateFieldsThatAreNullOnThis || this.getDisplayOrder() != null)
        {
            eb.append(getDisplayOrder(), response.getDisplayOrder());
            if (!eb.isEquals())
                throw new ValidationException("displayOrder from the CHOICES does not match the response", Long.toString(this.getDisplayOrder()), Long.toString(response.getDisplayOrder()));
        }

        if (validateFieldsThatAreNullOnThis || this.getIsCorrect() != null)
        {
            eb.append(getIsCorrect(), response.getIsCorrect());
            if (!eb.isEquals())
                throw new ValidationException("isCorrect from the CHOICES does not match the response", Boolean.toString(this.getIsCorrect()), Boolean.toString(response.getIsCorrect()));
        }
    }

    //Getters and Setters
    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getChoiceDescription() {
        return choiceDescription;
    }

    public void setChoiceDescription(String choiceDescription) {
        this.choiceDescription = choiceDescription;
    }

    public String getChoiceText() {
        return choiceText;
    }

    public void setChoiceText(String choiceText) {
        this.choiceText = choiceText;
    }

    public Long getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    @Override
    public String toJSONString() {
        return toJSON().toJSONString();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void validateState() throws ValidationException {

    }
}
*/
