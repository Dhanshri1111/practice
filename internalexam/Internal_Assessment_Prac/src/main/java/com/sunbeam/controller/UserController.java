package com.sunbeam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunbeam.entities.Vendor;
import com.sunbeam.models.Credentials;
import com.sunbeam.services.VendorServiceImpl;

@Controller
public class UserController {
	@Autowired
	private VendorServiceImpl vendorservice;
	@RequestMapping("/login")
	public String login() {
		return "login";
		
	}
	
	@RequestMapping("/authenticate")
	public String authenticate(Credentials cred, Model model,HttpSession session) {
		String email = cred.getEmail();
		String password = cred.getPassword();
		Vendor vendor = vendorservice.findByEmail(email);
		System.out.println(vendor.toString());
		if(vendor!=null && password.equals(vendor.getPassword()) && vendor.getRole().equals("vendor")) {
			session.setAttribute("id", vendor.getId());
			return "redirect:details";
		}
		else if(vendor!=null && password.equals(vendor.getPassword()) && vendor.getRole().equals("admin")) {
			session.setAttribute("id", vendor.getId());
			System.out.println(session.getAttribute("id"));
			return "redirect:vendorspagelist";
		}
		return "redirect:login";
		
	}
	
	@RequestMapping("details")
	public String details(Model model,HttpSession session) {
		int id = (int) session.getAttribute("id");
		Vendor vendor = vendorservice.findById(id);
		model.addAttribute("vendor", vendor);
		return "details";
		
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logout";
		
	}
}
