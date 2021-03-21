import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


class Hash implements Map {

    public HashMap<Object,Object> Mapita;

    public Hash(){
        Mapita = new HashMap<Object,Object>();
    }

    public int size(){
        return Mapita.size();
    }

    @Override
    public boolean isEmpty() {
        return Mapita.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return Mapita.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return Mapita.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return Mapita.get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        return Mapita.put(key,value);
    }

    @Override
    public Object remove(Object key) {
        return Mapita.remove(key);
    }

    @Override
    public void putAll(Map m) {
        Mapita.putAll(m);
    }

    @Override
    public void clear() {
        Mapita.clear();
    }

    @Override
    public Set keySet() {
        return Mapita.keySet();
    }

    @Override
    public Collection values() {
        return Mapita.values();
    }

    @Override
    public Set<Entry<Object,Object>> entrySet() {
        return Mapita.entrySet();
    }

}
