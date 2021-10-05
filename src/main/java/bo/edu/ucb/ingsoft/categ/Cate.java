package bo.edu.ucb.ingsoft.categ;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/*
category_id
tinyint(3) unsigned
NO
PRI
NULL
auto_increment

name
varchar(25)
NO
NULL

last_update
timestamp
NO
current_timestamp()
on update current_timestamp()

*/ 
@Entity(name="category")

public class Cate {

    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryid;

    @Column(name="name")
    private String namec;

    
    @Column(name="last_update")
    private String last;

    public Cate(){

    }
    public Integer getCategoryid() {
        return categoryid;
    }
     public String getLast() {
         return last;
     }
     public String getNamec() {
         return namec;
     }

     public void setCategoryid(Integer categoryid) {
         this.categoryid = categoryid;
     }

     public void setLast(String timeStamp) {
         this.last = timeStamp;
     }
     public void setNamec(String namec) {
         this.namec = namec;
     }







  
  

}