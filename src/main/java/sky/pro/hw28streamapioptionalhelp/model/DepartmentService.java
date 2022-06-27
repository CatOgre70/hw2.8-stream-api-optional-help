package sky.pro.hw28streamapioptionalhelp.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface DepartmentService {

    Employee findEmployeeWithMaxSalary(int department);

    Employee findEmployeeWithMinSalary(int department);

    List<Employee> departmentEmployeeList(int department);

    Map<Integer, Set<Employee>> allDepartmentsEmployeeList();

}
