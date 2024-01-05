package com.spring.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entities.Schedule;

@Repository
public class ScheduleDAOImpl implements ScheduleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public Schedule create(Schedule schedule) {
		try(Session session = sessionFactory.openSession()) {
			
			session.save(schedule);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return schedule;
	}

	@Override
	public Schedule update(Schedule schedule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	@Override
	public List<Schedule> findAll(Integer pageNum, Integer pageSize) {
		try(Session session = sessionFactory.openSession()) {
			
			TypedQuery<Schedule> query = session.createQuery("SELECT s FROM Schedule s", Schedule.class);
			query.setFirstResult((pageNum - 1)* pageSize);
			query.setMaxResults(pageSize);
			
			return query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
