package GeekBrains;

import java.util.ArrayList;
import java.util.List;

public  class Box<T extends Fruit> {
   public  List<T> box;

    public Box(int length) {
box = new ArrayList<T>(length);
    }

    public Box(ArrayList<T> box) {
        this.box = box;
    }

    public void add(T item){
        box.add(item);
    }
    public float getWeight(){
        float wholeWeight = 0f;
        for (int i = 0; i < box.size(); i++) {
           wholeWeight +=box.get(i).Weight;
        }
        return wholeWeight;
    }
    public ArrayList<T> pour(){
        ArrayList<T> newlist = new ArrayList<T>(box.size());
        for (int i = 0; i < box.size(); i++) {
            newlist.add(box.get(i));
        }
        return newlist;
    }
    public  Boolean compare (ArrayList<T> list){
        float weight1 = 0f;
        float weigth2 = 0f;
        if (list != null && box != null) {
            for (int i = 0; i < box.size(); i++) {
                weight1 += box.get(i).Weight;
            }
            for (int i = 0; i < list.size(); i++) {
                weigth2 += list.get(i).Weight;
            }
        }
        else
            throw new NullPointerException();

        return weight1 == weigth2;
    }
}
