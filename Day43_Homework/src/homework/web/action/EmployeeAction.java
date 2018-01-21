package homework.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import homework.dao.EmployeeDao;
import homework.domain.Employee;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class EmployeeAction extends ActionSupport {
    private EmployeeDao employeeDao = new EmployeeDao();
    private Employee employee = new Employee();
    public String queryAll(){
        List<Employee> employees = employeeDao.queryAll();
        ActionContext.getContext().put("employees",employees);

        return SUCCESS;
    }
    public String queryOne(){
        Employee query = employeeDao.query(employee.getEid());
        ActionContext.getContext().put("employee",query);
        return SUCCESS;
    }
    public String edit(){
        System.out.println("我是edit"+employee);
        employeeDao.update(employee);
        return SUCCESS;
    }
    public String add(){
        employeeDao.add(employee);
        return SUCCESS;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
