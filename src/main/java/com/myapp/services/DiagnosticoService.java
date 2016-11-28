/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.services;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


import com.myapp.to.Persona;

public class DiagnosticoService {
	
	public Persona getDiagnostico(Persona c){
		Persona temp = c;
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in
			// kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSession = kContainer.newKieSession("ComputerKS");
			

			
			kSession.insert(temp);
			kSession.insert(temp.getAnteced());
			kSession.insert(temp.getEnfviral());
			
			kSession.fireAllRules();

	
                        
			System.out.println(temp.getProblema());
		} catch (Throwable t) {
			t.printStackTrace();
		}
		
		return temp;
	}
}
