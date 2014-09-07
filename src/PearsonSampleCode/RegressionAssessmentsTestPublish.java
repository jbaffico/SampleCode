/*
package PearsonSampleCode;


import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pearson.qa.assessments.ziggyfw.contexts.AuthTokenContext;
import com.pearson.qa.assessments.ziggyfw.datastructures.AssessmentData;
import com.pearson.qa.assessments.ziggyfw.helpers.AssessmentHelper;
import com.pearson.qa.assessments.ziggyfw.helpers.AuthTokenHelper;
import com.pearson.qa.assessments.ziggyfw.modules.AssessmentModule;
import com.pearson.qa.assessments.ziggyfw.modules.AuthTokenModule;
import com.pearson.qa.common.configuration.Configuration;
import com.pearson.qa.common.configuration.modules.XmlConfigurationModule;
import com.pearson.qa.common.ziggyfw.http.modules.TrustingHttpModule;
import com.pearson.qa.grid.assessments.tests.Tests.dataproviders.AssessmentsProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegressionAssessmentsTestPublish {

    private AssessmentHelper assessmentHelper;
    private Long questionId;
    private String authtoken;
    private Boolean security;

    @BeforeClass(alwaysRun=true)
    public void setUpInjector()
    {
        Injector injector = Guice.createInjector(new XmlConfigurationModule(), new TrustingHttpModule(), new AssessmentModule(), new AuthTokenModule());
        assessmentHelper = injector.getInstance(AssessmentHelper.class);
        Configuration config = injector.getInstance(Configuration.class);
        String configNameSpace = config.getConfigNamespace(AuthTokenContext.class);

        try {
            //This is a setting in the config to determine if security is on for a particular environment
            //Currently only off in dev.
            security = config.getBoolean(configNameSpace, "security", true);
            if(security){
                authtoken = injector.getInstance(AuthTokenHelper.class).createAuthToken(201);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    */
/** PUBLISH - PUT Positive Valid
     *****************************************************************************************************

    */
/** ACCEPTANCE - PUT Positive and Negative
     * Positive Tests: publish an existing question with two choices, one of them is marked as the correct choice (204)
     * Positive Tests: Calls a GET
     * Positive Tests: Tries to publish a question that is already published
     *
     * Negative Tests: Tries to publish with a bad url
     * Negative Tests: Tries to update a published question (each field)
     * Negative Tests: Tries to un-publish a question
     * Negative Tests: Tries to delete a published question
     * Negative Tests: Tries to publish and existing question with a bad token
     * @param requestData
     *//*

    @Test(groups = {"Acceptance"},dataProvider = "publishExistingMCQuestion", dataProviderClass = AssessmentsProvider.class)
    public void publishExistingMCQuestion(Integer status, AssessmentData requestData, AssessmentData changedData, String badToken, String url)
    {
        try{
            //Execute POST to create a MC question and retrieve the newly created question Id
            AssessmentData multipleChoiceQuestion = assessmentHelper.createMultipleChoiceQuestion(201, requestData, null, authtoken);
            questionId = multipleChoiceQuestion.getQuestionId();

            //Publish an existing question
            assessmentHelper.publishExistingMultipleChoiceQuestion(204, questionId, authtoken);

            //Negative

            //Publish the question with a bad route
            //Complete the bad url by adding the valid questionId and the rest of the route
            String badUrl = url + questionId + "/publish";
            assessmentHelper.publishExistingMultipleChoiceQuestionBadPath(404, badUrl, authtoken);

            //Try and update the published question (includes un-publishing the question)
            assessmentHelper.updateMultipleChoiceQuestion(status, questionId, changedData, null, authtoken);

            //Delete the published question
            assessmentHelper.deleteMultipleChoiceQuestion(403, questionId, authtoken);

            //Publish an existing question with a bad token
            if(security)
            {
                assessmentHelper.publishExistingMultipleChoiceQuestion(401, questionId, badToken);
            }

            //Positive
            //Add the question ID, set the isPublished flag (true) for the expected data to check against the response data
            requestData.setQuestionId(questionId);
            requestData.setIsPublished(true);

            //Execute GET to verify expectedResponse
            assessmentHelper.getMcQuestion(200, questionId, requestData, authtoken);

            //Publish an existing question again (204)
            assessmentHelper.publishExistingMultipleChoiceQuestion(204, questionId, authtoken);
        }
        catch (Exception e){
            Assert.fail(e.getMessage(), e);
        }
    }

    */
/** ACCEPTANCE - PUT Positive
     * PUBLISH - PUT Publish
     * Choices have same text
     * Negative numbers in display order
     * Display order does not need to be sequential (has gap in numbers)
     * Positive Tests: Set the isPublished flag to true at creation
     * @param requestData
     *//*

    @Test(groups = {"Acceptance"},dataProvider = "publishPublishQuestionWithValidEdgeCases", dataProviderClass = AssessmentsProvider.class)
    public void publishPublishQuestionWithValidEdgeCases(AssessmentData requestData)
    {
        try{
            //Execute POST to create a MC question and retrieve the newly created question Id
            AssessmentData multipleChoiceQuestion = assessmentHelper.createMultipleChoiceQuestion(201, requestData, null, authtoken);
            questionId = multipleChoiceQuestion.getQuestionId();

            //Add the question ID, set the isPublished flag (true) for the expected data to check against the response data
            requestData.setQuestionId(questionId);

            //Execute GET to verify expectedResponse
            assessmentHelper.getMcQuestion(200, questionId, requestData, authtoken);
        }
        catch (Exception e){
            Assert.fail(e.getMessage(), e);
        }
    }

    */
/** ACCEPTANCE - PUT Positive
     * PUBLISH - PUT Create and Publish the question in one step, question has two choices, one of the choices is marked as correct
     * Positive Tests: Set the isPublished flag to true at creation
     * @param requestData
     *//*

    @Test(groups = {"Acceptance"},dataProvider = "publishCreateAndPublishQuestion", dataProviderClass = AssessmentsProvider.class)
    public void publishCreateAndPublishQuestion(AssessmentData requestData)
    {
        try{
            //Execute POST to create a MC question and retrieve the newly created question Id
            AssessmentData multipleChoiceQuestion = assessmentHelper.createMultipleChoiceQuestion(201, requestData, null, authtoken);
            questionId = multipleChoiceQuestion.getQuestionId();

            //Add the question ID, set the isPublished flag (true) for the expected data to check against the response data
            requestData.setQuestionId(questionId);

            //Execute GET to verify expectedResponse
            assessmentHelper.getMcQuestion(200, questionId, requestData, authtoken);
        }
        catch (Exception e){
            Assert.fail(e.getMessage(), e);
        }
    }

    */
/** ACCEPTANCE - PUT Positive
     * PUBLISH - PUT Create and Publish the question in one step, question has two choices, one of the choices is marked as correct
     * Positive Tests: Set the isPublished flag to true at creation
     * @param requestData
     *//*

    @Test(groups = {"Acceptance"},dataProvider = "publishCreateAndPublishQuestion", dataProviderClass = AssessmentsProvider.class)
    public void publishUpdateAndPublishQuestion(AssessmentData requestData)
    {
        try{
            //Execute POST to create a MC question and retrieve the newly created question Id
            AssessmentData multipleChoiceQuestion = assessmentHelper.createMultipleChoiceQuestion(201, requestData, null, authtoken);
            questionId = multipleChoiceQuestion.getQuestionId();

            //Modify the question and publish
            requestData.setIsActive(true);
            requestData.setIsPublished(true);

            //Publish and Update at the same time
            assessmentHelper.updateMultipleChoiceQuestion(204, questionId, requestData, null, authtoken);
        }
        catch (Exception e){
            Assert.fail(e.getMessage(), e);
        }
    }

    // Negative Tests: Tries to publish with a bad exam Id
    */
/** INVALID PUT PUBLISH BAD QUESTION ID
     * PUT - Invalid question ID
     * @param status
     * @param badPath
     * @throws Exception
     *//*

    @Test (groups = {"Regression"}, dataProvider = "putInvalidExamId", dataProviderClass = AssessmentsProvider.class)
    public void putInvalidExamsId(Integer status, String badPath) throws Exception
    {
        try{
            // POST an Exam with an invalid url.  No ExamId created
            assessmentHelper.publishExistingMultipleChoiceQuestionBadPath(status, badPath, authtoken);
        }
        catch (Exception e){
            Assert.fail(e.getMessage(), e);
        }
    }

     */
/** REGRESSION - PUT Negative
     * PUBLISH - PUT Create the different types of questions first
     * Then Publish
     * Negative Tests: question has no choices
     * Negative Tests: question has one choice, not marked correct
     * Negative Tests: question has one choice, marked correct
     * Negative Tests: question has two choices, neither marked correct
     * Negative Tests: question has two choices, both marked correct
     * @param requestData
     *//*

    @Test(groups = {"Regression"},dataProvider = "publishCreateFirstPublishSecondQuestionBadChoices", dataProviderClass = AssessmentsProvider.class)
    public void publishCreateFirstPublishSecondQuestionBadChoices(Integer status, AssessmentData requestData)
    {
        try{
            //Execute POST to create a MC question and retrieve the newly created question Id
            AssessmentData multipleChoiceQuestion = assessmentHelper.createMultipleChoiceQuestion(201, requestData, null, authtoken);
            questionId = multipleChoiceQuestion.getQuestionId();

            //Publish the bad choice questions
            assessmentHelper.publishExistingMultipleChoiceQuestion(status, questionId, authtoken);
        }
        catch (Exception e){
            Assert.fail(e.getMessage(), e);
        }
    }

    */
/** REGRESSION - PUT Negative
     * PUBLISH - PUT Create and Publish the question in one step with bad choices
     * Negative Tests: question has no choices
     * Negative Tests: question has one choice, not marked correct
     * Negative Tests: question has one choice, marked correct
     * Negative Tests: question has two choices, neither marked correct
     * Negative Tests: question has two choices, both marked correct
     * @param requestData
     *//*

    @Test(groups = {"Regression"},dataProvider = "publishCreateAndPublishQuestionBadChoices", dataProviderClass = AssessmentsProvider.class)
    public void publishCreateAndPublishQuestionBadChoices(Integer status, AssessmentData requestData)
    {
        try{
            //Questions Route: Execute POST to create a MC question with bad data
            assessmentHelper.createMultipleChoiceQuestion(status, requestData, null, authtoken);
        }
        catch (Exception e){
            Assert.fail(e.getMessage(), e);
        }
    }

    */
/** REGRESSION - PUT Negative
     * PUBLISH - PUT Create the different types of questions first
     * Update a field then publish at the same time
     * Negative Tests: question has no choices
     * Negative Tests: question has one choice, not marked correct
     * Negative Tests: question has one choice, marked correct
     * Negative Tests: question has two choices, neither marked correct
     * Negative Tests: question has two choices, both marked correct
     * @param requestData
     *//*

    //NOT DONE
    @Test(groups = {"Regression"},dataProvider = "publishCreateFirstPublishSecondQuestionBadChoices", dataProviderClass = AssessmentsProvider.class)
    public void publishUpdateAndPublishQuestionBadChoices(Integer status, AssessmentData requestData)
    {
        try{
            //Execute POST to create a MC question and retrieve the newly created question Id
            AssessmentData multipleChoiceQuestion = assessmentHelper.createMultipleChoiceQuestion(201, requestData, null, authtoken);
            questionId = multipleChoiceQuestion.getQuestionId();

            requestData.setQuestionId(questionId);
            requestData.setTitle("QTST-Yeti-CHANGED");
            requestData.setIsPublished(true);

            //Questions Route: Publish and Update at the same time
            assessmentHelper.updateMultipleChoiceQuestion(status, questionId, requestData, null, authtoken);
        }
        catch (Exception e){
            Assert.fail(e.getMessage(), e);
        }
    }
}



*/
