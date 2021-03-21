
import java.util.Map;


public class MapFactory {

    public Map getMAP(String entry) {
        switch (entry) {
            //regresa un HashMap
            case "HM": 
              return new Hash();
  
            //regresa un TreeMap
            case "TM" :
              return new Tree();
          
            //regresa un LinkedHashMap
            default: 
              return new LinkedHash();
           
        }
    }
}
