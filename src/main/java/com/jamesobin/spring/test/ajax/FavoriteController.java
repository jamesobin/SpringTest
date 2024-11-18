package com.jamesobin.spring.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jamesobin.spring.test.ajax.domain.Favorite;
import com.jamesobin.spring.test.ajax.service.FavoriteService;

@RequestMapping("/ajax/favorite")
@Controller
public class FavoriteController {
	
	@Autowired
	private FavoriteService favoriteService;
	
	@GetMapping("/list")
	public String favoriteList(Model model) {
		List<Favorite> favoriteList = favoriteService.getFavoriteList();
		model.addAttribute("favoriteList", favoriteList);
		
		return "ajax/favorite/favoriteList";
	}
	
	// API
	@ResponseBody
	@PostMapping("/create")
	public Map<String, String> createInput(
			@RequestParam("name") String name
			, @RequestParam("url") String url) {
		int count = favoriteService.addFavorite(name, url);
		
		// 성공, 실패
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) {
			// 성공
			resultMap.put("result", "success");
		} else {
			// 실패
			resultMap.put("result", "fail");
		}
		
		return resultMap;
	}
	
	@GetMapping("/input")
	public String favoriteInput() {
		return "ajax/favorite/favoriteInput";
	}
	
	@ResponseBody
	@PostMapping("/duplicate-url")
	public Map<String, Boolean> isDuplicateUrl(@RequestParam("url") String url) {
		boolean isDuplicate = favoriteService.isDuplicateUrl(url);
		
		// 중복됨 {"isDuplicate":true}
		// 중복 안됨 {"isDuplicate":false}
		Map<String, Boolean> resultMap = new HashMap<>();
		
		if(isDuplicate == true) {
			resultMap.put("isDuplicate", true);
		} else {
			resultMap.put("isDuplicate", false);
		}
		
		return resultMap;
	}
	
}
