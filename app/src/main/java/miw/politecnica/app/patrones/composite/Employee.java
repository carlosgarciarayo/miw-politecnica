package miw.politecnica.app.patrones.composite;

import java.util.List;

public interface Employee {

    //añadir

    String getName();

    void add(Employee e);

    void remove(Employee e);

    List<Employee> getEmployees();

    int calculatePoints();

    //eliminar

    //listar

}
