
public class Summer {
    public long summer(Node child) {
        if (child.childs == null || child.childs.size() ==0 ) {
            return child.value;
        }
        else {
            long sum = child.value;
            for(Node ch: child.childs) {
                sum+=summer(ch); //next level
            }
            return sum;
        }

    }
}
