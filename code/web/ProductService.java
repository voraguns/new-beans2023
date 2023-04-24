package web;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ProductService {
    
    Brand b;
    
    @RequestMapping("/check")
    String check() {
        return b.name;
    }
    
    @RequestMapping("/get-date")
    Date getDate() {
        return new Date();
    }
}