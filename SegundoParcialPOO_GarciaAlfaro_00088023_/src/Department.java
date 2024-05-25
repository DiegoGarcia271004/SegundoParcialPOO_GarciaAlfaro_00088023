import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.Iterator;

public class Department implements EmpleadoTech{

    private String dpto;
    private ArrayList<EmpleadoTech> employees;

    public void addEmployee(EmpleadoTech slave){
        if(!findEmployee(slave.getName())) {
            employees.add(slave);
        }

    }

    public void removeEmployee(Employee slave){
        if(findEmployee(slave.getName())){
            employees.remove(getEmployee(slave.getName()));
        }
    }

    public boolean findEmployee(String name){
        Iterator<EmpleadoTech> iter = employees.iterator();
        boolean exist = false;
        while(iter.hasNext()){
            if(iter.next().getName().equals(name)){
                exist = true;
                break;
            }
        }
        return exist;
    }

    public EmpleadoTech getEmployee(String name){
        Iterator<EmpleadoTech> iter = employees.iterator();
        EmpleadoTech employee = null;
        while(iter.hasNext()){
            employee = iter.next();
            if(employee.getName().equals(name)){
                break;
            }
        }
        return employee;

    }

    @Override
    public void work() {

    }

    @Override
    public String getName() {
        return getName();
    }
}
