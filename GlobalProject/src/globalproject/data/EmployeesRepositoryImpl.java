package globalproject.data;

import globalproject.domain.Employee;
import globalproject.domain.EmployeesRepository;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose flAVIO
 */
public class EmployeesRepositoryImpl implements EmployeesRepository{

    @Override
    public List<Employee> getAll() {
        
        List<Employee> list = new ArrayList<>();
        
        list.add(new Employee("0", "Steve", "20", "Storage"));
        list.add(new Employee("1", "Mario", "25", "RedHat"));
        list.add(new Employee("2", "Lety", "30", "SAN"));
        list.add(new Employee("3", "Rose", "24", "BackUp"));
        
        return list;
    }
    
}
