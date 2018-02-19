package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myapp.domain.Product;
import com.myapp.form.ProductForm;

import java.math.BigDecimal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@Controller
public class ProductController {
	
	private static final Log logger = LogFactory.getLog(ProductController.class);
	
	@RequestMapping("/input-product")
	public String inputProduct() {
		logger.info("inputProduct called");
		return "ProductForm";
	}
	
	@RequestMapping("/save-product")
	public String saveProduct(ProductForm productForm, Model model) {
		logger.info("saveProduct called");
		
		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		try {
			product.setPrice(new BigDecimal(productForm.getPrice()));
		} catch (NumberFormatException e) {
			
		}
		model.addAttribute("product",product);
		return "ProductDetails";
	}
}
