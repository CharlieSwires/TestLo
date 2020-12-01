import java.util.List;

public class Node {
    public long value;
    public List<Node> childs;
    public long getValue() {
        return value;
    }
    public void setValue(long value) {
        this.value = value;
    }
    public List<Node> getChilds() {
        return childs;
    }
    public void setChilds(List<Node> childs) {
        this.childs = childs;
    }
}
