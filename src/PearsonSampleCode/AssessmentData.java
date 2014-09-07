/*
package PearsonSampleCode;

import com.pearson.qa.assessments.ziggyfw.datastructures.common.JSONDataObject;
import com.pearson.qa.assessments.ziggyfw.helpers.RandomGeneratorHelper;
import com.pearson.qa.common.ziggyfw.datastructures.IValidatable;
import com.pearson.qa.common.ziggyfw.datastructures.Validatable;
import com.pearson.qa.common.ziggyfw.exceptions.ValidationException;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;

public class AssessmentData extends Validatable implements JSONDataObject {

    private Map<String, ChoiceData> questionChoices;
    private LinksData linksData;
    private Boolean isActive;
    private Boolean areChoicesRandomized;
    private Boolean isPublished;
    private Boolean isMandatoryInPool;
    private Long parentId;
    private Long questionId;
    private Long rootId;
    private String title;
    private String questionTypeId;
    private String description;
    private Double maxPoints;

    public AssessmentData() {
    }

    public AssessmentData(JSONObject fromJSON)
    {
        this.fromJSON(fromJSON);
    }

    public static AssessmentData GetDefaultAssessmentDataNoChoices()
    {
        AssessmentData assessmentDefaults = new AssessmentData();
        //Boolean
        assessmentDefaults.setIsActive(false);
        assessmentDefaults.setAreChoicesRandomized(false);
        assessmentDefaults.setIsPublished(false);
        assessmentDefaults.setIsMandatoryInPool(false);
        //Long
        assessmentDefaults.setParentId(0L);
        assessmentDefaults.setRootId(0L);
        //String
        assessmentDefaults.setTitle("QTST-Yeti-Title");
        assessmentDefaults.setQuestionTypeId("MC");
        assessmentDefaults.setMaxPoints(123.4);
        assessmentDefaults.setDescription("QTST-Yeti-Description");

        Map<String, ChoiceData> questionChoices = new LinkedHashMap<>();
        assessmentDefaults.setChoiceData(questionChoices);

        LinksData linkDefaultData = new LinksData();
        JSONObject linkDefaults = linkDefaultData.GetDefaultLinksData().toJSON();
        linkDefaultData.fromJSON(linkDefaults);
        assessmentDefaults.setLinksData(linkDefaultData);

        return assessmentDefaults;
    }

    public  static AssessmentData GetDefaultAssessmentDataWithOneChoice()
    {
        AssessmentData assessmentDefaults = new AssessmentData();
        //Boolean
        assessmentDefaults.setIsActive(false);
        assessmentDefaults.setAreChoicesRandomized(false);
        assessmentDefaults.setIsPublished(false);
        assessmentDefaults.setIsMandatoryInPool(false);
        //Long
        assessmentDefaults.setParentId(0L);
        assessmentDefaults.setRootId(0L);
        //String
        assessmentDefaults.setTitle("QTST-Yeti-Title");
        assessmentDefaults.setQuestionTypeId("MC");
        assessmentDefaults.setMaxPoints(123.4);
        assessmentDefaults.setDescription("QTST-Yeti-Description");

        //Get the defaults
        ChoiceData choiceData = new ChoiceData();

        //need to make choice data ONE array element under questionChoices
        JSONObject defaultChoiceData = ((choiceData.GetDefaultChoiceData().toJSON()));

        //this should reflect ONE element in the questionChoices linked hash map
        JSONArray choices = new JSONArray();
        choices.add(defaultChoiceData);

        Map<String, ChoiceData> questionChoices = new LinkedHashMap<>();

        for(Object choice : choices)
        {
            ChoiceData choiceData1 = new ChoiceData();
            choiceData1.fromJSON((JSONObject) choice);
            questionChoices.put(choiceData1.getDisplayOrder().toString(), choiceData1);
        }

        assessmentDefaults.setChoiceData(questionChoices);

        LinksData linkDefaultData = new LinksData();
        JSONObject linkDefaults = linkDefaultData.GetDefaultLinksData().toJSON();
        linkDefaultData.fromJSON(linkDefaults);
        assessmentDefaults.setLinksData(linkDefaultData);

        return assessmentDefaults;
    }

    public  static AssessmentData GetDefaultAssessmentDataWithTwoChoices()
    {
        AssessmentData assessmentDefaults = new AssessmentData();
        //Boolean
        assessmentDefaults.setIsActive(false);
        assessmentDefaults.setAreChoicesRandomized(false);
        assessmentDefaults.setIsPublished(false);
        assessmentDefaults.setIsMandatoryInPool(false);
        //Long
        assessmentDefaults.setParentId(0L);
        assessmentDefaults.setRootId(0L);
        //String
        assessmentDefaults.setTitle("QTST-Yeti-Title");
        assessmentDefaults.setQuestionTypeId("MC");
        assessmentDefaults.setMaxPoints(123.4);
        assessmentDefaults.setDescription("QTST-Yeti-Description");

        //Get the defaults
        ChoiceData choiceData = new ChoiceData();

        //need to make choice data ONE array element under questionChoices
        JSONObject defaultChoiceData = ((choiceData.GetDefaultChoiceData().toJSON()));
        JSONObject choiceTwoData = ((choiceData.GetChoiceTwoData().toJSON()));

        //this should reflect ONE element in the questionChoices linked hash map
        JSONArray choices = new JSONArray();
        choices.add(defaultChoiceData);
        choices.add(choiceTwoData);

        Map<String, ChoiceData> questionChoices = new LinkedHashMap<>();

        for(Object choice : choices)
        {
            ChoiceData choiceData1 = new ChoiceData();
            choiceData1.fromJSON((JSONObject) choice);
            questionChoices.put(choiceData1.getDisplayOrder().toString(), choiceData1);
        }

        assessmentDefaults.setChoiceData(questionChoices);

        LinksData linkDefaultData = new LinksData();
        JSONObject linkDefaults = linkDefaultData.GetDefaultLinksData().toJSON();
        linkDefaultData.fromJSON(linkDefaults);
        assessmentDefaults.setLinksData(linkDefaultData);

        return assessmentDefaults;
    }

    public static AssessmentData GetRandomAssessmentData()
    {

        RandomGeneratorHelper randomGeneratorHelper = new RandomGeneratorHelper();

        AssessmentData assessmentRandom = new AssessmentData();

        //Random Booleans
        assessmentRandom.setIsActive(randomGeneratorHelper.randomBoolean());
        assessmentRandom.setAreChoicesRandomized(randomGeneratorHelper.randomBoolean());
        assessmentRandom.setIsPublished(randomGeneratorHelper.randomBoolean());
        assessmentRandom.setIsMandatoryInPool(randomGeneratorHelper.randomBoolean());

        //Random Longs
        assessmentRandom.setParentId(0L);
        assessmentRandom.setRootId(0L);

        //Random Strings
        assessmentRandom.setTitle("QTST-Yeti-" + randomGeneratorHelper.generateRandomString(10, RandomGeneratorHelper.Mode.ALPHANUMERIC));
        assessmentRandom.setQuestionTypeId("MC");
        assessmentRandom.setMaxPoints(123.4);
        assessmentRandom.setDescription("QTST-Yeti-" + randomGeneratorHelper.generateRandomString(10, RandomGeneratorHelper.Mode.ALPHANUMERIC));
        Map<String, ChoiceData> questionChoices = new LinkedHashMap<>();
        assessmentRandom.setChoiceData(questionChoices);

        LinksData linkDefaultData = new LinksData();
        JSONObject linkDefaults = linkDefaultData.GetDefaultLinksData().toJSON();
        linkDefaultData.fromJSON(linkDefaults);
        assessmentRandom.setLinksData(linkDefaultData);

        return assessmentRandom;
    }


    public void fromJSON(JSONObject jsonObject) {

        //We need to represent the response here for the expected data

        //For the top level fields within the question response
        setIsActive((Boolean) jsonObject.get("isActive"));
        setAreChoicesRandomized((Boolean) jsonObject.get("areChoicesRandomized"));
        setParentId((Long) jsonObject.get("parentId"));
        setTitle((String) jsonObject.get("title"));
        setQuestionTypeId((String) jsonObject.get("questionTypeId"));
        setIsMandatoryInPool((Boolean) jsonObject.get("isMandatoryInPool"));
        setQuestionId((Long) jsonObject.get("questionId"));
        setRootId((Long) jsonObject.get("rootId"));
        setMaxPoints((Double) jsonObject.get("maxPoints"));
        setIsPublished((Boolean) jsonObject.get("isPublished"));
        setDescription((String) jsonObject.get("description"));

        JSONArray choices = ((JSONArray) jsonObject.get("questionChoices"));

        Map<String, ChoiceData> questionChoices = new LinkedHashMap<>();

        if(choices.size() > 0)
        {
            for(Object choice : choices)
            {
                ChoiceData choiceData1 = new ChoiceData();
                choiceData1.fromJSON((JSONObject) choice);
                questionChoices.put(choiceData1.getDisplayOrder().toString(), choiceData1);
            }
        }
        setChoiceData(questionChoices);

        LinksData linksData = new LinksData();
        linksData.fromJSON((JSONObject) jsonObject.get("_links"));
        setLinksData(linksData);
    }

    public JSONObject toJSON()
    {
        JSONObject jsonObject = new JSONObject();

        //For the top level fields within the question response
        jsonObject.put("isActive", getIsActive());
        jsonObject.put("areChoicesRandomized", getAreChoicesRandomized());
        jsonObject.put("parentId", getParentId());
        jsonObject.put("title", getTitle());
        jsonObject.put("questionTypeId", getQuestionTypeId());
        jsonObject.put("isMandatoryInPool", getIsMandatoryInPool());
        jsonObject.put("questionId", getQuestionId());
        jsonObject.put("rootId", getRootId());
        jsonObject.put("maxPoints", getMaxPoints());
        jsonObject.put("isPublished", getIsPublished());
        jsonObject.put("description", getDescription());

        //For the Choices array
        JSONArray questionChoices = new JSONArray();

        if(this.questionChoices != null)
        {
            for(ChoiceData choiceData : getChoiceData().values())
            {
                questionChoices.add(choiceData.toJSON());
            }
        }
        jsonObject.put("questionChoices", questionChoices);
        jsonObject.put("_links", linksData);

        return jsonObject;
    }

    //Getters and Setters
    public Map<String, ChoiceData> getChoiceData() {
        return questionChoices;
    }

    public void setChoiceData(Map<String, ChoiceData> questionChoices) {
        this.questionChoices = questionChoices;
    }

    public LinksData getLinksData() {
        return linksData;
    }

    public void setLinksData(LinksData linksData) {
        this.linksData = linksData;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public AssessmentData setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public Boolean getAreChoicesRandomized() {
        return areChoicesRandomized;
    }

    public AssessmentData setAreChoicesRandomized(Boolean areChoicesRandomized) {
        this.areChoicesRandomized = areChoicesRandomized;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public AssessmentData setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AssessmentData setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getQuestionTypeId() {
        return questionTypeId;
    }

    public AssessmentData setQuestionTypeId(String questionTypeId) {
        this.questionTypeId = questionTypeId;
        return this;
    }

    public Boolean getIsMandatoryInPool() {
        return isMandatoryInPool;
    }

    public AssessmentData setIsMandatoryInPool(Boolean isMandatoryInPool) {
        this.isMandatoryInPool = isMandatoryInPool;
        return this;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public AssessmentData setQuestionId(Long questionId) {
        this.questionId = questionId;
        return this;
    }

    public Long getRootId() {
        return rootId;
    }

    public AssessmentData setRootId(Long rootId) {
        this.rootId = rootId;
        return this;
    }

    public Double getMaxPoints() {
        return maxPoints;
    }

    public AssessmentData setMaxPoints(Double maxPoints) {
        this.maxPoints = maxPoints;
        return this;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public AssessmentData setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AssessmentData setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public void validateEquals(IValidatable obj, boolean validateFieldsThatAreNullOnThis) throws ValidationException {
        AssessmentData response = (AssessmentData) obj;
        EqualsBuilder eb = new EqualsBuilder();

        if(validateFieldsThatAreNullOnThis || this.getLinksData() != null)
        {
            this.linksData.validateEquals((response).getLinksData(), validateFieldsThatAreNullOnThis);
        }

        //This calls the ChoiceData validateEquals class to validate each element per question choice
        if(validateFieldsThatAreNullOnThis || this.getChoiceData().size() > 0)
        {
            if (this.getChoiceData().size() != response.getChoiceData().size())
                throw new ValidationException("Choice Data Array Size is different", Integer.toString(this.getChoiceData().size()), Integer.toString(response.getChoiceData().size()));

            for(ChoiceData expectedChoice : this.getChoiceData().values())
            {
                ChoiceData choice = response.getChoiceData().get(expectedChoice.getDisplayOrder().toString());
                expectedChoice.validateEquals(choice, validateFieldsThatAreNullOnThis);
            }
        }

        if (validateFieldsThatAreNullOnThis || this.getIsActive() != null)
        {
            eb.append(getIsActive(), response.getIsActive());
            if (!eb.isEquals())
                throw new ValidationException("isActive from the QUESTIONS does not match the response", Boolean.toString(this.getIsActive()), Boolean.toString(response.getIsActive()));
        }

        if (validateFieldsThatAreNullOnThis || this.getAreChoicesRandomized() != null)
        {
            eb.append(getAreChoicesRandomized(), response.getAreChoicesRandomized());
            if (!eb.isEquals())
                throw new ValidationException("areChoicesRandomized from the QUESTIONS does not match the response", Boolean.toString(this.getAreChoicesRandomized()), Boolean.toString(response.getAreChoicesRandomized()));
        }

        if (validateFieldsThatAreNullOnThis || this.getParentId() != null)
        {
            eb.append(getParentId(), response.getParentId());
            if (!eb.isEquals())
                throw new ValidationException("parentId  from the QUESTIONS does not match the response", Long.toString(this.getParentId()), Long.toString(response.getParentId()));
        }

        if (validateFieldsThatAreNullOnThis || this.getTitle() != null)
        {
            eb.append(getTitle(), response.getTitle());
            if (!eb.isEquals())
                throw new ValidationException("title from the QUESTIONS does not match the response", this.getTitle(), response.getTitle());
        }

        if (validateFieldsThatAreNullOnThis || this.getQuestionTypeId() != null)
        {
            eb.append(getQuestionTypeId(), response.getQuestionTypeId());
            if (!eb.isEquals())
                throw new ValidationException("questionTypeId from the QUESTIONS does not match the response", this.getQuestionTypeId(), response.getQuestionTypeId());
        }

        if (validateFieldsThatAreNullOnThis || this.getIsMandatoryInPool() != null)
        {
            eb.append(getIsMandatoryInPool(), response.getIsMandatoryInPool());
            if (!eb.isEquals())
                throw new ValidationException("isMandatoryInPool from the QUESTIONS does not match the response", Boolean.toString(this.getIsMandatoryInPool()), Boolean.toString(response.getIsMandatoryInPool()));
        }

        if (validateFieldsThatAreNullOnThis || this.getQuestionId() != null)
        {
            eb.append(getQuestionId(), response.getQuestionId());
            if (!eb.isEquals())
                throw new ValidationException("questionId from the QUESTIONS does not match the response", Long.toString(this.getQuestionId()), Long.toString(response.getQuestionId()));
        }

        if (validateFieldsThatAreNullOnThis || this.getRootId() != null)
        {
            eb.append(getRootId(), response.getRootId());
            if (!eb.isEquals())
                throw new ValidationException("rootId from the QUESTIONS does not match the response", Long.toString(this.getRootId()), Long.toString(response.getRootId()));
        }

        if (validateFieldsThatAreNullOnThis || this.getMaxPoints() != null)
        {
            eb.append(getMaxPoints(), response.getMaxPoints());
            if (!eb.isEquals())
                throw new ValidationException("maxPoints from the QUESTIONS does not match the response", Double.toString(this.getMaxPoints()), Double.toString(response.getMaxPoints()));
        }

        if (validateFieldsThatAreNullOnThis || this.getIsPublished() != null)
        {
            eb.append(getIsPublished(), response.getIsPublished());
            if (!eb.isEquals())
                throw new ValidationException("isPublished from the QUESTIONS does not match the response", Boolean.toString(this.getIsPublished()), Boolean.toString(response.getIsPublished()));
        }

        if (validateFieldsThatAreNullOnThis || this.getDescription() != null)
        {
            eb.append(getDescription(), response.getDescription());
            if (!eb.isEquals())
                throw new ValidationException("description from the QUESTIONS does not match the response", this.getDescription(), response.getDescription());
        }
    }

    @Override
    public void validateState() throws ValidationException {

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
}
*/
