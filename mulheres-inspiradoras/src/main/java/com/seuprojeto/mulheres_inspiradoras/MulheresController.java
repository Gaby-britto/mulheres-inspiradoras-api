package com.seuprojeto.mulheres_inspiradoras;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/mulheres")
public class MulheresController {

    private final MulheresService mulheresService;
    
    public MulheresController(MulheresService mulheresService) {
    	this.mulheresService = mulheresService;
    }
    
    @GetMapping
    public List<Mulher> getMulheres(){
    	return mulheresService.listarMulheres();
    }
    
}
