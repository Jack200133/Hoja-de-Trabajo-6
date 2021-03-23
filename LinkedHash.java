import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class LinkedHash implements Map {

  public LinkedHashMap<Object,Object> linkeado;

  public LinkedHash() { linkeado = new LinkedHashMap<Object,Object>();  }

  @Override
  public int size() {
      return linkeado.size();
  }

  @Override
  public boolean isEmpty() {
      return linkeado.isEmpty();
  }

  @Override
  public boolean containsKey(Object key) {
      return linkeado.containsKey(key);
  }

  @Override
  public boolean containsValue(Object value) {
      return linkeado.containsValue(value);
  }

  @Override
  public Object get(Object key) {
    
      return linkeado.get(key);
  }

  @Override
  public Object put(Object key, Object value) {
      return linkeado.put(key,value);
  }

  @Override
  public Object remove(Object key) {
      return linkeado.remove(key);
  }

  @Override
  public void putAll(Map m) {
      linkeado.putAll(m);
  }

  @Override
  public void clear() {
      linkeado.clear();
  }

  @Override
  public Set keySet() {
      return linkeado.keySet();
  }

  @Override
  public Collection values() {
      return linkeado.values();
  }

  @Override
  public Set<Entry<Object,Object>> entrySet() {
      return linkeado.entrySet();
  }
}
