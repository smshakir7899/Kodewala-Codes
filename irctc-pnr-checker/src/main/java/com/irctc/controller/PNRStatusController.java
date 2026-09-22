package com.irctc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PNRStatusController
{
	@GetMapping("pnrstatus")
	public String checkPnrStatus(@RequestParam("pnrnumber") String pnrNo)
	{
		System.out.println("Entered PNR Number: " + pnrNo);
		return "pnr-status";
	}
}
