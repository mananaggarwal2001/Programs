import java.util.ArrayList;

public class ArrayLists {
    private int[] arraylist=new int[5];
    private ArrayList<String> geogercyitem=new ArrayList<String>();
    public void inputlist(String item){
        geogercyitem.add(item);
    }
    public void displaylists(){
        for(int i=0;i<geogercyitem.size();i++){
            System.out.println(geogercyitem.get(i));
        }
    }
    public void modifylist(int position_number,String Item_name){
        geogercyitem.set(position_number,Item_name);
    }
    public void remove_items(int position){
        geogercyitem.remove(position);
    }
    public boolean searchitem(String Item_name){
        boolean isexist= geogercyitem.contains(Item_name);
        return isexist;
    }
}
