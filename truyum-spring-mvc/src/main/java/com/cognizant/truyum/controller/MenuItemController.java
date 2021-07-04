package com.cognizant.truyum.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;

import ch.qos.logback.classic.Logger;
import java.util.*;
@Controller
public class MenuItemController {
  
	@Autowired
	private MenuItemService menuItemService;
	
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MenuItemController.class);
	
	@GetMapping(value="/show-menu-listadmin")
	public String showMenuItemListAdmin(ModelMap model) {
		LOGGER.info("Start");
		List<MenuItem> list = new ArrayList<MenuItem>();
		list = menuItemService.getMenuItemListAdmin();
		model.addAttribute("list",list);
	    LOGGER.info("End");
		return "menu-item-list-admin";
		
		
	}
}
