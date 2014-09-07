/*
package PearsonSampleCode;

import com.google.inject.Inject;
import com.pearson.qa.assessments.ziggyfw.contexts.AssessmentContext;
import com.pearson.qa.assessments.ziggyfw.datastructures.LinksData;
import com.pearson.qa.assessments.ziggyfw.datastructures.SelfData;
import com.pearson.qa.common.ziggyfw.executors.Executor;
import com.pearson.qa.common.ziggyfw.http.executors.HttpExecutor;
import com.pearson.qa.common.ziggyfw.validators.Validator;
import org.apache.http.entity.StringEntity;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;
import java.util.List;

public class AssessmentExecutor<T extends AssessmentContext> implements Executor<T>{

    private List<Validator<T>> validators;
    private HttpExecutor<T> httpExecutor;
    private List<T> responseData;

    public AssessmentExecutor()
    {
        validators = new ArrayList<>();
    }

    public AssessmentExecutor(List<Validator<T>> validators,
                              HttpExecutor<T> httpExecutor)
    {
        this.validators = validators;
        this.httpExecutor = httpExecutor;
    }


    @Override
    public List<Validator<T>> getValidators() {
        List<Validator<T>> allValidators = new ArrayList<>();
        allValidators.addAll(this.validators);
        allValidators.addAll(this.httpExecutor.getValidators());
        return allValidators;
    }

    @Override
    public boolean canExecute(T context) {
        return (context != null) && (httpExecutor != null) && httpExecutor.canExecute(context);
    }


    @Override
    public void execute(T context) throws Exception {
        //Prepare the request body to the server.  (String)
        if(context.getRequestMethod().equals("PUT") || context.getRequestMethod().equals("POST"))
        {

            //This if statement is needed as to publish a question, it is a put with NO request body
            if(context.getRequestData() != null)
            {
                //For Unicode conversion accuracy, set Entity, then set request body
                String requestDataRaw = context.getRequestData().toString();
                context.setRequestHttpEntity(new StringEntity(requestDataRaw, "UTF-8"));
                context.setRequestBody(context.getRequestData().toJSONString());
            }
        }

        //Execute by sending to server
        this.httpExecutor.execute(context);

        if(context.getReturnedResponseBody() != null)
        {
            //Set return response if no error
            JSONParser parser = new JSONParser();
            JSONObject parsedObject = (JSONObject) parser.parse(context.getReturnedResponseBody());

            //Add the ID to the self link here
            if(context.getExpectedResponseData() != null)
            {
                //Extract Response
                AssessmentData expectedResponse = context.getExpectedResponseData();

                if(expectedResponse.getLinksData() != null)
                {
                    //Set up the linksData
                    LinksData linksData = expectedResponse.getLinksData();

                    //Set up the selfData and initialize
                    SelfData selfData = linksData.getSelf();
                    selfData.setHref("");

                    //Get href then append with question ID
                    StringBuilder sb = new StringBuilder(selfData.getHref());

                    //Append with the correct path for the self link
                    sb.append(context.getRequestScheme());
                    sb.append("://");
                    sb.append(context.getRequestHost());
                    sb.append("/questions/");
                    sb.append(parsedObject.get("questionId").toString());

                    // Put back into expected response data
                    selfData.setHref(sb.toString());
                }
            }
            if(!parsedObject.containsKey("errorId"))
            {
              context.setResponseData(new AssessmentData(parsedObject));
            }
        }
    }

    @Inject
    public void setValidators(List<Validator<AssessmentContext>> validators)
    {
        if (validators != null)
        {
            this.validators.clear();
            for (Validator<AssessmentContext> validator : validators)
                this.validators.add((Validator<T>) validator);
        }
    }

    @Inject
    public void setHttpExecutor(HttpExecutor<T> httpExecutor)
    {
        this.httpExecutor = httpExecutor;
    }

    public List<T> getResponseData() {
        return responseData;
    }

    public void setResponseData(List<T> responseData) {
        this.responseData = responseData;
    }
}
*/
