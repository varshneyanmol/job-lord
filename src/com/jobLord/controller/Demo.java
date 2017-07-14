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

		SeekerProfileDao.saveSeeker(sugandha);
		SeekerProfileDao.saveSeeker(anmol);
	}

}
