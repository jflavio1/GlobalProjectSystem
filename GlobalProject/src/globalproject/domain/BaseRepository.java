package globalproject.domain;

import java.util.List;

/**
 *
 * @author Jose Flavio
 * @param <Entity>
 */
public interface BaseRepository<Entity> {
    
    public List<Entity> getAll();
    
}
