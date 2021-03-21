import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Tree implements Map {

    public TreeMap<Object,Object> Arbolito;

    public Tree() { Arbolito = new TreeMap<Object, Object>();}

    @Override
    public int size() {
        return Arbolito.size();
    }

    @Override
    public boolean isEmpty() {
        return Arbolito.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return Arbolito.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return Arbolito.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return Arbolito.get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        return Arbolito.put(key,value);
    }

    @Override
    public Object remove(Object key) {
        return Arbolito.remove(key);
    }

    @Override
    public void putAll(Map m) {
        Arbolito.putAll(m);
    }

    @Override
    public void clear() {
        Arbolito.clear();
    }

    @Override
    public Set keySet() {
        return Arbolito.keySet();
    }

    @Override
    public Collection values() {
        return Arbolito.values();
    }

    @Override
    public Set<Entry<Object,Object>> entrySet() {
        return Arbolito.entrySet();
    }
}
