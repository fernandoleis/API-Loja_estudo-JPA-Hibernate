import br.com.caelum.JpaConfigurator;
import br.com.caelum.model.Produto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class TestaClasse {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfigurator.class);
        EntityManagerFactory entityManagerFactory = ctx.getBean(EntityManagerFactory.class);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityManager entityManager2 = entityManagerFactory.createEntityManager();
        Produto produto = entityManager.find(Produto.class, 1);
        Produto produto2 = entityManager2.find(Produto.class, 1);
        System.out.println("produto = " + produto.getNome());
        System.out.println("produto2 = " + produto2.getNome());
        entityManager.close();

    }
}
