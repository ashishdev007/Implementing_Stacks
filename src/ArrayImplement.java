import java.util.ArrayList;

public class ArrayImplement<E> implements StackInt<E> {

    private ArrayList<E> list;

    public ArrayImplement(){
        list = new ArrayList<>();
    }

    public E push(E obje){
        return (E) "as";
    }

    @Override
    public E peek() {
        return null;
    }

    public E pop(){
       return (E) "Ssf";
   }

    @Override
    public boolean empty() {
        if (list.size() == 0){
            return true;
        }
        return false;
    }
}
