package globalproject.data.callback;

/**
 *
 * @author Jose Flavio
 */
public interface ResponseCallback<T> {
    
    public void onSuccess(T obj);
    
    public void onFailure(int errorCode);
    
}
