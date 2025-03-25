import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RestOperations {
    public static void main(String[] args) {
        // Create EntityManagerFactory and EntityManager
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
        EntityManager entityManager = factory.createEntityManager();

        // Fetch data from "employees" table
        Query query = entityManager.createQuery("SELECT e FROM Employees e"); // Corrected query
        List<Employees> list = query.getResultList(); // Use getResultList() instead of list()

        // Loop through and print names
        for (Employees e : list) {  // Use Employees instead of Employee
            System.out.println(e.getName());
        }

        // Closing resources
        entityManager.close();
        factory.close();
    }
}
