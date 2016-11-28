/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.to;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class PersonaTest {
	public static final void main(String[] args) {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in
			// kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSession = kContainer.newKieSession("ComputerKS");

			Persona com = new Persona();
                        Antecedentes aa = new Antecedentes();
			EnfermedadViral mo = new EnfermedadViral();
			
		
			com.setEnfviral(mo);
                        com.setAnteced(aa);
			
		
		
			kSession.insert(com);
			kSession.insert(mo);
			kSession.insert(aa);
			
			kSession.fireAllRules();
			
			System.out.println(com.getProblema());

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
