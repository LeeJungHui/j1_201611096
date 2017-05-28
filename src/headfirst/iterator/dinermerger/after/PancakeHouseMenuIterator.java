package headfirst.iterator.dinermerger.after;
import java.util.ArrayList;
import headfirst.iterator.dinermerger.before.MenuItem;
public class PancakeHouseMenuIterator implements iterator{
  private int position = 0;
  private ArrayList<MenuItem> items;
  public PancakeHouseMenuIterator(ArrayList<MenuItem> items){
    this.items = items;
  }
  public boolean hasNext(){
    if(position >= items.size()){
      return false;
    }
    else{
      return true;
    }
  }
  public Object next(){
    MenuItem m = items.get(position);
    position++;
    return m;
  }
}