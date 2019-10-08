package NexDB;

import java.io.Serializable;

import java.util.List;
import java.util.Scanner;

import model.PokeMon;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@SuppressWarnings("unchecked")
public class PokemonAbstractDAO<E> implements PokemonDAO<E> {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pokemon");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
    Scanner sc = new Scanner(System.in);



    @Autowired
    private SessionFactory sessionFactory;

    public PokemonAbstractDAO() {
    }

    @Override
    public Serializable save(PokeMon entity) {
        tx.begin();
        em.persist(entity);
        tx.commit();
        System.out.println("Done Saved");
        return null;
    }

    @Override
    public void saveOrUpdate(PokeMon entity) {

    }

    @Override
    public void delete(PokeMon entity) {
        System.out.println("Enter number to delete");
        int id = sc.nextInt();
        TypedQuery<PokeMon> typedQuery = (TypedQuery<PokeMon>) em.createNativeQuery("DELETE FROM pokemon AS p WHERE p.ID="+id, PokeMon.class);
        PokeMon pokeMon= typedQuery.getSingleResult();
        tx.begin();
        em.persist(pokeMon);
        tx.commit();
        System.out.println("Deleted");
            }

    @Override
    public List<PokeMon> findAll() {
        TypedQuery<PokeMon> typedQuery = (TypedQuery<PokeMon>) em.createNativeQuery("SELECT * FROM pokemon", PokeMon.class);
        typedQuery.getResultList().forEach(pokeMon -> System.out.println(pokeMon.getPokemonName()));
        return null;
    }

    @Override
    public List<PokeMon> findAllByExample(PokeMon entity) {
        return null;
    }

    @Override
    public PokeMon findById(Serializable id) {
        return null;
    }


    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }



    @Override
    public void deleteAll() {
        List<E> entities = (List<E>) findAll();
        for (E entity : entities) {
            getSession().delete(entity);
        }
    }



    @Override
    public void clear() {
        getSession().clear();

    }

    @Override
    public void flush() {
        getSession().flush();

    }

    @Override
    public E addPokemon(PokeMon pokeMon) {
        tx.begin();
        em.persist(pokeMon);
        tx.commit();
        System.out.println("Done 1");

        return null;
    }

    @Override
    public PokeMon giveDetails() {
        TypedQuery<PokeMon> typedQuery = (TypedQuery<PokeMon>) em.createNativeQuery("SELECT * FROM pokemon", PokeMon.class);
        typedQuery.getResultList().forEach(pokeMon -> System.out.println(pokeMon));

        return null;
    }

    public void giveNames() {
        TypedQuery<PokeMon> typedQuery = (TypedQuery<PokeMon>) em.createNativeQuery("SELECT * FROM pokemon", PokeMon.class);
        typedQuery.getResultList().forEach(pokeMon -> System.out.println(pokeMon.getPokemonName()));
    }

    public void giveType() {
        TypedQuery<PokeMon> typedQuery = (TypedQuery<PokeMon>) em.createNativeQuery("SELECT * FROM pokemon", PokeMon.class);
        typedQuery.getResultList().forEach(pokeMon -> System.out.println(pokeMon.getPokemonType()));
    }

    public void getPokemonOne() {
        System.out.println("Enter number to show Pokemon");
        int id = sc.nextInt();
        TypedQuery<PokeMon> typedQuery = (TypedQuery<PokeMon>) em.createNativeQuery("SELECT * FROM pokemon AS p WHERE p.ID="+id, PokeMon.class);
        PokeMon pokeMon= typedQuery.getSingleResult();
        System.out.println(pokeMon);
    }


    public PokeMon returnPokemon(){
        System.out.println("Enter number to del Pokemon");
        int id = sc.nextInt();
        TypedQuery<PokeMon> typedQuery = (TypedQuery<PokeMon>) em.createNativeQuery("SELECT * FROM pokemon AS p WHERE p.ID="+id, PokeMon.class);
        return typedQuery.getSingleResult();
    }
}