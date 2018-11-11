package globalproject.data;

import globalproject.domain.User;
import globalproject.domain.Request;

/**
 *
 * @author Jose Flavio
 */
public final class RequestSingleton {
    
    private static RequestSingleton requestSingleton;
    private ArrayList<Request> requests = new ArrayList<>();

    public RequestSingleton() {
    }
    
    public static RequestSingleton getCurrentSingletonRequests(){
        if(requestSingleton == null){
            requestSingleton = new RequestSingleton();
        }
        return requestSingleton;
    }

    public void addRequest(Request request){
    	requests.add(request);
    }

    public ArrayList<Request> getAllRequests() {
    	return this.requests;
    }

}
