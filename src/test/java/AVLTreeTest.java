import org.junit.Test;
import referat.AVLTree;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class AVLTreeTest {

    @Test
    public void testInsertion() {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        List<Integer> result = new ArrayList<>();
        tree.inorder(result::add);
        assertEquals(List.of(10, 20, 25, 30, 40, 50), result);
    }

    @Test
    public void testDeletion() {
        AVLTree tree = new AVLTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        tree.delete(50);
        tree.delete(30);

        List<Integer> result = new ArrayList<>();
        tree.inorder(result::add);
        assertEquals(List.of(10, 20, 25, 40), result);
    }

    @Test
    public void testBalancing() {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        List<Integer> result = new ArrayList<>();
        tree.inorder(result::add);
        assertEquals(List.of(10, 20, 30), result);

        tree.insert(40);
        tree.insert(50);

        result.clear();
        tree.inorder(result::add);
        assertEquals(List.of(10, 20, 30, 40, 50), result);
    }
}
