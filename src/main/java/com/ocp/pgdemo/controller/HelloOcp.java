package com.ocp.pgdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocp.pgdemo.model.RspModel;

@RestController
public class HelloOcp {
	@GetMapping("/hello")
	public String hello() {
		return "Hello() for oc exercise 2!_update";
	}

	@GetMapping("/api/v1/hello")
	public ResponseEntity<RspModel> helloRes(){
		RspModel rsp = new RspModel();
		rsp.setCode(200);
		rsp.setData("HelloRes() for oc exercise 2_update!");
		
		return new ResponseEntity<RspModel>(rsp, HttpStatus.OK);
		
	}

}
