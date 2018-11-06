import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayImplement<E> implements StackInt<E> {

    private ArrayList<E> list;

    public ArrayImplement(){
        list = new ArrayList<>();
    }

    public E push(E obj){
        list.add(obj);
        return obj;
    }

    @Override
    public E peek() {
        if (this.empty()){
            throw new EmptyStackException();
        }

        return list.get(list.size() - 1);
    }

    public E pop(){
        if (this.empty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
   }

    @Override
    public boolean empty() {
        if (list.size() == 0){
            return true;
        }
        return false;
    }

    public String toString(){
        String st = "";
        for (int i = 0; i < list.size(); i++) {
            st += list.get(i) + " ";
        }
        return st;
    }
}
