package homework.dao;

import homework.domain.Employee;
import homework.domain.User;
import homework.util.HibernateUtil;
import org.hibernate.Query;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EmployeeDao {
   @Test
    public List<Employee>  queryAll(){
       List<Employee> employees = HibernateUtil.handle(session -> {
           Query query = session.createQuery("from " + Employee.class.getName());
           List<Employee> list = query.list();

//           for (Employee employee : list) {
//               System.out.println(employee);
//           }
           return list;
       });
       return employees;
    }
    public Employee query(int eid){
        Employee emp = HibernateUtil.handle(session -> {
            Employee employee = session.get(Employee.class, eid);


            return employee;
        });
        return emp;
    }
    public void add(Employee employee){
        HibernateUtil.handle(session -> {
            System.out.println(employee+"employdao");
            session.save(employee);
            return employee;
        });
    }
    public  void  update(Employee employee){
        HibernateUtil.handle(session -> {
//            Employee emp = session.get(Employee.class, employee.getEid());
//           emp.setName(employee.getName());
//            emp.setAge(employee.getAge());
//            emp.setDepartment(employee.getDepartment());
//            emp.setHiredate(employee.getHiredate());
//            emp.setAddress(employee.getAddress());
//            emp.setPhone(employee.getPhone());
//            System.out.println("我是update"+emp);
            session.update(employee);
            return employee;
        });
    }







}
