package bo.edu.ucb.ingsoft.categ;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;




@RestController
public class Cates{
    List<Cate> cateList = new ArrayList<>();

    @GetMapping(path="/cate", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Cate> listAll() {
        return cateList;
    }

    @PostMapping(path = "/cate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cate listAll(@RequestBody Cate cates) {
        String tiempo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        cates.setLast((tiempo));
        return cates;
    }
    
    
    @DeleteMapping(path="/cate/{id}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cate deleteOne(@RequestBody Cate cates) {
        cateList.remove(cates.getCategoryid());
        return cates;
    }

    @PutMapping(path="/cate/{id}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cate PutOne(@RequestBody Cate cates, @PathVariable Integer id) {
       
            cates.setNamec(cates.getNamec());
            String tiempo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
            cates.setLast((tiempo));
            return cates; 
    }



}