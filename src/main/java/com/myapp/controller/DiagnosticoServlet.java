/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myapp.services.DiagnosticoService;
import com.myapp.to.Antecedentes;
import com.myapp.to.EnfermedadViral;
import com.myapp.to.Persona;

/**
 * Servlet implementation class DiagnosticoServlet
 */
public class DiagnosticoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiagnosticoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Persona c = llamaDiagnostico(request, response);
		DiagnosticoService service = new DiagnosticoService();
		c = service.getDiagnostico(c);
		
		request.setAttribute("problema", c.getProblema());
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	private Persona llamaDiagnostico(HttpServletRequest request, HttpServletResponse response) {
		String esniño = request.getParameter("esniño");
		String tienefiebre = request.getParameter("tienefiebre");
		String tienetos = request.getParameter("tienetos");
		String tienedolorgarganta = request.getParameter("tienedolorgarganta");
		String tieneescalofrio = request.getParameter("tieneescalofrio");
		String presentoinfarto = request.getParameter("presentoinfarto");
		String esunfumador = request.getParameter("esunfumador");
                String esunalergico = request.getParameter("esunalergico");
		
       
                
                
		Antecedentes antecedentes = new Antecedentes();
		Persona persona = new Persona();
		EnfermedadViral enfermedadviral = new EnfermedadViral();
		
		if (esniño != null && esniño != "") {
                        persona.setEsniño(filtraParametro(esniño));
                     
		}
		
		if (tienefiebre != null && tienefiebre != "") {
			enfermedadviral.setFiebre(filtraParametro(tienefiebre));
                  
		}
		
		if (tienetos != null && tienetos != "") {
			enfermedadviral.setTos(filtraParametro(tienetos));
		}
		
		if (tienedolorgarganta != null && tienedolorgarganta != "") {
			enfermedadviral.setDolorgarganta(filtraParametro(tienedolorgarganta));
		}
		
		if (tieneescalofrio != null && tieneescalofrio != "") {
			enfermedadviral.setEscalofrio(filtraParametro(tieneescalofrio));
		}
		
		if (presentoinfarto != null && presentoinfarto != "") {
			antecedentes.setPresentoinfarto(filtraParametro(presentoinfarto));
		}
                
                if (esunfumador != null && esunfumador != "") {
			antecedentes.setEsfumador(filtraParametro(esunfumador));
		}
                if (esunalergico != null && esunalergico != "") {
			antecedentes.setEsalergico(filtraParametro(esunalergico));
		}
		
	
                persona.setAnteced(antecedentes);
		persona.setEnfviral(enfermedadviral);
		return persona;
	}

	private boolean filtraParametro(String parametro) {
		if (parametro.equals("Si")) {
			return true;
		}
		return false;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
