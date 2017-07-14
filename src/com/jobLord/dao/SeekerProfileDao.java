package com.jobLord.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jobLord.model.SeekerProfile;
import com.jobLord.model.Skill;
import com.jobLord.util.HibernateUtil;

public class SeekerProfileDao {
	public static int saveSeeker(SeekerProfile seeker) {
		int id = -1;

		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		id = (Integer) session.save(seeker);
		tx.commit();
		session.close();

		return id;
	}

	public static int saveSkill(Skill skill) {
		int id = -1;

		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		id = (Integer) session.save(skill);
		tx.commit();
		session.close();

		return id;
	}
}
