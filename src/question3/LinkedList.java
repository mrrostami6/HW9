package question3;

public final class LinkedList {
    private Node first;
    private Node last;

    public void add(String value){
        var node = new Node(value);
        if (isEmpty())
            first = last = node;
        else {
            last.setNext(node);
            last = node;
        }
    }

    public boolean remove(String item){
        if (isEmpty()) return false;
        if (!removeFirst(item)) {
            var previous = first;
            var current = previous.getNext();
            while (current != null) {
                if (current.getValue().equals(item)) {
                    var second = current.getNext();
                    current.setNext(null);
                    previous.setNext(second);
                    return true;
                }
                previous = current;
                current = previous.getNext();
            }
        }
        else return true;
        return false;
    }

    public boolean removeFirst(String item){
        if (!isEmpty() && first.getValue().equals(item)) {
            var second = first.getNext();
            first.setNext(null);
            first = second;
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public boolean contains(String item){
        var current = first;
        while (current != null){
            if (current.getValue().equals(item))
                return true;
            current = current.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        var current = first;
        while (current != null){
            result.append(current.getValue()).append(",");
            current = current.getNext();
            if (current == null)
                result.delete(result.length() - 1, result.length());
        }
        return "[" + result + "]";
    }
}
