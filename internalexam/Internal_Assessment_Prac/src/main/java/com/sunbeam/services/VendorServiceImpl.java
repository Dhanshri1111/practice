package com.sunbeam.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.daos.VendorDao;
import com.sunbeam.entities.Vendor;

@Transactional
@Service
public class VendorServiceImpl {
	@Autowired
	private VendorDao vendordao;
	
	public Vendor findById(int id) {
		Optional<Vendor> vendor = vendordao.findById(id);
		if(vendor.isPresent()) {
			return vendor.get();
		}
		return null;
	}
	
	public List<Vendor> findAll() {
		List<Vendor> vendorlist = vendordao.findAll();
		return vendorlist;
	}
	
	public boolean deleteById(int id) {
		if(vendordao.existsById(id)) {
			vendordao.deleteById(id);
			return true;
		}
		return false;
		
	}
	
	public void updateById(Vendor vendor) {
		vendordao.save(vendor);
	}
	
	public void save(Vendor vendor) { 
		vendordao.save(vendor);
	}
	
	public Vendor findByEmail(String email) {
		Vendor vendor = vendordao.findByEmail(email);
		return vendor;
		
	}
	
 }
