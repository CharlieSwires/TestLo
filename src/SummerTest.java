import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SummerTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void test1() {
        Node node1 = new Node();
        node1.value = 10;
        node1.childs = null;
        System.out.println(new Summer().summer(node1));

    }
    @Test
    void test2() {
        Node node1 = new Node();
        node1.value = 10;
        node1.childs = new ArrayList<Node>();
        
        Node node2 = new Node();
        node2.value = 9;
        node1.childs.add(node2);
        node2.childs = null;
        
        System.out.println(new Summer().summer(node1));

    }
    @Test
    void test3() {
        Node node1 = new Node();
        node1.value = 10;
        node1.childs = new ArrayList<Node>();
        
        Node node2 = new Node();
        node2.value = 9;
        node1.childs.add(node2);
        node2.childs = new ArrayList<Node>();
        
        Node node3 = new Node();
        node3.value = 8;
        node2.childs.add(node3);
        node3.childs = null;
        System.out.println(new Summer().summer(node1));

    }

}
