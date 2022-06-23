package sky.pro.hw28streamapioptionalhelp.model;

import java.util.Map;
import java.util.Set;

public interface DepartmentService {

    Employee findEmployeeWithMaxSalary(int department);

    Employee findEmployeeWithMinSalary(int department);

    Map<Integer, Set<Employee>> departmentEmployeeList(int department);

    Map<Integer, Set<Employee>> allDepartmentsEmployeeList();

}
