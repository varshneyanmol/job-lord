package com.jobLord.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jobLord.model.JobPost;
import com.jobLord.model.JobType;
import com.jobLord.util.HibernateUtil;

public class JobPostDao {
	public static int saveJobPost(JobPost jobPost) {
		int id = -1;

		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		id = (Integer) session.save(jobPost);
		tx.commit();
		session.close();

		return id;
	}

	public static int saveJobType(JobType jobType) {
		int id = -1;

		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		id = (Integer) session.save(jobType);
		tx.commit();
		session.close();

		return id;
	}

}
