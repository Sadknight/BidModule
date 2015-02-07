package beansForWorkBD;

import org.primefaces.model.TreeNode;

import java.util.List;

/**
 * Created by DMalenkov on 21.10.2014.
 */
public class FullTree implements TreeNode {
    @Override
    public String getType() {
        return null;
    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public List<TreeNode> getChildren() {
        return null;
    }

    @Override
    public TreeNode getParent() {
        return null;
    }

    @Override
    public void setParent(TreeNode treeNode) {

    }

    @Override
    public boolean isExpanded() {
        return false;
    }

    @Override
    public void setExpanded(boolean expanded) {

    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public void setSelected(boolean value) {

    }

    @Override
    public boolean isSelectable() {
        return false;
    }

    @Override
    public void setSelectable(boolean selectable) {

    }

    @Override
    public boolean isPartialSelected() {
        return false;
    }

    @Override
    public void setPartialSelected(boolean value) {

    }

    @Override
    public String getRowKey() {
        return null;
    }

    @Override
    public void setRowKey(String rowKey) {

    }
}
