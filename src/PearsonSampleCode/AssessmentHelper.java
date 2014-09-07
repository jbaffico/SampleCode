/*
package PearsonSampleCode;

import com.google.inject.*;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pearson.qa.assessments.ziggyfw.Constants;
import com.pearson.qa.assessments.ziggyfw.contexts.AssessmentContext;
import com.pearson.qa.assessments.ziggyfw.executiondrivers.AssessmentExecutionDriver;
import com.pearson.qa.assessments.ziggyfw.utilities.InjectorFactory;
import com.pearson.qa.common.configuration.Configuration;
import com.pearson.qa.common.configuration.modules.XmlConfigurationModule;
import com.pearson.qa.common.ziggyfw.http.modules.HttpModule;
import com.pearson.qa.common.ziggyfw.validators.Validator;
import org.apache.http.message.BasicHeader;

import java.util.List;

public class AssessmentHelper {

    private AssessmentExecutionDriver testExecutionDriver;
    private List<Validator<AssessmentContext>> validators;
    private Injector injector;
    private Configuration config;
    private String host;
    private String apigeeHost;
    private String requestPath = "/questions";
    private String publishPath = "/publish";
    private String apigeeRequestPath = "/assessments/questions";

    @Inject
    public AssessmentHelper(AssessmentExecutionDriver testExecutionDriver)
    {
        this.testExecutionDriver = testExecutionDriver;

        injector = Guice.createInjector(new XmlConfigurationModule(), new HttpModule());
        config = injector.getInstance(Configuration.class);

        String configNameSpace = config.getConfigNamespace(AssessmentContext.class);
        try {
            host = config.getString(configNameSpace, "host", "");
            apigeeHost = config.getString(configNameSpace, "apigeeHost", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private AssessmentContext getContext()
    {
        AssessmentContext context = InjectorFactory.getInjector().getInstance(AssessmentContext.class);
        context.setResponseDataClass(AssessmentData.class);

        return context;
    }

    */
/** POST ROUTE
     */
/***********************************************************************************************************************************************//*


    */
/**
     * Creates a multiple choice question
     * @param expectedStatus
     * @param requestData
     * @param expectedResponseData
     * @return
     * @throws Exception
     *//*

    public AssessmentData createMultipleChoiceQuestion(Integer expectedStatus, AssessmentData requestData, AssessmentData expectedResponseData, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("POST");
        context.setRequestData(requestData);
        context.setExpectedResponseData(expectedResponseData);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.HEADER, token));

        testExecutionDriver.execute(context);

        return context.getResponseData();
    }

    */
/**
     * Changed signature to send in a bad path for negative route testing
     * @param expectedStatus
     * @param path
     * @param requestData
     * @return
     * @throws Exception
     *//*

    public AssessmentData createMultipleChoiceQuestionBadPath(Integer expectedStatus, String path, AssessmentData requestData, AssessmentData expectedResponseData, String token) throws Exception

    {
        AssessmentContext context = getContext();
        context.setRequestMethod("POST");
        context.setRequestPath(path);
        context.setRequestData(requestData);
        context.setExpectedResponseData(expectedResponseData);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.HEADER, token));

        testExecutionDriver.execute(context);

        return context.getResponseData();
    }

    */
/** PUT ROUTE
     */
/***********************************************************************************************************************************************//*


    */
/**
     * Updating a multiple choice question
     * @param expectedStatus
     * @param requestData
     * @param expectedResponseData
     * @throws Exception
     *//*

    public void updateMultipleChoiceQuestion(Integer expectedStatus, Long questionId, AssessmentData requestData, AssessmentData expectedResponseData, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("PUT");
        context.setRequestPath(requestPath + "/" + questionId);
        context.setRequestData(requestData);
        context.setExpectedResponseData(expectedResponseData);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.HEADER, token));

        testExecutionDriver.execute(context);
    }

    */
/** PUT FOR PUBLISH
     * PUBLISH an existing multiple choice question
     * @param expectedStatus
     * @param token
     * @return
     * @throws Exception
     *//*

    public AssessmentData publishExistingMultipleChoiceQuestion(Integer expectedStatus, Long questionId, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("PUT");
        context.setRequestPath(requestPath + "/" + questionId + publishPath);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.HEADER, token));

        testExecutionDriver.execute(context);

        return context.getResponseData();
    }

    */
/** PUT FOR PUBLISH
     * Changed signature to send in a bad path for negative route testing
     * @param expectedStatus
     * @param path
     * @param token
     * @return
     * @throws Exception
     *//*

    public AssessmentData publishExistingMultipleChoiceQuestionBadPath(Integer expectedStatus, String path, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("PUT");
        context.setRequestPath(path);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.HEADER, token));

        testExecutionDriver.execute(context);

        return context.getResponseData();
    }

    */
/** GET ROUTE
     */
/***********************************************************************************************************************************************//*


    */
/**
     * Get a multiple choice question
     * @param expectedStatus
     * @param id
     * @param expectedResponseData
     * @param token
     * @return
     * @throws Exception
     *//*

    public AssessmentData getMcQuestion(Integer expectedStatus, Long id, AssessmentData expectedResponseData, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("GET");
        context.setRequestPath(requestPath + "/" + id);
        context.setExpectedResponseData(expectedResponseData);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.HEADER, token));

        testExecutionDriver.execute(context);

        return context.getResponseData();
    }

    */
/**
     * Changed signature to send in a bad path for negative route testing
     * @param expectedStatus
     * @param path
     * @param expectedResponseData
     * @return
     * @throws Exception
     *//*

    public AssessmentData getMcQuestionBadPath(Integer expectedStatus, String path, AssessmentData expectedResponseData, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("GET");
        context.setRequestPath(path);
        context.setExpectedResponseData(expectedResponseData);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.HEADER, token));

        testExecutionDriver.execute(context);

        return context.getResponseData();
    }

    */
/** DELETE ROUTE
     */
/***********************************************************************************************************************************************//*


    */
/**
     * Delete a multiple choice question
     * @param expectedStatus
     * @param id
     * @throws Exception
     *//*

    public void deleteMultipleChoiceQuestion(Integer expectedStatus, Long id, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("DELETE");
        context.setRequestPath(requestPath + "/" + id);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.HEADER, token));

        testExecutionDriver.execute(context);
    }

    */
/**
     * Delete multiple choice question bad path
     * @param expectedStatus
     * @param path
     * @throws Exception
     *//*

    public void deleteMultipleChoiceQuestionBadPath(Integer expectedStatus, String path, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("DELETE");
        context.setRequestPath(path);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.HEADER, token));

        testExecutionDriver.execute(context);
    }

    */
/** APIGEE
     */
/***********************************************************************************************************************************************//*


    */
/** VALID POST ROUTE
     * Creates a multiple choice question using Apigee Authentication
     * Can check expected response data
     * @param expectedStatus
     * @param requestData
     * @param expectedResponseData
     * @return
     * @throws Exception
     *//*

    public AssessmentData createMcQuestionThroughApigeeRoute(Integer expectedStatus, AssessmentData requestData, AssessmentData expectedResponseData, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("POST");
        context.setRequestHost(apigeeHost);
        context.setRequestPath(apigeeRequestPath);
        context.setRequestData(requestData);
        context.setExpectedResponseData(expectedResponseData);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.APIGEE_HEADER, Constants.Url.APIGEE_VALUE_PREFIX_BEARER + token));

        testExecutionDriver.execute(context);

        return context.getResponseData();
    }

    */
/** VALID GET ROUTE
     * GET for a multiple choice question through Apigee
     * Can check expected response data
     * @param expectedStatus
     * @param id
     * @param expectedData
     * @param token
     * @return
     * @throws Exception
     *//*

    public AssessmentData getMcQuestionThroughApigeeRoute(Integer expectedStatus,  Long id, AssessmentData expectedData, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("GET");
        context.setRequestHost(apigeeHost);
        context.setRequestPath(apigeeRequestPath + "/" + id);
        context.setExpectedResponseData(expectedData);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.APIGEE_HEADER, Constants.Url.APIGEE_VALUE_PREFIX_BEARER + token));

        testExecutionDriver.execute(context);

        return context.getResponseData();
    }

    */
/** VALID PUT ROUTE
     * Updating a multiple choice question using Apigee Authentication
     * Can check expected response data
     * @param expectedStatus
     * @param requestData
     * @param expectedResponseData
     * @throws Exception
     *//*

    public void updateMultipleChoiceQuestionThroughApigeeRoute(Integer expectedStatus, Long questionId, AssessmentData requestData, AssessmentData expectedResponseData, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("PUT");
        context.setRequestHost(apigeeHost);
        context.setRequestPath(apigeeRequestPath + "/" + questionId);
        context.setRequestData(requestData);
        context.setExpectedResponseData(expectedResponseData);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.APIGEE_HEADER, Constants.Url.APIGEE_VALUE_PREFIX_BEARER + token));

        testExecutionDriver.execute(context);
    }

    */
/** VALID DELETE ROUTE
     * Delete a multiple choice question using Apigee Authentication
     * No check for expected response data
     * @param expectedStatus
     * @param id
     * @throws Exception
     *//*

    public void deleteMcQuestionThroughApigeeRoute(Integer expectedStatus, Long id, String token) throws Exception
    {
        AssessmentContext context = getContext();
        context.setRequestMethod("DELETE");
        context.setRequestHost(apigeeHost);
        context.setRequestPath(apigeeRequestPath + "/" + id);
        context.setExpectedHttpResponseCode(expectedStatus);
        context.getRequestHeaders().add(new BasicHeader(Constants.Url.APIGEE_HEADER, Constants.Url.APIGEE_VALUE_PREFIX_BEARER + token));

        testExecutionDriver.execute(context);
    }


    public List<Validator<AssessmentContext>> getValidators() {
        return validators;
    }

    public void setValidators(List<Validator<AssessmentContext>> validators) {
        this.validators = validators;
    }
}
*/
