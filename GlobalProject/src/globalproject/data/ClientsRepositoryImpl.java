package globalproject.data;

import globalproject.domain.Cliente;
import globalproject.domain.ClientsRepository;
import globalproject.domain.Employee;
import globalproject.domain.EmployeesRepository;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose flAVIO
 */
public class ClientsRepositoryImpl implements ClientsRepository{

    @Override
    public List<Cliente> getAll() {
        
        List<Cliente> list = new ArrayList<>();
        
        list.add(new Cliente("0", "Steve", "Storage"));
        list.add(new Cliente("1", "Mario", "RedHat"));
        list.add(new Cliente("2", "Lety",  "SAN"));
        list.add(new Cliente("3", "Rose", "BackUp"));
        
        return list;
    }
    
}
