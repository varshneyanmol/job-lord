package com.jobLord.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobLord.dao.SeekerProfileDao;
import com.jobLord.model.Degree;
import com.jobLord.model.SeekerEducation;
import com.jobLord.model.SeekerProfile;
import com.jobLord.model.Skill;

public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SeekerProfile anmol = new SeekerProfile("anmol", "varshney", "varshneyanmol321@gmail.com", "9012345678",
				new Date(1996, 10, 17), 'm');

		SeekerProfile sugandha = new SeekerProfile("sugandha", "saxena", "sugandha.saxena@gmail.com", "9012345670",
				new Date(1996, 11, 17), 'f');

		Skill java = new Skill("java");
		Skill python = new Skill("python");
		Skill c = new Skill("C language");
		Skill ml = new Skill("machine learning");
		Skill j2ee = new Skill("j2ee");

		Set<Skill> anmolSkills = new HashSet<Skill>();
		anmolSkills.add(j2ee);
		anmolSkills.add(ml);
		anmolSkills.add(c);
		anmolSkills.add(python);

		Set<Skill> sugandhaSkills = new HashSet<Skill>();
		sugandhaSkills.add(java);
		sugandhaSkills.add(c);
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
		 * SeekerExperience ex1 = new SeekerExperience(new Date(2012, 9, 10),
		 * new Date(2014, 10, 13), "intern", "ABES", "gzb", "UP", "India", null,
		 * false); SeekerExperience ex2 = new SeekerExperience(new Date(2015,
		 * 12, 17), null, "developer", "CEBS", "noida", "UP", "India",
		 * "hard worker", false);
		 * 
		 * List<SeekerExperience> exps = new ArrayList<SeekerExperience>();
		 * exps.add(ex1); exps.add(ex2);
		 * 
		 * seeker.setSeekerExperiences(exps); ex1.setSeekerProfile(seeker);
		 * ex2.setSeekerProfile(seeker);
		 */

		SeekerProfileDao.saveSkill(java);
		SeekerProfileDao.saveSkill(python);
		SeekerProfileDao.saveSkill(c);
		SeekerProfileDao.saveSkill(ml);
		SeekerProfileDao.saveSkill(j2ee);

		SeekerProfileDao.saveDegree(be);
		SeekerProfileDao.saveDegree(me);
		SeekerProfileDao.saveDegree(doctorate);
		SeekerProfileDao.saveDegree(mca);

		SeekerProfileDao.saveSeeker(sugandha);
		SeekerProfileDao.saveSeeker(anmol);

		SeekerEducation se1 = new SeekerEducation(anmol, be, "AKTU", new Date(2012, 8, 5), new Date(2016, 5, 30), 69.4,
				-1);
		SeekerEducation se2 = new SeekerEducation(anmol, me, "AKTU", new Date(2016, 8, 5), new Date(2018, 5, 30), -1,
				6.5);
		SeekerEducation se3 = new SeekerEducation(sugandha, me, "MIT", new Date(2014, 8, 5), new Date(2017, 5, 30), -1,
				10.0);
		SeekerEducation se4 = new SeekerEducation(sugandha, doctorate, "Cambridge", new Date(2017, 8, 5),
				new Date(2019, 5, 30), -1, 7.8);

		SeekerProfileDao.saveSeekerEducation(se1);
		SeekerProfileDao.saveSeekerEducation(se2);
		SeekerProfileDao.saveSeekerEducation(se3);
		SeekerProfileDao.saveSeekerEducation(se4);

	}

}
