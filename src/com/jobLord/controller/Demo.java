package com.jobLord.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobLord.dao.JobPostDao;
import com.jobLord.dao.SeekerProfileDao;
import com.jobLord.model.Degree;
import com.jobLord.model.JobPost;
import com.jobLord.model.JobType;
import com.jobLord.model.SeekerEducation;
import com.jobLord.model.SeekerExperience;
import com.jobLord.model.SeekerProfile;
import com.jobLord.model.Skill;

public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Skill java;
	Skill python;
	Skill management;
	Skill ml;
	Skill j2ee;
	Skill cook;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// skillDemo();
		// seekerProfileDemo();
		jobPostDemo();
	}

	private void jobPostDemo() {
		JobType type1 = new JobType("software developer");
		JobType type2 = new JobType("UI designer");
		JobType type3 = new JobType("chef");
		JobType type4 = new JobType("HR manager");

		JobPostDao.saveJobType(type1);
		JobPostDao.saveJobType(type2);
		JobPostDao.saveJobType(type3);
		JobPostDao.saveJobType(type4);

		JobPost job1 = new JobPost(new Date(), -1, 300000, 500000, "job requires java developer", true);
		JobPost job2 = new JobPost(new Date(), 550000, -1, -1, "job requires j2ee developer", false);
		JobPost job3 = new JobPost(new Date(), -1, 300000, 500000, "job requires a chef", true);
		JobPost job4 = new JobPost(new Date(), 550000, -1, -1, "job requires hr manager", false);

		Set<Skill> job1Skills = new HashSet<Skill>();
		job1Skills.add(java);
		job1Skills.add(ml);

		Set<Skill> job2Skills = new HashSet<Skill>();
		job2Skills.add(java);
		job2Skills.add(j2ee);

		Set<Skill> job3Skills = new HashSet<Skill>();
		job1Skills.add(cook);

		Set<Skill> job4Skills = new HashSet<Skill>();
		job1Skills.add(java);
		job1Skills.add(management);

		job1.setSkills(job1Skills);
		job2.setSkills(job2Skills);
		job3.setSkills(job3Skills);
		job4.setSkills(job4Skills);

		job1.setJobType(type1);
		job2.setJobType(type2);
		job3.setJobType(type3);
		job4.setJobType(type4);

		JobPostDao.saveJobPost(job1);
		JobPostDao.saveJobPost(job2);
		JobPostDao.saveJobPost(job3);
		JobPostDao.saveJobPost(job4);
	}

	private void seekerProfileDemo() {
		SeekerProfile anmol = new SeekerProfile("anmol", "varshney", "varshneyanmol321@gmail.com", "9012345678",
				new Date(96, 9, 17), 'm');

		SeekerProfile sugandha = new SeekerProfile("sugandha", "saxena", "sugandha.saxena@gmail.com", "9012345670",
				new Date(96, 10, 12), 'f');

		Set<Skill> anmolSkills = new HashSet<Skill>();
		anmolSkills.add(j2ee);
		anmolSkills.add(ml);
		anmolSkills.add(management);
		anmolSkills.add(python);

		Set<Skill> sugandhaSkills = new HashSet<Skill>();
		sugandhaSkills.add(java);
		sugandhaSkills.add(management);
		sugandhaSkills.add(j2ee);

		anmol.setSkills(anmolSkills);
		sugandha.setSkills(sugandhaSkills);

		Degree be = new Degree("B.E.");
		Degree me = new Degree("M.E.");
		Degree doctorate = new Degree("Doctorate");
		Degree mca = new Degree("MCA");

		/*
		 * Set<SeekerEducation> seekerEducationsAnmol = new
		 * HashSet<SeekerEducation>(); seekerEducationsAnmol.add(se1);
		 * seekerEducationsAnmol.add(se2);
		 * 
		 * Set<SeekerEducation> seekerEducationsSugandha = new
		 * HashSet<SeekerEducation>(); seekerEducationsSugandha.add(se3);
		 * seekerEducationsSugandha.add(se4);
		 */

		/*
		 * List<SeekerExperience> exps = new ArrayList<SeekerExperience>();
		 * exps.add(ex1); exps.add(ex2);
		 * 
		 * seeker.setSeekerExperiences(exps); ex1.setSeekerProfile(seeker);
		 * ex2.setSeekerProfile(seeker);
		 */

		SeekerProfileDao.saveDegree(be);
		SeekerProfileDao.saveDegree(me);
		SeekerProfileDao.saveDegree(doctorate);
		SeekerProfileDao.saveDegree(mca);

		SeekerProfileDao.saveSeeker(sugandha);
		SeekerProfileDao.saveSeeker(anmol);

		SeekerEducation se1 = new SeekerEducation(anmol, be, "AKTU", new Date(112, 7, 5), new Date(116, 5, 30), 69.4,
				-1);
		SeekerEducation se2 = new SeekerEducation(anmol, me, "AKTU", new Date(116, 7, 5), new Date(118, 5, 30), -1,
				6.5);
		SeekerEducation se3 = new SeekerEducation(sugandha, me, "MIT", new Date(114, 8, 5), new Date(117, 5, 30), -1,
				10.0);
		SeekerEducation se4 = new SeekerEducation(sugandha, doctorate, "Cambridge", new Date(117, 8, 5),
				new Date(119, 5, 30), -1, 7.8);

		SeekerProfileDao.saveSeekerEducation(se1);
		SeekerProfileDao.saveSeekerEducation(se2);
		SeekerProfileDao.saveSeekerEducation(se3);
		SeekerProfileDao.saveSeekerEducation(se4);

		SeekerExperience ex1 = new SeekerExperience(anmol, new Date(112, 9, 10), new Date(114, 10, 13), "intern",
				"ABES", "gzb", "UP", "India", null, false);
		SeekerExperience ex2 = new SeekerExperience(sugandha, new Date(115, 11, 17), null, "developer", "CEBS", "noida",
				"UP", "India", "hard worker", false);

		SeekerProfileDao.saveSeekerExperience(ex1);
		SeekerProfileDao.saveSeekerExperience(ex2);

	}

	private void skillDemo() {
		java = new Skill("java");
		python = new Skill("python");
		management = new Skill("management");
		ml = new Skill("machine learning");
		j2ee = new Skill("j2ee");
		cook = new Skill("cook");

		SeekerProfileDao.saveSkill(java);
		SeekerProfileDao.saveSkill(python);
		SeekerProfileDao.saveSkill(management);
		SeekerProfileDao.saveSkill(ml);
		SeekerProfileDao.saveSkill(j2ee);
		SeekerProfileDao.saveSkill(cook);

	}
}
