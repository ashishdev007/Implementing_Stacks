import java.util.NoSuchElementException;

public class LinkedStack<E> implements StackInt<E>{
    
        private class Node<E>{

            private E data;
            private Node<E> next;

            private Node(E data){
                this.data = data;
                this.next = null;
            }
            
        }

        private Node<E> startOfStack = null;

    @Override
    public E push(E obj) {
        if (empty()){
            startOfStack = new Node<>(obj);
        }else {

            Node<E> current = new Node<>(obj);
            current.next = startOfStack;
            startOfStack = current;
        }
        return obj;
    }

        @Override
        public E pop() {
            if (empty()){
                throw new NoSuchElementException();
            }
            E value = startOfStack.data;
            startOfStack = startOfStack.next;
            return value;
        }

        @Override
        public E peek() {
            if (empty()){
                throw new NoSuchElementException();
            }
            return startOfStack.data;
        }

        @Override
        public boolean empty() {
            return startOfStack == null;
        }

        public String toString(){
            String result = "";
            if (empty()){
                return null;
            }else {
                Node<E> current = startOfStack;
                result += current.data + " ";
                while (current.next != null){
                    current = current.next;
                    result += current.data + " ";
                }
                return result;
            }
        }
}
    
