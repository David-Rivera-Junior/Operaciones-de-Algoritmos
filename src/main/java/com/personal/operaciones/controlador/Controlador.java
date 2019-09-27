package com.personal.operaciones.controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("controlador")
public class Controlador {

	@GetMapping("operacion")
	public String mostrar() {
		return "operacion";
	}

	@PostMapping("operacion")
	public String mate(Model m, HttpServletRequest Request) {

		Double n1 = Double.parseDouble(Request.getParameter("n1"));
		Double n2 = Double.parseDouble(Request.getParameter("n2"));
		String op = Request.getParameter("operacion");

		if (op.equalsIgnoreCase("Sumar")) {
			m.addAttribute("respuesta", (n1+n2));
		} else if (op.equalsIgnoreCase("restar")) {
			m.addAttribute("respuesta", (n1-n2));
		} else if (op.equalsIgnoreCase("multiplicar")) {
			m.addAttribute("respuesta", (n1*n2));
		} else if (op.equalsIgnoreCase("dividir")) {
			m.addAttribute("respuesta", (n1/n2));
		}
		
		return "operacion";
	}

}

		










