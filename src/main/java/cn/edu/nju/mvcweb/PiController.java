package cn.edu.nju.mvcweb;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PiController{

    private PiCaculator caculator;

    public PiController(PiCaculator caculator){
        this.caculator=caculator;
    }

    @GetMapping("/pi")
    ResponseEntity<PiResult> pi(){
        long startTime=System.currentTimeMillis();
        double pi=this.caculator.calculatePi(1_000_000);
        long endTime=System.currentTimeMillis();
        return ResponseEntity.ok(new PiResult(pi, Long.valueOf(endTime-startTime)));
    }
}