package be.blindbadger.repository;

import be.blindbadger.Patient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Map;

public class PatientRepositoryImpl
    implements PatientRepository {

    private final EntityManagerFactory emf;

    public PatientRepositoryImpl(EntityManagerFactory entityManagerFactory) {
        this.emf = entityManagerFactory;
    }


    @Override
    public Patient savePatient(Patient patient) {
        EntityManager em = emf.createEntityManager();
        em.persist(patient);

        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();

        return patient;
    }

    @Override
    public Patient readPatient(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Patient.class, id);
    }

    @Override
    public boolean deletePatient(Integer id) {
        EntityManager em = emf.createEntityManager();
        Patient p = em.find(Patient.class, id);

        if (p == null) return false;
        else {
            em.remove(p);
            em.getTransaction().begin();
            em.getTransaction().commit();
            return true;
        }
    }

    @Override
    public Patient readPatient(Patient example) {
        return null;
    }

    @Override
    public boolean deletePatient(Patient patient) {
        return false;
    }

    @Override
    public Patient readPatient(Map<String, String> predicates) {
        // name contains jan

        // SELECT * FROM patient_table WHERE patientname LIKE '%jan%';

        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT p FROM Patient p");
        List result = query.getResultList();

        TypedQuery<Patient> patientTypedQuery =
                em.createQuery("SELECT p FROM Patient p", Patient.class);
        List<Patient> list = patientTypedQuery.getResultList();
        


        return null;
    }
}











