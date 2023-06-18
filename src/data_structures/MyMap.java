package data_structures;

class MapNode {

    Object key, val;

    public MapNode(Object key, Object val) {
        this.key = key;
        this.val = val;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }
}

public class MyMap {

    private MapNode[] nodes;
    private int size = 0, currPosition = 0;

    public MyMap() {}

    public void put(Object key, Object val) {

        if (size == 0) {
            size++;
            nodes = new MapNode[size];
            nodes[currPosition] = new MapNode(key, val);
        } else {
            size++;
            MapNode[] tempNodes = new MapNode[size];

            for (int i = 0; i < nodes.length; ++i) {
                tempNodes[i] = nodes[i];
            }

            tempNodes[currPosition] = new MapNode(key, val);
            nodes = tempNodes;
        }

        currPosition++;
    }

    // Use floyd's tortoise and hare algo here
    public Object get(Object key) {

        if (size == 0) return -1;

        for (int i = 0; i < size; i++) {
            if (nodes[i].getKey() == key)
                return nodes[i].getVal();
        }

        return -1;
    }

    public Object[] keys() {

        Object[] keys = new Object[size];

        for (int i = 0; i < size; ++i) {
            keys[i] = nodes[i].getKey();
        }

        return keys;
    }

    public int size() {
        return this.size;
    }
}
