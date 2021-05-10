package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.entities.concretes.Position;
import kodlamaio.hrms.business.abstracts.PositionService;

@RestController
@RequestMapping("/api/positions")

public class PositionsController {
	
private PositionService positionService;
	
	@Autowired

	public PositionsController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	@GetMapping("/getall")
	@ResponseBody
	public List<Position> getAll(){
		return this.positionService.getAll();
	}

}
